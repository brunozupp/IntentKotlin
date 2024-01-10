package com.novelitech.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novelitech.intentkotlin.databinding.ActivitySecondBinding
import com.novelitech.intentkotlin.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGoBackSecondActivity.setOnClickListener {
            finish()
        }

        binding.btnGoToFourthActivity.setOnClickListener {
            Intent(this, FourthActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}