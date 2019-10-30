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

fun miniMaxSum(arr: Array<Long>): Unit {
    var sum: Long =arr.sum()
    var mx: Long=0
    var mn: Long=100000000000000000
    for(i in 0..4){
        if (arr[i]>mx){
            mx=arr[i]
        }
        if(arr[i]<mn){
            mn=arr[i]
        }
    }
    
    var summx: Long = sum-mn
    var summn: Long = sum-mx
    print(summn)
    print(' ')
    print(summx)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()
    miniMaxSum(arr)
}
