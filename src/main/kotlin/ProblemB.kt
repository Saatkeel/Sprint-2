class ProblemB {

    fun main() {
        val numberOfRows = readInt()

        for(i in 0 until numberOfRows)
        {
            val input : IntArray= readIntArray(2)
            var rowSize = input[0] // размер строки
            var startChar = 97
            while(rowSize!=0){
                val seqSize = input[1] // количество символов в последовательности
                print(startChar.toChar())
                startChar++
                if(startChar-seqSize==97)
                    startChar=97
                rowSize--
            }
            println()
        }
    }

}