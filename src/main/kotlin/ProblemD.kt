class ProblemD {

    fun main() {

        val numberOfInputs = readInt()

        for(i in 0 until numberOfInputs) {
            val numberOfClients = readInt()
            val arr : LongArray = readLongArray(numberOfClients.toLong())
            arr.sortDescending()

            var highestSum : Long = 0

            for(element in arr){
                var curSum : Long = 0
                val curPrice = element
                for(k in 0 until arr.size){
                    if(curPrice<=arr[k])
                        curSum += curPrice
                    else
                        break
                }
                if(curSum>highestSum)
                    highestSum=curSum
            }
            println(highestSum)
        }

    }

}