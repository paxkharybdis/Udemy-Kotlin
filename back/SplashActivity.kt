package org.nathanthomas.anothercalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 10000)
    }
}
