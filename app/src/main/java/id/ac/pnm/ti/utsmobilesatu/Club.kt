package id.ac.pnm.ti.utsmobilesatu

// data class Club
data class Club(
    val name: String = "",
    val premierLeagueTrophies: Int,
    val faTrophies: Int,
    val eflTrophies: Int,
    val championsLeagueTrophies: Int,
    val europaLeagueTrophies: Int
) {
    val totalTrophies: Int
        get() = premierLeagueTrophies + faTrophies + eflTrophies + championsLeagueTrophies + europaLeagueTrophies

    // extension function recap
    fun recap(index: Int): String {
        return "| ${(index + 1).toString().padStart(3)} | ${name.padEnd(17)} | " +
                "${premierLeagueTrophies.toString().padStart(14)} | " +
                "${faTrophies.toString().padStart(3)} | " +
                "${eflTrophies.toString().padStart(3)} | " +
                "${championsLeagueTrophies.toString().padStart(16)} | " +
                "${europaLeagueTrophies.toString().padStart(13)} |"
    }
}
