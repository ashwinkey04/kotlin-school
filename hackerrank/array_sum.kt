import java.io.*
import java.math.*
import java.text.*
import java.util.* //Scanner comes inside this library
import java.util.regex.*


fun simpleArraySum(ar: Array<Int>): Int {
    return ar.sum()
    //Built in function which returns the sum of an array
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val result = simpleArraySum(ar)
    println(result)
}


