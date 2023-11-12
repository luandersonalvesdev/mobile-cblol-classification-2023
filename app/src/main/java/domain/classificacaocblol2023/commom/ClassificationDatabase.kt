package domain.classificacaocblol2023.commom

import domain.classificacaocblol2023.R
import domain.classificacaocblol2023.teams.Team

object ClassificationDatabase {
    private val teams = listOf(
        Team(
            1,
            "paiN Gaming",
            14,
            4,
            listOf("Wizer", "CarioK", "dyNquedo", "Bvoy", "ProDelta"),
            R.drawable.pain,
        ),
        Team(
            2,
            "RED Kalunga",
            14,
            4,
            listOf("fNb", "Aegis", "Envy", "TitaN", "frostyy"),
            R.drawable.red,
        ),
        Team(
            3,
            "LOUD",
            13,
            5,
            listOf("Robo", "Croc", "tinowns", "Route", "Ceos"),
            R.drawable.loud,
        ),
        Team(
            4,
            "INTZ",
            11,
            7,
            listOf("Zzk", "Yampi", "NOsFerus", "NinjaKiwi", "Nia"),
            R.drawable.intz,
        ),
        Team(
            5,
            "FLUXO",
            11,
            7,
            listOf("Tay", "Ancrath", "hauz", "Brance", "JoJo"),
            R.drawable.fluxo,
        ),
        Team(
            6,
            "Vivo Keyd Stars",
            10,
            8,
            listOf("Guigo", "Sting", "Grevthar", "Trigo", "Damage"),
            R.drawable.keyd,
        ),
        Team(
            7,
            "FURIA",
            8,
            10,
            listOf("Betao", "Goot", "Tutsz", "Ayu", "zay"),
            R.drawable.furia,
        ),
        Team(
            8,
            "Los Grandes",
            6,
            12,
            listOf("Boal", "enel1", "Lava", "Netuno", "Ranger"),
            R.drawable.los,
        ),
        Team(
            9,
            "Liberty",
            2,
            16,
            listOf("Lukshy", "accez", "Piloto", "Juliera", "Strix"),
            R.drawable.liberty,
        ),
        Team(
            10,
            "KaBuM! Esports",
            1,
            17,
            listOf("Lonely", "Samkz", "Krastyel", "scuro", "RedBert"),
            R.drawable.kabum,
        )
    )

    fun getTeams() = this.teams

    fun getTeamById(id: Int) = teams.find { it.id == id }
}