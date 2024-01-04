//checks if any of the element in the list satisfies the predicate.

data class CarDetails(
    val name : String = "",
    val color : String = ""
)
fun main(){
    val listOfNumbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val doesItContainEvenNumber = listOfNumbers.any{
        (it % 2 == 0) 
    }

    val listOfCars = listOf<CarDetails>(
        CarDetails("honda civic" , "black"),
        CarDetails("swift" , "red")
    )

    val containsSwiftCar = listOfCars.any{
        (it.name == "swift")
    }

    println("does it contain even numbers -- $doesItContainEvenNumber")
    print("does card details have swift -- $containsSwiftCar")
}
