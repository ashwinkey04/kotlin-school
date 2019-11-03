package tk.imagingens.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val clearButton: Button = findViewById(R.id.clear_button)

        rollButton.setOnClickListener() {
            Toast.makeText(this, "Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
            rollButton.text = getString(R.string.RollIt)
        }
        clearButton.setOnClickListener(){
            clearDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }
    private fun clearDice(){
        diceImage.setImageResource(R.drawable.empty_dice)
    }
    private fun rollDice() {
        clear_button.visibility = View.VISIBLE
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
