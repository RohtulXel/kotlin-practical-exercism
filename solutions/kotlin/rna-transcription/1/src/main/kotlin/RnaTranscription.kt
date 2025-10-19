fun transcribeToRna(dna: String): String = dna.map { letter -> 
    when (letter) {
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else -> throw Exception("It is alian DNA!")
    }
}.joinToString("")
