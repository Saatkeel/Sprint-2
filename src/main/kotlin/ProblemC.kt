class ProblemC {

    fun main() {

        val numberOfStudents = readInt()
        val array : IntArray = readIntArray(numberOfStudents)
        array.sortDescending()
        var countResult = 0
        for(i in 0 until numberOfStudents step 2)
            countResult=countResult + array[i]-array[i+1]
        println(countResult)
    }

}