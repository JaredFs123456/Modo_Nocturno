package com.example.cocina.ui.dish

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.cocina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // --- Paso 1: aplicar el modo guardado antes de cargar la UI
        val prefs = getSharedPreferences("ajustes", MODE_PRIVATE)
        val oscuro = prefs.getBoolean("modo_oscuro", false)
        AppCompatDelegate.setDefaultNightMode(
            if (oscuro) AppCompatDelegate.MODE_NIGHT_YES
            else AppCompatDelegate.MODE_NIGHT_NO
        )

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // --- Paso 2: inflar layout con ViewBinding
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        // --- Paso 3: tu toolbar y fragment (tu código original)
        setSupportActionBar(b.toolbar)
        supportActionBar?.title = "Platillos"

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(b.fragmentContainer.id, DishListFragment())
                .commit()
        }

        // --- Paso 4: configurar el Switch
        b.switchModoOscuro.isChecked = oscuro
        b.switchModoOscuro.text = if (oscuro) "🌙" else "☀️"

        b.switchModoOscuro.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean("modo_oscuro", isChecked).apply()
            AppCompatDelegate.setDefaultNightMode(
                if (isChecked) AppCompatDelegate.MODE_NIGHT_YES
                else AppCompatDelegate.MODE_NIGHT_NO
            )
            b.switchModoOscuro.text = if (isChecked) "🌙" else "☀️"
        }
    }
}
