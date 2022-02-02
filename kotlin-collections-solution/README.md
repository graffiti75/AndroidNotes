# Collections

# Topics
- Collections, Lists, Set, Map, Matrix, Tree
- Arrays

## Basic Requirements
Complete all the exercises, write the algorithms and make sure the unit tests pass:

## Exercise 1. Find all anagrams in a string (Medium)
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

    Example 1:
    Input: s = "cbaebabacd", p = "abc"
    Output: [0,6]
    Explanation:
    The substring with start index = 0 is "cba", which is an anagram of "abc".
    The substring with start index = 6 is "bac", which is an anagram of "abc".

    Example 2:
    Input: s = "abab", p = "ab"
    Output: [0,1,2]
    Explanation:
    The substring with start index = 0 is "ab", which is an anagram of "ab".
    The substring with start index = 1 is "ba", which is an anagram of "ab".
    The substring with start index = 2 is "ab", which is an anagram of "ab".

## Exercise 2. Roman number to integer (Easy)
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
          Symbol       Value
          I             1
          V             5
          X             10
          L             50
          C             100
          D             500
          M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
  I can be placed before V (5) and X (10) to make 4 and 9.
  X can be placed before L (50) and C (100) to make 40 and 90.
  C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

    Example 1:
    Input: s = "III"
    Output: 3

    Example 2:
    Input: s = "IV"
    Output: 4

    Example 3:
    Input: s = "IX"
    Output: 9

    Example 4:
    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.

    Example 5:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


## Exercise 3. Symmetric Tree (Easy)
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
    Example 1:

    Input: root = [1,2,2,3,4,4,3]
    Output: true

    Example 2:
    Input: root = [1,2,2,null,3,null,3]
    Output: false

## Exercise 3. Max Increase to Keep City Skyline (Medium)
There is a city composed of n x n blocks, where each block contains a single building shaped like a vertical square prism. You are given a 0-indexed n x n integer matrix grid where grid[r][c] represents the height of the building located in the block at row r and column c.
A city's skyline is the the outer contour formed by all the building when viewing the side of the city from a distance. The skyline from each cardinal direction north, east, south, and west may be different.

We are allowed to increase the height of any number of buildings by any amount (the amount can be different per building). The height of a 0-height building can also be increased. However, increasing the height of a building should not affect the city's skyline from any cardinal direction.

Return the maximum total sum that the height of the buildings can be increased by without changing the city's skyline from any cardinal direction.

    Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
    Output: 35
    Explanation: The building heights are shown in the center of the above image.
    The skylines when viewed from each cardinal direction are drawn in red.
    The grid after increasing the height of buildings without affecting skylines is:
    gridNew = [ [8, 4, 8, 7],
    [7, 4, 7, 7],
    [9, 4, 8, 7],
    [3, 3, 3, 3]]

    Input: grid = [[0,0,0],[0,0,0],[0,0,0]]
    Output: 0
    Explanation: Increasing the height of any building will result in the skyline changing.



## Resources

- [Collections in Kotlin](https://kotlinlang.org/docs/collections-overview.html)
- [Arrays in Kotlin](https://www.tutorialspoint.com/kotlin/kotlin_arrays.htm)
- [Arrays API](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/)

## Notes

_This is a student project that was created at [CodeOp](http://CodeOp.tech), an android development bootcamp in Barcelona._
