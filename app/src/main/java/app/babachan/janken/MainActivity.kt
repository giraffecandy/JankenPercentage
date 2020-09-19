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

                when (number) {
                    0 -> {
                        cpu.setImageResource(R.drawable.goo)
                        editor.putString("Draw", "引き分け")
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

//gooButton.setOnClickListener {
////            player.text = "あなたの手はグーです"
//
////                    result.text = "引き分けです"
////                    result.setTextColor(Color.parseColor("#8a000000"))
//
//
////                    result.text = "あなたの勝ちです"
////                    result.setTextColor(Color.RED)
//}
//
//cpu.setImageResource(R.drawable.paa)
////                    result.text = "あなたの負けです"
////                    result.setTextColor(Color.parseColor("#2196f3"))
//}
//}
//}
//
//chokiButton.setOnClickListener {
//    player.text = "あなたの手はチョキです"
//    val number: Int = (0..2).random()
//
//    when (number) {
//        0 -> {
//            cpu.setImageResource(R.drawable.choki)
//            result.text = "引き分けです"
//            result.setTextColor(Color.parseColor("#8a000000"))
//        }
//
//        1 -> {
//            cpu.setImageResource(R.drawable.paa)
//            result.text = "あなたの勝ちです"
//            result.setTextColor(Color.RED)
//        }
//
//        2 -> {
//            cpu.setImageResource(R.drawable.goo)
//            result.text = "あなたの負けです"
//            result.setTextColor(Color.parseColor("#2196f3"))
//        }
//    }
//
//}
//
//paaButton.setOnClickListener {
//    player.text = "あなたの手はパーです"
//    val number: Int = (0..2).random()
//
//    when (number) {
//        0 -> {
//            cpu.setImageResource(R.drawable.paa)
//            result.text = "引き分けです"
//            result.setTextColor(Color.parseColor("#8a000000"))
//        }
//
//        1 -> {
//            cpu.setImageResource(R.drawable.goo)
//            result.text = "あなたの勝ちです"
//            result.setTextColor(Color.RED)
//        }
//
//        2 -> {
//            cpu.setImageResource(R.drawable.choki)
//            result.text = "あなたの負けです"
//            result.setTextColor(Color.parseColor("#2196f3"))
//        }
//    }
//
//}

