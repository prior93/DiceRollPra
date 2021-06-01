package com.example.dicerollerprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnRoll.setOnClickListener {
            diceRoll()
        }

    }

    private fun diceRoll() {
        var randomNumber = (1..6).random()
        var imageOfDice:Int

        tvDisplay.setText("Your Dice is $randomNumber")
        when(randomNumber) {
            1 -> { imageOfDice = R.drawable.dice_1 }
            2 -> { imageOfDice = R.drawable.dice_2
            }
            3 -> {
                imageOfDice = R.drawable.dice_3
            }
            4 ->{
                imageOfDice = R.drawable.dice_4
            }
            5 -> {
                imageOfDice = R.drawable.dice_5
            }
            else -> {
                imageOfDice = R.drawable.dice_6
            }
        }
        ivDice.setImageResource(imageOfDice)
        Toast.makeText(this," Your Dice is Rolled !!", Toast.LENGTH_LONG).show()


    }
}