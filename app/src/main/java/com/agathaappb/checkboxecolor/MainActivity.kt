package com.agathaappb.checkboxecolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.check
import kotlin.check

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check.setOnClickListener {
            if(check.isChecked){
                imagem.setColorFilter(resources.getColor(R.color.rosa))
                check.setTextColor(resources.getColor(R.color.rosa))
        }
            else{
                imagem.setColorFilter(resources.getColor(R.color.android))
                check.setTextColor(resources.getColor(R.color.android))
            }


    }


        
    }




    
}
