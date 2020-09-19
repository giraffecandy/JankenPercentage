package app.babachan.janken

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listOf(gooButton, paaButton, chokiButton).forEachIndexed { index, button ->
            button.setOnClickListener {
                val number = (0..2).random()
                val data: SharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE)
                val editor = data.edit()
                val draw = 10
                val win = 11
                val lose = 12

                when (number) {
                    0 -> {
                        cpu.setImageResource(R.drawable.goo)
                        editor.putInt("Draw", draw)
                    }
                    1 -> {
                        cpu.setImageResource(R.drawable.choki)
                        editor.putString("Win", "勝ち")

                    }
                    2 -> {
                        cpu.setImageResource(R.drawable.paa)
                        editor.putString("lose", "負け")
                    }

                }
            }
        }
    }
}

