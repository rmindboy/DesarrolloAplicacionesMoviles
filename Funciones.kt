//---------------------------------------------------------------------------------------------------------------------------------------------------
//Funciones y tipos de funciones:

    //Funcion con sintaxis tradicional
    //fun sum(a: Int, b: Int): Int {
        //return a + b
    //}
    // se declara tipo de retorno y usa bloque return

    //Funcion de una sola expresión
    //fun sum(x: Int, y: Int) = x + y
    // mas concisa. kotlin infiere el tipo de retorno automaticamente

    //Funcion de orden superior
    //fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int{
        //return operation(x,y)
    //}
    // recibe otra funcion como parametro, base para trabajar con lambdas

    // funcion lambda o anonima
    //val sum = {a: Int, b: Int -> a + b }
    //Funcion sin nombre que puede almacenarse en una variable. Muy usada en colecciones y callbacks


// tipo 1: suma
// tipo 2: resta
// tipo 3: multiplicacion
// tipo 4:  division
fun operacion(num1: Int, num2: Int, tipo:Int, operacionARealizar: (Int, Int) -> Int): Int{
    if(tipo != 4){
        println("=========================================================================")
        println("resultado:")
        return operacionARealizar(num1,num2)

    }else{
        println("=========================================================================")
        print("operacion del tipo division\n")
        if(num2 == 0){
            println("\nNo es posible dividir por 0")
            return 545

        }else{

            println("resultado: ")
            return operacionARealizar(num1,num2)

        }

    }

}

fun main(){
    println(operacion(1,1, 1) {x,y -> x+y})
    println(operacion(1,0, 4){x,y -> x/y})
    println(operacion(1,1, 4){x,y -> x/y})
}