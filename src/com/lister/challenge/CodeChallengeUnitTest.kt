package com.lister.challenge

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class CodeChallengeUnitTest {
    @Test
    fun reOrderTestPositive1() {
        val oddEvenSorting = OddEvenSorting()
        assertEquals(
            intArrayOf(1, 3, 5, 7, 9, 2, 4, 6, 8).contentToString(),
            oddEvenSorting.reOrder(intArrayOf(2, 5, 1, 4, 3, 6, 8, 7, 9)).contentToString()
        )
    }

    @Test
    fun reOrderTestPositive2() {
        val oddEvenSorting = OddEvenSorting()
        assertEquals(
            intArrayOf(1, 3, 7, 2, 4).contentToString(),
            oddEvenSorting.reOrder(intArrayOf(7, 4, 2, 1, 3)).contentToString()
        )
    }

    @Test
    fun reOrderTestNegative1() {
        val oddEvenSorting = OddEvenSorting()
        assertNotEquals(
            intArrayOf(2, 4, 1, 3, 7).contentToString(),
            oddEvenSorting.reOrder(intArrayOf(7, 4, 2, 1, 3)).contentToString()
        )
    }

    @Test
    fun reOrderTestNegative2() {
        val oddEvenSorting = OddEvenSorting()
        assertNotEquals(
            intArrayOf(1, 2, 3, 4).contentToString(),
            oddEvenSorting.reOrder(intArrayOf(4, 2, 1, 3)).contentToString()
        )
    }

    @Test
    fun uniquePermutationTestPositive1() {
        val uniquePermutations = UniquePermutations()
        val result: MutableList<List<Int>> = ArrayList()
        result.add(listOf(1, 2, 1))
        result.add(listOf(1, 1, 2))
        result.add(listOf(2, 1, 1))
        assertEquals(result, uniquePermutations.permuteUnique(intArrayOf(1, 2, 1)))
    }

    @Test
    fun uniquePermutationTestPositive2() {
        val uniquePermutations = UniquePermutations()
        val result: MutableList<List<Int>> = ArrayList()
        result.add(listOf(1, 2, 3, 3))
        result.add(listOf(1, 3, 2, 3))
        result.add(listOf(1, 3, 3, 2))
        result.add(listOf(2, 1, 3, 3))
        result.add(listOf(2, 3, 1, 3))
        result.add(listOf(2, 3, 3, 1))
        result.add(listOf(3, 2, 1, 3))
        result.add(listOf(3, 2, 3, 1))
        result.add(listOf(3, 1, 2, 3))
        result.add(listOf(3, 1, 3, 2))
        result.add(listOf(3, 3, 1, 2))
        result.add(listOf(3, 3, 2, 1))
        assertEquals(result, uniquePermutations.permuteUnique(intArrayOf(1, 2, 3, 3)))
    }

    @Test
    fun uniquePermutationTestNegative1() {
        val uniquePermutations = UniquePermutations()
        val result: MutableList<List<Int>> = ArrayList()
        result.add(listOf(1, 2, 2))
        result.add(listOf(1, 2, 2))
        result.add(listOf(2, 1, 2))
        result.add(listOf(2, 1, 2))
        result.add(listOf(2, 2, 1))
        result.add(listOf(2, 2, 1))
        assertNotEquals(result, uniquePermutations.permuteUnique(intArrayOf(1, 2, 2)))
    }

    @Test
    fun uniquePermutationTestNegative2() {
        val uniquePermutations = UniquePermutations()
        val result: MutableList<List<Int>> = ArrayList()
        result.add(listOf(1, 2, 1))
        result.add(listOf(1, 2, 1))
        result.add(listOf(1, 1, 2))
        result.add(listOf(1, 1, 2))
        result.add(listOf(2, 1, 1))
        result.add(listOf(2, 1, 1))
        assertNotEquals(result, uniquePermutations.permuteUnique(intArrayOf(1, 2, 1)))
    }
}