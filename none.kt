
//none() returns true if there are no elements in the list.
//none() returns true if no element matches the provided predicate.

fun main(){

    val allFalse = listOf(false , false , false , false , false)

    //since no value is true ie, no element matches the predicate.
    val isAllFalse = allFalse.none{
        it == true 
    }

    println("is all false -- $isAllFalse")

    val listOfNonPrimeNumbers = listOf(4,6,8,10,12,14) 
    val listOfNonPrimeNumbersWithAPrimeNumber = listOf(2,4,5,6,8,10,12,14)

    //will return true since not even a single element confirms true for the predicate.
    var isNoneOfTheNumberAPrime = listOfNonPrimeNumbers.none{
        isNumberAPrime(it)
    }

    println("None of The Numbers are prime for a list of Non Prime Numbers = $isNoneOfTheNumberAPrime")

    //will return false as 1 element will confirm true for the predicate.
    isNoneOfTheNumberAPrime = listOfNonPrimeNumbersWithAPrimeNumber.none{
        isNumberAPrime(it)
    }
    println("None of the numbers are prime for a list of non prime number with a prime number = $isNoneOfTheNumberAPrime")
}

fun isNumberAPrime(num : Int) : Boolean{
    if(num == 0 || num == 1) return false
    if(num == 2 || num == 3) return true

    for (i in 2..(num/2)) {
        if(num%i == 0) return false 
    }
    return true 
}