package com.example.beratbadanidealtasya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var  input1 : EditText
    private lateinit var  input2 : EditText
    private lateinit var  rblk : RadioButton
    private  lateinit var rbpr : RadioButton
    private lateinit var  Btnsimpan : Button
    private lateinit var  hasil : TextView

    private var tinggibadan : Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input1 = findViewById(R.id.txtnama)
        input2 = findViewById(R.id.txttinggi)
        rblk = findViewById(R.id.rbLK)
        rbpr = findViewById(R.id.rbPR)
        Btnsimpan = findViewById(R.id.btnproses)
        hasil = findViewById(R.id.txthasil)

        //onclick listener
       Btnsimpan.setOnClickListener{
           var tinggi = input2.text.toString().toInt()

           if(rblk.isChecked){
               tinggibadan = (tinggi-100)-((tinggi-100)*10/100)
               hasil.setText(tinggibadan.toString()+"kg")
           } else {
               tinggibadan = (tinggi-100)-((tinggi-100)*15/100)
               hasil.setText(tinggibadan.toString()+"kg")
           }
    }
}
}