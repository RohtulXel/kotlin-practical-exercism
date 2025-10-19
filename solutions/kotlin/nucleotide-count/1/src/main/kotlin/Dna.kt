class Dna (private val dnaString: String) {

    init {
        if(dnaString.any { char -> !(char in setOf('A', 'C', 'G', 'T')) }) throw IllegalArgumentException("It is an alien DNA!!!")
    }
    

    val nucleotideCounts: Map<Char, Int>
        get() {
            val counts = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)

            dnaString.forEach { char ->
                counts[char] = counts[char]!! + 1
            }

            return counts
        }
}
