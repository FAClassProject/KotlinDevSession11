package com.aptech.kotlindevsession11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val means constant just like final key work in Java(Immutable)
        val name = 'f'
        val number2 = 45
        val  number4 = 0.45



        val  x: Char
        x ='K'
        print(x)

        val nameDemo  = arrayOf("Obi","Inemesit","Ekom","Sam")
        for (value in nameDemo){
            println("Printing value $value ")
        }

        System.out.println(name)

        var name2 = "name2"
        println(name2)
        println(name)
    }
    fun  name(){

    }

}
