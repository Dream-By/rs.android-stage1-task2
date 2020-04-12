package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val fibonacciSequence = generateSequence(Pair(0, 1)) {
            if (it.first * it.second >= n)
                null
            else
                Pair(it.second, it.first + it.second)
        }
        val (min, max) = fibonacciSequence.last()
        return intArrayOf(min, max, if (n == min * max) 1 else 0)
    }

}
