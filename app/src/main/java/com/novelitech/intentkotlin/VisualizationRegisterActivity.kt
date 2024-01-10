package com.novelitech.intentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novelitech.intentkotlin.databinding.ActivityVisualizationRegisterBinding

class VisualizationRegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVisualizationRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVisualizationRegisterBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGoToVisualizeInformation.setOnClickListener {
            finish()
        }

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")

        binding.etName.text = "Name: $name"
        binding.etAge.text = "Age: $age"
        binding.etCountry.text = "Country: $country"
    }
}