 //Implementa una función que devuelva el mínimo común múltiplo de dos enteros.
fun mcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val resto = x % y
        x = y
        y = resto
    }
    return x
}

fun mcm(a: Int, b: Int): Int {
    return a / mcd(a, b) * b //MCM(a, b) = (a × b) ÷ MCD(a, b)
}

fun main() {
    println("MCM: ${mcm(23, 148)}")
}
