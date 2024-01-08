package com.example.mylibapplicationtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrarytest.ToasterMessage

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        ToasterMessage.s(this@MainActivity,"Hello ndfgdsjf djf sdgf sdgf jsdgfjgsdf sd fh fsd h gfdsgfhsdg fjsdgfjgsdhf")

    }
}
