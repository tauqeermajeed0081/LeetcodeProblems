package org.example

//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

/*
I did with sorting. in this the strings are sorted and first and last give me the first and last str.
The last one will be the least matching so match that one with the first one
 */
fun longestCommonPrefix(strs: Array<String>): String {
    val sorted = strs.sorted()
    val first  = sorted.first()
    val last = sorted.last()
    var i = 0
    while (i < first.length && i < last.length && first[i] == last[i]){
            i++
    }
    return first.substring(0, i)
}

fun longestCommonPrefixMinMax(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    for (s in strs) if (s.isEmpty()) return ""

    val min = strs.minOrNull()!!
    val max = strs.maxOrNull()!!

    var i = 0
    val limit = min.length.coerceAtMost(max.length)
    while (i < limit && min[i] == max[i]) i++

    return min.substring(0, i)     // single substring allocation
}