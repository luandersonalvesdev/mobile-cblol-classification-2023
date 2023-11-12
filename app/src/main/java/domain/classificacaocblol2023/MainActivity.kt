package domain.classificacaocblol2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import domain.classificacaocblol2023.commom.ClassificationDatabase
import domain.classificacaocblol2023.teams.TeamAdapter
import domain.classificacaocblol2023.teams.TeamItemListener

class MainActivity : AppCompatActivity(), TeamItemListener {

    private val teamsList: RecyclerView by lazy { findViewById(R.id.main_rv_teams) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val teams = ClassificationDatabase.getTeams()

        val adapter = TeamAdapter(teams)

        adapter.setTeamListener(this)

        teamsList.layoutManager = LinearLayoutManager(baseContext)
        teamsList.adapter = adapter
    }

    override fun onTeamClickListener(view: View, position: Int) {
        val it = Intent(baseContext, InfoActivity::class.java)
        it.putExtra("teamId", position)
        startActivity(it)
    }
}