package app.babachan.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        guuButton.setOnClickListener {
            player.text = "あなたの手はグーです"
            val number: Int = Random.nextInt(3)

            when (number){
                0 -> {cpu.text = "相手の手はグーです"
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                1-> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f4336"))
                }

                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }

        }

        chokiButton.setOnClickListener {
            player.text = "あなたの手はグーです"
            val number: Int = Random.nextInt(3)

            when (number){
                0 -> {cpu.text = "相手の手はグーです"
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                1-> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f4336"))
                }

                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }

        }

        paaButton.setOnClickListener {
            player.text = "あなたの手はグーです"
            val number: Int = Random.nextInt(3)

            when (number){
                0 -> {cpu.text = "相手の手はグーです"
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                1-> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f4336"))
                }

                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }

        }
    }
}