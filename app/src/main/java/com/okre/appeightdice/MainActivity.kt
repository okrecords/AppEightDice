package com.okre.appeightdice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.okre.appeightdice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // DataBinding 라이브러리는 Android Gradle 플러그인과 함께 번들로 제공
    // build.gradle 파일에서 dataBinding 빌드 옵션을 true로 설정
    // xml 최상단을 layout 루트 태그로 시작
    private lateinit var binding : ActivityMainBinding // 레이아웃 파일 이름을 기반으로 Binding 접미사를 추가하여 결합 클래스 생성

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        // DataBinding 세팅
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener{
            val randomNumber1 = Random.nextInt(1,7).toString() // from 이상 util 미만
            val diceRage = 1..6 // IntRange : 시작점부터 끝점까지 정수의 범위, 이상 이하
            val randomNumber2 = diceRage.random().toString() // val randomNumber2 = (1..6).random().toString() 한 줄로 표현 가능

            Log.d("MainActivity", randomNumber1)
            Log.d("MainActivity", randomNumber2)

            when (randomNumber1) {
                "1" -> diceImage1.setImageResource(R.drawable.dice_1)
                "2" -> diceImage1.setImageResource(R.drawable.dice_2)
                "3" -> diceImage1.setImageResource(R.drawable.dice_3)
                "4" -> diceImage1.setImageResource(R.drawable.dice_4)
                "5" -> diceImage1.setImageResource(R.drawable.dice_5)
                else -> diceImage1.setImageResource(R.drawable.dice_6)
            }

            when (randomNumber2) {
                "1" -> diceImage2.setImageResource(R.drawable.dice_1)
                "2" -> diceImage2.setImageResource(R.drawable.dice_2)
                "3" -> diceImage2.setImageResource(R.drawable.dice_3)
                "4" -> diceImage2.setImageResource(R.drawable.dice_4)
                "5" -> diceImage2.setImageResource(R.drawable.dice_5)
                else -> diceImage2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}