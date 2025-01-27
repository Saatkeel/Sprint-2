
fun readln() = readLine()!!

fun readInt() = readln().toInt()
fun readLong() = readln().toLong()
fun readStrings() = readln().trim().split(" ")

fun readIntArray(size:Int) = readStrings().run { IntArray(size) { get(it).toInt() } }
fun readLongArray(size:Long) = readStrings().run { LongArray(size.toInt()) { get(it).toLong() } }

fun readListInt() = readStrings().map { it.toInt() }
fun readListLong() = readStrings().map { it.toLong() }