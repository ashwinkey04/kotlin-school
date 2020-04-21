![GitHub top language](https://img.shields.io/github/languages/top/ashwinkey04/kotlin.svg?color=blue)
![GitHub last commit](https://img.shields.io/github/last-commit/ashwinkey04/kotlin.svg?color=green)

# Kotlin Learning repo:sparkles:
This is my repository for learning Kotlin. I will try to push every piece of code that helps me learn Kotlin here. Apps I built using kotlin can be found [here](https://github.com/ashwinkey04/MyAndroidSchool)

**References:** [Envato tuts+](https://code.tutsplus.com/series/kotlin-from-scratch--cms-1209) | [Getting started doc on android](https://developer.android.com/kotlin/learn) | [Kotlin Docs](https://kotlinlang.org/docs/reference/)

### Variable vs Value
```kotlin
var nameofvar:Int =5 //Variable declaration syntax
val nameofval:Int =5 //Value declaration syntax
//Variables can be changed while values can not be
```
### Ranges inside loop
```kotlin
for(i in 1..5){
  }
for(i in 1.rangeTo(5)){
  }
//above loops are in range 1 to 5
for(i in 10.downTo(1)){
  }
//the above loop ranges in decreasing order from 10 to 1
for(i in 1..10  step 2 ) // 1, 3, 5, 7, 9
```
### **Null Safety**
Kotlin is a null safe language! It can not hold null values by default unless explicitly mentioned.
```kotlin 
val x:Int = null //Throws an error
val x:Int ?= null //Suffixing ? to a type accepts null
//Since the '?' operator is used for specifying nullability,
//conditional operator does not exist in kotlin
```
##### Safe call
```kotlin
val b: String? = null
println(b?.length)// '?.' safe call operator
```
This returns `b.length` if `b` is not null, and _null_ otherwise. The type of this expression is `Int?`.
##### Elvis

When we have a nullable reference `b`, we can say "if `b` is not null, use it, otherwise use some non-null value":
```kotlin
val l = b?.length ?: -1 //'?:' elvis operator
//here b will use -1 if it is null
```
##### Not-null assertion (!!)
```kotlin
val l = b!!.length
```
The not-null assertion operator (`!!`) converts any value to a non-null type and throws a NPE if the value is null.
### :smiling_imp::smiling_imp: 

##### Collections of Nullable Type
If you have a collection of elements of a nullable type and want to filter non-null elements, you can do so by using  `filterNotNull`:
```kotlin
val nullableList: List<Int?> = listOf(1, 2, null, 4)
val intList: List<Int> = nullableList.filterNotNull() //1,2,4
```
### **Functions**
![image](https://user-images.githubusercontent.com/20596763/79878215-cfdb0c00-840a-11ea-86e4-fd3f094f1383.png)
 
 Above function can also be written as
```kotlin
fun add(a: Int, b: Int) = a + b
```
##### Extension Functions

* An extension function is a member function of a class that is defined outside the class. 
```kotlin
fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)
```
