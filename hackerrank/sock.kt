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

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val indx = n - 1 
    var cnt: Int 
    var pair: Int = 0
    val ar0: ArrayList<Int> = arrayListOf<Int>()
    ar.sort()   
    for (i in 0..indx){
        cnt=0
        if (ar0.contains(ar[i])){            
            continue
        }
        for (j in i..indx){
            if(ar[j]==ar[i]){
                cnt=cnt+1
                ar0+=ar[j]                
            }
        }
        if (cnt%2==0){
            pair=pair+(cnt/2)
        }
        else{
            pair= pair+((cnt-1)/2)
        }
    }
    return pair
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
