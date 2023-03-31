fun main(){
    println(listing(listOf("person","things","make","about","nationality","nature","likes","dislike","happy","finally")))
    println(peoples(listOf(30,15,25,28,39,40,20)))
    someones()
    println(vehecles())
}

//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices
fun listing(name:List<String>):List<String>{
    var listeven= mutableListOf<String>()
    name.forEachIndexed{ index,m ->
        if (index%2==0)
            listeven.add(m)
    }
    return listeven
}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peoples(height:List<Int>):String{
 var a =height.average()
    var b =height.sum()
    var ab=("the height is $a and the average is $b")
    return ab

}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending
data class someone(var name:String,var age:Int,var height:Int,var weight:Double)
fun someones(){
val someone1=someone("Nathalie",22,30,50.0)
val someone2=someone("marrion",19,20,40.0)
val someone3=someone("Anna",35,30,60.0)
val someone4=someone("diva",30,25,30.5)
val persons= listOf(someone1,someone2,someone3,someone4)
val sortedpersons=persons.sortedBy { persons -> persons.age }
    println(sortedpersons)
}


//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun another(){
    fun peopleq(name:String,num:Int){
        val person3=("")
    }
}
//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
class car(var registration:Any,var mileage:Double)
fun vehecles():Double{
    val benz =car("kwz23456",10.0)
    val lexus =car("prd34578",20.0)
    val lemonzin=car("knxe34567",30.0)
    val bmw=car("byy234567",40.0)
    val demvehicles= listOf(benz,lexus,lemonzin,bmw)

    var cars=demvehicles.sumOf { cars -> cars.mileage }
    val average=cars/demvehicles.size
    return average

}
