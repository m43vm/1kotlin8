//Implementa una función que devuelva tantos números 
//primos como se indique en un parámetro entero.
fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun generarPrimos(cantidad: Int): List<Int> {
    val primos = mutableListOf<Int>()
    var num = 2
    while (primos.size < cantidad) { //hasta
        if (esPrimo(num)) primos.add(num)
        num++
    }
    return primos
}

fun main() {
    println(generarPrimos(20))
}
