![GitHub top language](https://img.shields.io/github/languages/top/ashwinkey04/kotlin.svg?color=blue)
![GitHub last commit](https://img.shields.io/github/last-commit/ashwinkey04/kotlin.svg?color=green)

# Kotlin Learning repo ✨
This is my repository for learning Kotlin. I will try to push every piece of code that helps me learn Kotlin here. Apps I built using kotlin can be found [here](https://github.com/ashwinkey04/MyAndroidSchool)

**References:** 
[Envato tuts+](https://code.tutsplus.com/series/kotlin-from-scratch--cms-1209) | [Getting started doc on android](https://developer.android.com/kotlin/learn) | [Kotlin Docs](https://kotlinlang.org/docs/reference/)

### Variable vs Value
```kotlin
var nameofvar:Int =5 // Variable declaration syntax
val nameofval:Int =5 // Value declaration syntax
// Variables can be changed while values can not be
```
### Ranges inside loop
```kotlin
for(i in 1..5){
  }
for(i in 1.rangeTo(5)){
  }
// above loops are in range 1 to 5
for(i in 10.downTo(1)){
  }
// the above loop ranges in decreasing order from 10 to 1
for(i in 1..10  step 2 ) // 1, 3, 5, 7, 9
```
### **Null Safety**
Kotlin is a null safe language! It can not hold null values by default unless explicitly mentioned.
```kotlin 
val x:Int = null //Throws an error
val x:Int ?= null //Suffixing ? to a type accepts null
// Since the '?' operator is used for specifying nullability,
// conditional operator does not exist in kotlin
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
val l = b?.length ?: -1 // '?:' elvis operator
// here b will use -1 if it is null
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
### Collections

<a href="https://kotlinlang.org/docs/reference/collections-overview.html"><img src="https://user-images.githubusercontent.com/20596763/80363212-80309080-88a1-11ea-89a1-8334b3377719.png" width=540></a>
###### *Representation of parent classes of different collections in kotlin* (Click on image for docs)

#### Arrays (Mutable)
```kotlin
var myArray = arrayOf(4, 5, 7, 3, "Chike", false) //Mixed array with different data types
var myArray = arrayOf<Int>(4, 5, 7, 3) //Contains only int as explicitly mentioned. Can also use intArrayOf()
```
##### Array() constructor (mind the uppercase 'A')
```kotlin
var newArray = Array (10,{i->i*2}) //Contains 0,2,4,6,..16,18
// Array(<size_of_array>,lambda_def)
```
#### Lists
By default lists are immutable
 ```kotlin
var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
var names: List<String> = listOf("Chike", "Nnamdi", "Mgbemena")
var mix = listOf(1,2,3,4,"Ash",true)
val emptyList: List<String> = emptyList<String>() //Creates an empty list
val nonNullsList: List<String> = listOfNotNull(2, 45, 2, null, 5, null) //Creates a list excluding null elements
```
For mutable list
 ```kotlin
 var mutableNames1 = names.toMutableList() //Converts immutable list to mutable
 var newlist:List<Int> = mutableListOf(1,2,3)
 ```
Member functions
 ```kotlin
println(list.size) // returns size of list
println(list.get(0)) // returns element at 0 index in the list
println(list.indexOf(3)) // returns index of 3 in list
println(list.contains(3)) // returns boolean for presence of 3 in list
```
Functions for mutable lists
 -   `set(index: Int, element: E)`: substitutes an element in the list with another element. This returns the element previously at the specified position.  
-   `add(index: Int, element: E)`: inserts an element at the specified index.
-   `removeAt(index: Int)`: gets rid of the element at a particular index.
- `remove(element: E)`: deletes the element specified.
 ```kotlin
val mutableListFood:  MutableList<String>  = mutableListOf<String>("Rice & stew",  "Jollof rice",  "Eba & Egusi",  "Fried rice")
mutableListFood.remove("Fried rice")
mutableListFood.removeAt(0)
mutableListFood.set(0,"Beans")
mutableListFood.add(1,"Bread & tea")
 ```
 ### Sets
* **Immutable** by default, **doesn't have repititive elements**
  ```kotlin
  val mixedTypesSet = setOf(2, 4.454, "how", "far", 'c', 2)
  print(mixedTypesSet) // 2, 4.454, how, far, c
  ```
  
| Function | Returned object type | Additional Remarks |
|--|--|--|
| `hashSetOf()` | Java `HashSet` collection | Becomes mutable, stored in a hash table |
| `sortedSetOf()` | Java `TreeSet` collection | Becomes sorted |
| `linkedSetOf()` | Java `LinkedHashSet` type | Maintains a linked list of the entries in the set, in the order in which they were inserted |
| `mutableSetOf()` | Kotlin `MutableSet` interface (Java `LinkedHashSet` type) | The `MutableSet` interface extends both the `MutableCollection` and the `Set` interfaces |


 ### Maps
 * Maps are lists of pairs (keys and values: usually denoted as *key to value*)
 
  ```kotlin
  var n = mapOf(1 to "One", 2 to "Two", 3 to 3.33) //immutable
  println(n)//{1=One, 2=Two, 3=3.33}
  for((a,b) in n){
        println("$a is $b")
    }
/*
1 is One
2 is Two
3 is 3.33
*/

val newmap: MutableMap<String, String> = mutableMapOf("A" to "Alpha", "B" to "Beta", "G" to "Gamma")
println("Greek is ${newmap.values}") // Greek is [Alpha, Beta, Gamma]
println("Letters are ${newmap.keys}") // Letters are [A, B, G]
//member functions
newmap.put("M","mu") // Adds a key,value pair
newmap.remove("G") // Removes at specified key
```

* Maps don't extend any interface unlike the other collections above
* Using `hashMapOf()` function returns a Java `HashMap` type that is mutable
* Using the `linkedHashMap()` function returns a Java `LinkedHashMap` type that is mutable and maintains a linked list of the entries in the map in the order in which they were inserted
* Using `sortedMapOf()` function returns a Java `SortedMap` type that maintains the entries in ***ascending key order***

### Collections Operation Functions

  ```kotlin
val a = mutableListOf(1,2,3,8,9,4,5)
    println(a.first()) // Returns the first value of the collection
    println(a.last()) // Returns the last value of the collection
    println(a.max()) // Returns the maximum value of the collection
    println(a.drop(3)) // Drops the first n elements (3 here) of the collections and returns a colection of the rest
    println(a.plus(9)) //Returns a new collection including n 
    println(a.minus(9)) //Returns a new collection excluding all instances of n 
    println(a.average()) //Returns the average value of the collection

//OUTPUT
1 
5 
9 
[8, 9, 4, 5] 
[1, 2, 3, 8, 9, 4, 5, 9] 
[1, 2, 3, 8, 4, 5] 
4.571428571428571
```
