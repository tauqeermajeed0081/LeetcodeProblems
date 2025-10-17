package org.example

fun isPalindrome(x: Int): Boolean {
    var intString = x.toString()
    if (x < 0) {
        intString = (x*-1).toString()
    }

    return x.toString().equals(intString.reversed())
}