object Luhn {

    fun isValid(candidate: String): Boolean {
        val sanitized = candidate.filter { it != ' ' }
        if(sanitized.length < 2) return false
        if (sanitized.any{ char -> !(char in '0'..'9') }) return false
        val last = sanitized.substring(sanitized.length - 1).toInt()
        val mainpart = sanitized.substring(0, sanitized.length-1)
        val (multiplied, simple) = mainpart.withIndex().partition { (index, char) ->  index % 2 == sanitized.length % 2 }
        val simpleSum = simple.sumOf { (_, char) -> char.digitToInt() }
        val multipliedSum = multiplied.sumOf { (_, char) ->
            val doubled = char.digitToInt() * 2
            if (doubled > 9) doubled - 9 else doubled
        }
        
        return (10 - ((simpleSum + multipliedSum) % 10)) % 10 == last
    }
}
