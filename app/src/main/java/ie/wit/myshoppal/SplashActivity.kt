package ie.wit.myshoppal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//I used https://www.youtube.com/watch?v=GtE8NwOQoos
//for the splashscreen
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(applicationContext, MainActivity::class.java))//render activity after splash screen
        finish()
    }
}