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
fun plusMinus(arr: Array<Int>, n: Int): Unit {
    var neg: Double = 0.0
    var pos: Double = 0.0
    var zer: Double = 0.0
    for(a in 0..n) { // .. operator used for specifying range
        if (arr[a]>0){
            pos=pos+1.0
        }
        else if (arr[a]<0){
            neg=neg+1.0
        }
        else {
            zer=zer+1.0
        }
    }
    var n0 = n+1
    println(pos/n0)
    println(neg/n0)
    println(zer/n0)
}
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var k = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    k=k-1
    plusMinus(arr,k)
}