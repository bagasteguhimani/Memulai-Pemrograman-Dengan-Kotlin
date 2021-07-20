data class DataUser(val name : String, val age : Int, val alamat : String)

fun main(){
    val dataUser = DataUser("nrohmen", 17, "PKU")

    val name = dataUser.component1()
    val age = dataUser.component2()
    val comp3 = dataUser.component3()

    println("My name is $name, I am $age years old alamat $comp3")
}