package com.example.spisok_jyvotnyh
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val spisok = mutableListOf<Any>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val baran = Travoyadnoe("baran", "parnokopytnoe")
        val osel = Travoyadnoe("osel", "parnokopytnoe")
        val tigr = Hishnik("tigr", "agressivny")
        val lev = Hishnik("lev", "agressivny")
        spisok.add(baran)
        spisok.add(osel)
        spisok.add(tigr)
        spisok.add(lev)
        printOnScreen()
    }
        fun printOnScreen() {
            // инициализируем переменную типа TextView
            val textView: TextView = findViewById(R.id.textView)
            // присваиваем текстовое значение коллекции, на экран будут выведены все уникальные названия(id) объектов
            textView.text = spisok.toString()

        }


        class Travoyadnoe(var name: String, val semeystvo: String)
        class Hishnik(var name: String, val harakter: String)

        }
