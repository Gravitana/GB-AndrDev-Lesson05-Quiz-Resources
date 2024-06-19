package ru.gravitana.quiz_fa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gravitana.quiz_fa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.welcome.text = buildString {
            append(getString(R.string.app_name))
            append(" ")
            append(getString(R.string.app_version))
        }
    }
}