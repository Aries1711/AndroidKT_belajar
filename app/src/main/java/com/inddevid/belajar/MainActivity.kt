package com.inddevid.belajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.belajar_wallpaper)
        val imageBg: ImageView = findViewById(R.id.bg_id)
        Glide.with(this).load(R.drawable.belajar).into(imageBg);
    }
}