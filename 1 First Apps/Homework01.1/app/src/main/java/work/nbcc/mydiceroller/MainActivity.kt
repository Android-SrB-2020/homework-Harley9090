package work.nbcc.mydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        var countButton: Button = findViewById(R.id.countUp_button)
        countButton.setOnClickListener{Count()}
    }

    private fun rollDice(){
        var randomInt = Random().nextInt(6) + 1

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        var resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun Count(){
        if(result_text.text == "Hello World"){
            result_text.text = "1"
        }
        else{
            var countup = result_text.text.toString().toInt()

            if(countup < 6){
                countup++
                result_text.text = countup.toString()
            }
        }
    }
}
