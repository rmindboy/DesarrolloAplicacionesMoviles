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

}