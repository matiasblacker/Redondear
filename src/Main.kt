import java.text.NumberFormat
import kotlin.math.ceil

fun main() {
    // Definir dos números
    val num1: Double = 10.5
    val num2: Float = 20.3f

    // Llamar a la función suma
    val resultadoSuma = suma(num1, num2)
    println("Resultado de la suma: $resultadoSuma")

    // Llamar a la función redondeo
    val numeroARedondear = 25.7
    val resultadoRedondeo = redondeo(numeroARedondear)
    println("Número redondeado hacia arriba: $resultadoRedondeo")

    // Llamar a la función muestraResultado
    muestraResultado(resultadoSuma)
}

// Función que suma un número Double y un número Float
fun suma(num1: Double, num2: Float): Double {
    return num1 + num2.toDouble() // Convertimos float a double para la suma
}

// Función que redondea un número Double hacia arriba
fun redondeo(num: Double): Double {
    return ceil(num) // Usamos la función ceil para redondear hacia arriba
}

// Función que muestra el número formateado como moneda
fun muestraResultado(num: Double) {
    val formattedValue = NumberFormat.getCurrencyInstance().format(num) // Formato de moneda
    println("El resultado formateado como moneda es: $formattedValue")
}
