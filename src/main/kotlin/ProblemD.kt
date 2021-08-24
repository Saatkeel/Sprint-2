class ProblemD {

    fun main() {

        val numberOfInputs = readInt()

        for(i in 0 until numberOfInputs) {
            val numberOfClients = readInt()
            val arr : LongArray = readLongArray(numberOfClients.toLong())
            arr.sort()
            var highestSum : Long = 0
            var multiplier = arr.size

            for(element in arr){
                val curSum = element * multiplier
                if(curSum>highestSum)
                    highestSum=curSum
                multiplier--

            }
            println(highestSum)
        }

    }

}