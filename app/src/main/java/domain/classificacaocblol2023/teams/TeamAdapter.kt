package domain.classificacaocblol2023.teams

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import domain.classificacaocblol2023.R

class TeamAdapter(val teams: List<Team>) : Adapter<TeamAdapter.TeamViewHolder>() {

    private var teamListener: TeamItemListener? = null

    fun setTeamListener(listener: TeamItemListener) {
        this.teamListener = listener
    }

    class TeamViewHolder(view: View, teamListener: TeamItemListener?) : ViewHolder(view) {
        val logo: ImageView = view.findViewById(R.id.item_iv_logo)
        val name: TextView = view.findViewById(R.id.item_tv_name)
        val victory: TextView = view.findViewById(R.id.item_tv_victory)
        val defeat: TextView = view.findViewById(R.id.item_tv_defeat)

        init {
            view.setOnClickListener {
                teamListener?.onTeamClickListener(view, adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_team, parent, false)
        return TeamViewHolder(view, this.teamListener)
    }

    override fun getItemCount(): Int = teams.size

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.logo.setImageResource(teams[position].logo)
        holder.name.text = teams[position].name
        holder.defeat.text = "D: ${teams[position].defeat.toString()}"
        holder.victory.text = "V: ${teams[position].victory.toString()}"
    }

}