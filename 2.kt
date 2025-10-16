// Calcula el máximo común divisor de dos enteros
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

fun main() {
    println("MCD: ${mcd(2, 128)}")
}
