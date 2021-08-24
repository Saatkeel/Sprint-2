class ProblemA {

    fun main() {
        val numberOfFrogs = readInt() // сколько лягушек надо посчитать
        for(i in 0 until numberOfFrogs)
        {
            val(a,b,c) = readLine()!!.split(' ')
            val stepForward : Long =a.toLong()
            val stepBack : Long =b.toLong()
            val iterations = c.toLong()

            val odd = iterations.toInt() % 2
            val distance = stepForward * (iterations/2+odd) - stepBack * (iterations / 2)
            println(distance)
        }
    }

}