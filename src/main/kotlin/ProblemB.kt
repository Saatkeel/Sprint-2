class ProblemB {

    fun main() {
        val numberOfRows = readInt()

        for(i in 0 until numberOfRows)
        {
            val(a,b) = readLine()!!.split(' ')
            var rowSize = a.toInt()
            var startChar = 97
            while(rowSize!=0){
                val seqSize = b.toInt()
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