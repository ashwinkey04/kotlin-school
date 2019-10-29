import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun miniMaxSum(arr: Array<Int>): Unit {
    var sum: Long
    var summx: Long=0
    var summn: Long=1000000000000000000
    for (i in 0..4){
        sum=0
        for (a in 0..4){
            if (a!=i) {
                sum+=arr[a]
            }
        }
        if (summx<sum){
            summx=sum
        }
        else if (summn>sum){
            summn=sum
        }
    }
    print(summn)
    print(" ")
    print(summx)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    miniMaxSum(arr)
}
