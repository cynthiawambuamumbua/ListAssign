import javax.management.MBeanRegistration

fun main(){
    nums()
    persons()
    var heights= listOf(123.56,675.43,671.23,67.43)
    heights.average()
    heights.sum()
    person()
    mileage()




}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.eindex 2,4,6 etc
fun nums(){
    val string= listOf(1,2,3,4,5,6,7,8,9,10)
    val evenList=string.filter { num->num%2==0 }
    println(evenList)
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class AverageHeights(var height:Double,val totalHeights: Double)
fun averageHeights(){
    val height= listOf(45.7,12.4,79.2,17.8,89.9,102.5)
    val avg=height.average()
    var totalHeights=height.sum()
    return averageHeights()
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class personObjects(val name:String,val age:Int,val height: Double,val weight:Double)
fun persons(){
    val person1=personObjects("Cynthia",19,112.4,55.8)
    val person2=personObjects("Jeff",22,87.9,79.9)
    val person3=personObjects("Elizabeth",65,56.7,76.1)
    val personObjects= listOf(person1,person2,person3)
    val persons=personObjects.sortedByDescending { personObjects -> personObjects.age }
    println( persons)
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
data class persons(val name: String,val age: Int,val height: Double,val weight: Double)
fun person(){
    val x=persons("Mungai",15,112.4,43.6)
    val person2=persons("henry",54,145.8,89.8)
    val persons= listOf(x,person2)
    println(persons.joinToString {persons->persons.toString() })

}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class carObjects(val registration: String, val mileageAttribute: Int)
fun mileage(){
    var car=carObjects("couple",256)
    var car1=carObjects("private",786)
    var car2=carObjects("private",987)
    var carObjects= listOf(car,car1,car2)
    var mileage=carObjects.forEach { carObjects -> carObjects.mileageAttribute}
    println(carObjects)
}


