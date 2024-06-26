package id.ac.pnm.ti.utsmobilesatu

fun main() {
    // Membuat list mutable clubs dan menambahkan data klub
    val clubs = mutableListOf<Club>()
    clubs.add(Club("Liverpool", 19, 8, 9, 6, 3))
    clubs.add(Club("Manchester United", 20, 12, 6, 3, 1))
    clubs.add(Club("Chelsea", 6, 6, 5, 2, 2))
    clubs.add(Club("Manchester City", 8, 8, 8, 0, 0))
    clubs.add(Club("Arsenal", 13, 14, 2, 0, 0))

    // Mengurutkan klub berdasarkan jumlah total trofi
    val sortedClubs = filterAndSort(clubs, ::sortByNumberTrophyTotal)
    println("Urutan klub berdasarkan jumlah total trofi: ")
    println("|-----|-------------------|----------------|")
    println("| No. |       Club        |  Total Trophy  |")
    println("|-----|-------------------|----------------|")
    sortedClubs.forEachIndexed { index, club ->
        println("| ${(index + 1).toString().padStart(3)} | ${club.name.padEnd(17)} | ${club.totalTrophies.toString().padStart(14)} |")
    }
    println("|-----|-------------------|----------------|")

    // Memfilter klub yang belum pernah memenangkan UCL dan UEL
    val filteredClubs = filterAndSort(clubs, ::filterByEuropeanTrophy)
    println("\nKlub yang belum pernah memenangkan UCL dan UEL:")
    filteredClubs.forEachIndexed { index, club ->
        println("${(index + 1).toString().padStart(2)}. ${club.name.padEnd(20)}")
    }
    println()
    // Menampilkan rekap perolehan trofi klub
    println("Rekap Perolehan Trofi Klub:")
    println("|-----|-------------------|----------------|-----|-----|------------------|---------------|")
    println("| No. |       Club        | Premier League | FA  | EFL | Champions League | Europa League |")
    println("|-----|-------------------|----------------|-----|-----|------------------|---------------|")
    clubs.forEachIndexed { index, club ->
        println(club.recap(index))
    }
    println("|-----|-------------------|----------------|-----|-----|------------------|---------------|")
}

// High order function filter and sort
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}

// Fungsi sorting untuk mengurutkan klub berdasarkan jumlah total trofi
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    return clubs.sortedByDescending { it.totalTrophies }
}

// Fungsi filter untuk memfilter klub yang belum pernah memenangkan UCL dan UEL
fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
    return clubs.filter { it.championsLeagueTrophies == 0 && it.europaLeagueTrophies == 0 }
}