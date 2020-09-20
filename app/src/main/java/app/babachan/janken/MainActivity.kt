package app.babachan.janken

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val realm: Realm = Realm.getDefaultInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        gooButton.setOnClickListener {
//            player.text = "あなたの手はグーです"
            val number: Int = (0..2).random()
//            val data: SharedPreferences = getSharedPreferences("DataStore", Context.MODE_PRIVATE)
//            val editor = data.edit()
            val intent = Intent(applicationContext, SecondActivity::class.java)

            when (number) {
                0 -> {
                    var countWG = 3
                    intent.putExtra("WinGoo", countWG)
                }

                1 -> {
                    var countLG = count ++
                    intent.putExtra("LoseGoo",countLG)
                }

                2 -> {
                    var countDG = count ++
                    intent.putExtra("DrawGoo", countDG)
                }
            }
            startActivity(intent)
        }

        chokiButton.setOnClickListener {
            player.text = "あなたの手はチョキです"
            val number: Int = (0..2).random()
            val data: SharedPreferences = getSharedPreferences("DataStore", Context.MODE_PRIVATE)
            val editor = data.edit()

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.choki)
                    editor.putInt("DrawChoki", 1)
                }

                1 -> {
                    cpu.setImageResource(R.drawable.paa)
                    editor.putInt("WinChoki", 2)
                }

                2 -> {
                    cpu.setImageResource(R.drawable.goo)
                    editor.putInt("LoseChoki", 0)
                }
            }

        }

        paaButton.setOnClickListener {
            player.text = "あなたの手はパーです"
            val number: Int = (0..2).random()
            val data: SharedPreferences = getSharedPreferences("DataStore", Context.MODE_PRIVATE)
            val editor = data.edit()

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.paa)
                    editor.putInt("DrawPaa", 1)
                }

                1 -> {
                    cpu.setImageResource(R.drawable.goo)
                    editor.putInt("WinPaa", 2)
                }

                2 -> {
                    cpu.setImageResource(R.drawable.choki)
                    editor.putInt("LosePaa", 0)
                }
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }
}

