//Implementa una función que realice la descomposición en factores 
//primos de un número entero devolviendo una lista de números primos.
fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun primerosPrimos(count: Int): List<Int> {
    val primos = mutableListOf<Int>()
    var num = 2
    while (primos.size < count) {
        if (esPrimo(num)) primos.add(num)
        num++
    }
    return primos
}

fun main() {
    println(primerosPrimos(10))
}
