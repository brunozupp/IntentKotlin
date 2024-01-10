package com.novelitech.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novelitech.intentkotlin.databinding.ActivityFourthBinding
import com.novelitech.intentkotlin.databinding.ActivityThirdBinding

class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFourthBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGoBackThirdActivity.setOnClickListener {
            finish()
        }

        binding.btnGoToSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

            startActivity(intent)
        }
    }
}