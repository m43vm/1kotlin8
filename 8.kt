//Implementa una función que indique si un número es igual a 
//la suma de sus dígitos elevados a la cantidad de dígitos.
import kotlin.math.pow
fun esSumaPotencias(numero: Int): Boolean {
    val digitos = numero.toString()
    val cantidad = digitos.length //cantidad de digitos
    var suma = 0
    for (d in digitos) {
        suma += d.digitToInt().toDouble().pow(cantidad).toInt()
    }//suma cada digito elevado a la cantidad de digitos
    return suma == numero//si si true si no false
}

fun main() {
    println(esSumaPotencias(125))
}
