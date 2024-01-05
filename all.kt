//all() returns true if all the elements matches the prdicate.

fun isNumberEvenPredicate(num : Int) = (num%2==0)
fun main(){
    val listOfEvenNumbers = listOf(2,4,6,8,10)

    //Here all numbers satify the predicate condition.
    var isAllNumbersEven = listOfEvenNumbers.all{
        isNumberEvenPredicate(it)
    }
    println("All numbers are even -- $isAllNumbersEven")

    val listOfOneNonEvenNumber = listOf(2,4,6,7,8,10)
    isAllNumbersEven = listOfOneNonEvenNumber.all { 
        isNumberEvenPredicate(it)
     } 
    println("in case of 1 off number -- $isAllNumbersEven")


    /**
     * Special case for an Empty list..
     */

     val emptyListOfEvenNumbers = listOf<Int>() 

     /*
        here even though the list is empty . the all() function would return true for the predicate.
        This is correct since there is no element in the list which violates the predicate
        Hence in case of no elements , all elements are even.

        This concept is called Vacuous Truth . https://en.wikipedia.org/wiki/Vacuous_truth#:~:text=In%20mathematics%20and%20logic%2C%20a,does%20not%20really%20say%20anything.
      */
     isAllNumbersEven = emptyListOfEvenNumbers.all { isNumberEvenPredicate(it) }
     println("in case of empty list -- $isAllNumbersEven")

}