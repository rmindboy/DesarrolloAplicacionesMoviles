fun main(){
    // listOf es inmutable
    var lista1 = listOf<Int>(1,2,3,4,5)

    // mutableListOf es mutable
    var lista2 = mutableListOf<Int>(1,2,3,4,5)

    lista2.add(6)

    println("Lista inmutable: " + lista1 + "\nLista mutable: " + lista2)

    // setOf es inmutable
    var set1 = setOf<Int>(1,2,3,4,5)

    // mutableSetOf es mutable
    var set2 = mutableSetOf<Int>(1,2,3,4,5)

    //los set no agregan los duplicados
    println("set inmutable: " + set1 + "\nset mutable: " + set2)

    // mapOf es inmutable
    var map1 = mapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4, "e" to 5)

    // mutableSetOf es mutable
    var map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4, "e" to 5)

    //.put(x, y) sirve para añadir una llave y su respectivo valor a un mutablemap
    map2.put("a", 2)

    //los map agregan duplicados solo en los valores, no en las llaves
    println("map inmutable: " + map1 + "\nmap mutable: " + map2)

    //filtrar listas
    val filtrado = lista2.filter{it % 2 == 0}
    println("lista mutable filtrada para que solo muestre pares: "+ filtrado)

    //.map ordenar una operacion a una lista
    val doble =  lista2.map {it * 2}
    val masdos = lista2.map {it + 2}

    println("lista mutable con sus valores multiplicados por dos: $doble")
    println("lista mutable con sus valores aumentados en dos: $masdos")

    //.sum suma todos los elementos de la lista
    val sumalista = lista2.sum()
    val sumadoble =  doble.sum()
    val sumamasdos = masdos.sum()

    println("suma de todos los valores de la lista mutable: $sumalista")
    println("suma de todos los valores de la lista mutable duplicada: $sumadoble")
    println("suma de todos los valores de la lista mutable aumentada en 2: $sumamasdos")

    // .find busca el elemento que cumpla cierta condicion
    var n = 2
    println("ahora buscare el primer elemento divisible por 2 que encuentre en la lista mutable: " + lista2.find{it % 2 == 0})

    //.last() trae el ultimo elemento de una lista
    println("ahora traere el ultimo elemento de la lista mutable: " + lista2.last())

    //.first() trae el primer elemento de una lista
    println("ahora traere el primer elemento de la lista mutable: " + lista2.last())


    // ejercicio
    var lista = mutableListOf(3, 5, 45, 9, 2, 30)

    var listaimpares = lista.filter{it % 2 != 0}



}
