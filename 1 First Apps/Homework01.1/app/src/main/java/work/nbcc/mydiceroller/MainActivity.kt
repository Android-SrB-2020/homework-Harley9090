package work.nbcc.mydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice(){
        var randomInt = Random().nextInt(6) + 1
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        var resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
}
