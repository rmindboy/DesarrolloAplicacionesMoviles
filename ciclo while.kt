fun main(){
    var i: Int = 1
    do{
        println(i)
        i++
    }while(i <= 10)

    var ciclo: Int = 1

    do{
        val numeroRandom = (0..10).random()
        i = i + numeroRandom
        println("ciclo $ciclo = numero actual:  $i")
        ciclo++
    }while(i<=100)

    do{
        if (i % 2 == 0){
            println("i: $i")
        }
        i++
    }while(i<=100)

    do{
        if(i % 2 != 0){
            println("i: $i")
        }
        i++
    }while(i<=100)

}