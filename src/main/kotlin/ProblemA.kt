class ProblemA {

    fun main() {
        val numberOfFrogs = readInt() // сколько лягушек надо посчитать
        for(i in 0 until numberOfFrogs)
        {
            val input : LongArray= readLongArray(3)
            val stepForward=input[0]
            val stepBack =input[1]
            val iterations =input[2]

            val odd = iterations % 2
            val distance = stepForward * (iterations/2+odd) - stepBack * (iterations / 2)
            println(distance)
        }
    }

}