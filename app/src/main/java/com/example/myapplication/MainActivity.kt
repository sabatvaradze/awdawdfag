package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.ArrayList


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var gilaki1 : Button
    private lateinit var gilaki2 : Button
    private lateinit var gilaki3 : Button
    private lateinit var gilaki4 : Button
    private lateinit var gilaki5 : Button
    private lateinit var gilaki6 : Button
    private lateinit var gilaki7 : Button
    private lateinit var gilaki8 : Button
    private lateinit var gilaki9 : Button
    private lateinit var resGilaki : Button

    private var activePlayer = 1

    private var firstPlayer = ArrayList<Int>()

    private var secondPlayer = ArrayList<Int>()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }
    private fun init() {
        gilaki1 = findViewById(R.id.gilaki1)
        gilaki2 = findViewById(R.id.gilaki2)
        gilaki3 = findViewById(R.id.gilaki3)
        gilaki4 = findViewById(R.id.gilaki4)
        gilaki5 = findViewById(R.id.gilaki5)
        gilaki6 = findViewById(R.id.gilaki6)
        gilaki7 = findViewById(R.id.gilaki7)
        gilaki8 = findViewById(R.id.gilaki8)
        gilaki9 = findViewById(R.id.gilaki9)
        resGilaki = findViewById(R.id.resGilaki)

        gilaki1.setOnClickListener(this)
        gilaki2.setOnClickListener(this)
        gilaki3.setOnClickListener(this)
        gilaki4.setOnClickListener(this)
        gilaki5.setOnClickListener(this)
        gilaki6.setOnClickListener(this)
        gilaki7.setOnClickListener(this)
        gilaki8.setOnClickListener(this)
        gilaki9.setOnClickListener(this)
        resGilaki.setOnClickListener(this)

    }
    override fun onClick(clickedView: View?) {
        var buttonNumber = 0
        if (clickedView is Button) {
            when(clickedView.id) {
                R.id.gilaki1 -> buttonNumber = 1
                R.id.gilaki2 -> buttonNumber = 2
                R.id.gilaki3 -> buttonNumber = 3
                R.id.gilaki4 -> buttonNumber = 4
                R.id.gilaki5 -> buttonNumber = 5
                R.id.gilaki6 -> buttonNumber = 6
                R.id.gilaki7 -> buttonNumber = 7
                R.id.gilaki8 -> buttonNumber = 8
                R.id.gilaki9 -> buttonNumber = 9


            }
            if (buttonNumber != 0 ){
                playGame(clickedView, buttonNumber)
            }

            }

        }

    private fun playGame(clickedView: Button, buttonNumber: Int) {
            if (activePlayer == 1){
                clickedView.text = "X"
                clickedView.setBackgroundColor(Color.BLUE)
                activePlayer = 2
                firstPlayer.add(buttonNumber)
            }else{
                clickedView.text = "0"
                clickedView.setBackgroundColor(Color.MAGENTA)
                activePlayer = 1
                secondPlayer.add(buttonNumber)
            }
            clickedView.isEnabled = false
            check()
    }
    private fun check(){
        var winnerPlayer = 0
        if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }
        if (winnerPlayer == 1){
            Toast.makeText(this, "moigo player 1 ma", Toast.LENGTH_SHORT).show()
        }
        if (winnerPlayer ==2){
            Toast.makeText(this, "moigo player 2 ma", Toast.LENGTH_SHORT).show()
        }

        }
    }




