fun main(){
    println("ciclo 1:")
    for(i in 1..10){
        println("el valor actual de i es: ")
        println(i)
    }

    println("ciclo 2:")
    var a: Int = 1
    for(i in 1..20){
        a += 1
        println("ahora sumare uno a " + a)
        println(a)
    }

    println("ejercicio 1: ")
    for(i in 1..20){
        if (i == 5){
            continue
        }else if(10 < i && i < 20){
            continue
        }else{
            println(i)
        }

    }

    // for in en kotlin
    val lista = listOf(7,3,15)
    println("lista: $lista")

    for(i in lista){
        println("valor i: $i")
    }

    val map =  mapOf("a" to 2, "b" to 3)
    map.forEach{
        (llave, valor) -> println("la llave es $llave el valor es $valor")
    }
}