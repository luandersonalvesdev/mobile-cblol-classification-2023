package domain.classificacaocblol2023.teams

data class Team(
    val id: Int,
    val name: String,
    val victory: Int,
    val defeat: Int,
    val players: List<String>,
    val logo: Int,
)