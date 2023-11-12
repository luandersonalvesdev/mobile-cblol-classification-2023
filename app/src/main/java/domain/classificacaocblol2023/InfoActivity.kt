package domain.classificacaocblol2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import domain.classificacaocblol2023.commom.ClassificationDatabase

class InfoActivity : AppCompatActivity() {

    private val logo: ImageView by lazy { findViewById(R.id.info_iv_logo) }
    private val name: TextView by lazy { findViewById(R.id.info_tv_name) }
    private val victory: TextView by lazy { findViewById(R.id.info_tv_victory) }
    private val defeat: TextView by lazy { findViewById(R.id.info_tv_defeat) }
    private val p1: TextView by lazy { findViewById(R.id.info_tv_p1) }
    private val p2: TextView by lazy { findViewById(R.id.info_tv_p2) }
    private val p3: TextView by lazy { findViewById(R.id.info_tv_p3) }
    private val p4: TextView by lazy { findViewById(R.id.info_tv_p4) }
    private val p5: TextView by lazy { findViewById(R.id.info_tv_p5) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val teamId = intent.getIntExtra("teamId", 0)
        val team = ClassificationDatabase.getTeamById(teamId + 1)!!

        logo.setImageResource(team.logo)
        name.text = team.name
        victory.text = "V: ${team.victory}"
        defeat.text = "D: ${team.defeat}"
        p1.text = team.players[0]
        p2.text = team.players[1]
        p3.text = team.players[2]
        p4.text = team.players[3]
        p5.text = team.players[4]
    }
}