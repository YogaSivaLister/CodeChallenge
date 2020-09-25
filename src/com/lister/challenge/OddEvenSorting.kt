package com.lister.challenge

class OddEvenSorting {

    fun reOrder(inputArray: IntArray): IntArray {
        val oddIndexEnd = rearrangeOddAndEven(inputArray)
        //Sorting Odd numbers
        sortWithIndex(0, oddIndexEnd, inputArray)
        //Sorting Even numbers
        sortWithIndex(oddIndexEnd + 1, inputArray.size - 1, inputArray)
        return inputArray
    }

    //Sorting array with from index and to index
    private fun sortWithIndex(fromIndex: Int, toIndex: Int, numbers: IntArray) {
        for (pass in fromIndex until (toIndex)) {
            for (currentPosition in fromIndex until (toIndex)) {
                if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                    swap(numbers, currentPosition, currentPosition + 1)
                }
            }
        }
    }

    //Rearranging array with Odd numbers first and Even numbers next.
    private fun rearrangeOddAndEven(numbers: IntArray): Int {
        var j: Int = -1
        for (currentPosition in 0 until (numbers.size)) {
            if (numbers[currentPosition] % 2 != 0) {
                j++
                swap(numbers, currentPosition, j)
            }
        }
        return j
    }
}