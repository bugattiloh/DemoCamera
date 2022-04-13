package ru.rut.democamera

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.rut.democamera.databinding.ActivityLaunchBinding

class LaunchActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLaunchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, CameraFragment())
            .addToBackStack(null)
    }

}