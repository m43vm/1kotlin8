//Implementa una función que realice la descomposición en factores 
//primos de un número entero devolviendo un array de números primos.
fun descomponerEnPrimos(n: Int): List<Int> {
    var numero = n
    val factoresPrimos = mutableListOf<Int>()
    var i = 2
    while (numero > 1) {
        while (numero % i == 0) {
            factoresPrimos.add(i) 
            numero /= i
        }
        i++
    }
    return factoresPrimos
}

fun main() {
    println(descomponerEnPrimos(60))
}
