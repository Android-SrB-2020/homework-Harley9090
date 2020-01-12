package work.nbcc.mydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)

        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        //var countButton: Button = findViewById(R.id.countUp_button)
       // countButton.setOnClickListener{Count()}

       // var resetButton:Button = findViewById(R.id.reset_button)
       // resetButton.setOnClickListener{Reset()}
    }

    private fun rollDice(){
        var randomInt = Random().nextInt(6) + 1
       // val diceImage: ImageView = findViewById(R.id.dice_image)


        var drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }

    //private fun Count(){
        //if(result_text.text == "Hello World"){
         //   result_text.text = "1"
       // }
       // else{
       //     var countup = result_text.text.toString().toInt()

          //  if(countup < 6){
             //   countup++
               // result_text.text = countup.toString()
            //}
       // }
   // }

   // private fun Reset(){
    //    result_text.text = "0"
   // }
}
