package com.chehhy.fruit

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

//무식하게 Activity많이 만들었다... 다른 방법은 Fruit2_inflearn에서 해보자!!!
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LOW_PROFILE or
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        //안드로이드 앱을 띄우는 Window의 속성을 변경하여 작업표시줄 등의 시스템 UI를 숨기고 전체화면으로 표시 (제목 바같은거 안띄우고 예쁘게 만들기!)

        //1.화면을 클릭할 수 있게 하기
        val image1 = findViewById<ImageView>(R.id.img1) //ImageView타입을 가진 id가 img1인 객체를 찾아 image1에 넣는다
        image1.setOnClickListener { //image1이 클릭이 되었을 때 어떻게 할건지
            Toast.makeText(this, "1번 사진 클릭 완료", Toast.LENGTH_LONG).show() //토스트 메세지(작은 알림창같은거)를 띄운다

            //2.화면이 클릭되면, 다음 화면으로 넘어가기
            var intent = Intent(this, Img1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.img2)
        image2.setOnClickListener{
            var intent = Intent(this, Img2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.img3)
        image3.setOnClickListener{
            var intent = Intent(this, Img3Activity::class.java)
            startActivity(intent)
        }
    }
}