package com.lister.challenge

fun main() {
    val oddEvenSorting = OddEvenSorting()
    println(oddEvenSorting.reOrder(intArrayOf(2, 5, 1, 4, 3, 6, 8, 7, 9)).contentToString())

    val uniquePermutations = UniquePermutations()
    println(uniquePermutations.permuteUnique(intArrayOf(1, 2, 1)))
}

//Swapping elements in an array
fun swap(numbers: IntArray, currentPosition: Int, swapPosition: Int) {
    val temp = numbers[currentPosition]
    numbers[currentPosition] = numbers[swapPosition]
    numbers[swapPosition] = temp
}