package ...

fun main() {
    // Inisialisasi mutableList dan tambah data List
    val clubs = ...
    clubs.add(...)
    dst...

    // Passing a named function ::sortByNumberTrophyTotal
    val sortedClubs = ...
    // Hasil sorting total trofi
    println("Urutan klub berdasarkan jumlah total trofi: ")
    for (club in ...) {
        ...
    }

    // Passing a named function ::filterByEuropeanTrophy
    val filteredClubs = ...
    // Hasil sorting total trofi
    println("Klub yang belum pernah memenangkan UCL dan UEL:")
    for (club in ...) {
        ...
    }

    // Panggil extension function Club recap
    println(...)
}

// High order function filter and sort
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return ...
}

// Fungsi sorting
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    val sortedClubs = clubs.sortedByDescending {
        ...
    }
    return sortedClubs

}

// Fungsi filter
fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
    val filteredClubs = clubs.filter {
        ...
    }
    return filteredClubs
}