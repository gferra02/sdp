object WordCount {

    fun phrase(phrase: String): Map<String, Int> {

        // Found this bit online: https://github.com/exercism/kotlin/tree/master/exercises/word-count

        val noPunctuation = phrase.toLowerCase().replace(Regex("[^\\w']"), " ").trim()

        val words = noPunctuation.split(Regex("\\s+"))

        val groupedWords = words.groupBy({ w -> w })

        // I need to add a check for double and single quotes

        // val noQuotes

        return groupedWords.mapValues({ it.value.size })

    }

}