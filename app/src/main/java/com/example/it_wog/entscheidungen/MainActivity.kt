package com.example.it_wog.entscheidungen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var alter = 20
        var login = true
        //if (alter >= 18) textfeld.text = "Ja"
        //if (login) textfeld.text = "Ja" else textfeld.text = "Nein"
        val highscore = 2000
        val aktuellerP = 2100
        val gameover = false
        if (gameover == true) {
            if(highscore > aktuellerP){
                textfeld.text = "Kein neuer Highscore"
            } else {
                textfeld.text = "Gut"
            }
        } else {
            textfeld.text = "Läuft noch!"
        }
    }
}
