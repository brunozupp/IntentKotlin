package com.novelitech.intentkotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novelitech.intentkotlin.databinding.ActivityVisualizationRegisterClassBinding
import java.io.Serializable

class VisualizationRegisterClassActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVisualizationRegisterClassBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVisualizationRegisterClassBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGoToVisualizeInformation.setOnClickListener {
            finish()
        }

        // getSerializableExtra está depreciado a partir do SDK versão 33
        // Por essa questão getSerializable foi criado para chamar o método de acordo com o nível do SDK
        // val person = intent.getSerializableExtra("EXTRA_PERSON") as Person

        val person = getSerializable<Person>(this, "EXTRA_PERSON", Person::class.java)

        binding.etName.text = "Name: ${person.name}"
        binding.etAge.text = "Age: ${person.age}"
        binding.etCountry.text = "Country: ${person.country}"
    }

    fun <T : Serializable?> getSerializable(activity: AppCompatActivity, name: String, clazz: Class<T>): T
    {
        return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
            activity.intent.getSerializableExtra(name, clazz)!!
        else
            activity.intent.getSerializableExtra(name) as T
    }
}