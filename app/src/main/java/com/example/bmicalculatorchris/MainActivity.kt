package com.example.bmicalculatorchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txttitle:TextView
    private lateinit var txtdisplay:TextView
    private lateinit var heighttxt:EditText
    private lateinit var weighttxt:EditText
    private lateinit var calcbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txttitle = findViewById(R.id.bmititle)
        txtdisplay = findViewById(R.id.txtdisplay)
        heighttxt = findViewById(R.id.heighttxt)
        weighttxt = findViewById(R.id.weighttxt)
        calcbtn = findViewById(R.id.calcbutton)

     calcbtn.setOnClickListener {
         var weight = weighttxt.text.toString().toDouble()
         var height = heighttxt.text.toString().toDouble()
         var result = (weight/(height * height))
         txtdisplay.text = result.toString()
     }

