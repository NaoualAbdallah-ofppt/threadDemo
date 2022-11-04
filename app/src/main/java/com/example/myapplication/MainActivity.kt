package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    val montag:String="MonTag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(montag,Thread.currentThread().name)
//for (i in 1..20000){

            thread {
                Log.i(montag,Thread.currentThread().name)
                Log.i(montag, fctlourde())
            }
            thread {
                Log.i(montag,Thread.currentThread().name)
                Log.i(montag, fcttreslourde()) }
  //      }
        Log.i(montag,"bonjour")

    }
fun fctlourde():String
{
    //on va essayer de simuler une action lourde qui a besoin de
    //10s pour s'exécuter
    // en retardant le thread
    Thread.sleep(10000)
    return "Enfin j'ai fini"
}
    fun fcttreslourde():String
    {

        Thread.sleep(20000)
        return "Enfin j'ai fini la fonction tres lourde"
    }
}