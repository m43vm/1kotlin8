//Implementa una función que devuelva el factorial de un entero.
import java.math.BigInteger
//para que no sea overflow si es un numero muy grande
fun factorial(numero: Int): BigInteger {
    var fac = BigInteger.ONE //=1
    for (i in 1..numero) {
        fac *= i.toBigInteger()
    }
    return fac
}

fun main() {
    println(factorial(50))
}
