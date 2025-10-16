 //Implementa una función que devuelva si un entero es primo o no.
fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    println(esPrimo(7)) 
}
