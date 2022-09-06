package br.com.fiap.imageglide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    lateinit var imageGlide: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageGlide = findViewById(R.id.image_glide)

        val url = "https://media-exp1.licdn.com/dms/image/C4D03AQFByebpuVgxMw/profile-displayphoto-shrink_800_800/0/1578918482599?e=1668038400&v=beta&t=0S9NuSMmhHbmh4eADVVEAM4KxYQx6xVLLabE84Cy4Vk"
        Glide.with(this).load(url).into(imageGlide)
    }
}