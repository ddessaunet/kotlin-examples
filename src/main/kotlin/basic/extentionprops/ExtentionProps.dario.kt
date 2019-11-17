package main.kotlin.basic.extentionprops

import java.math.BigDecimal

fun main(args: Array<String>) {

}

fun higherOrder(f: (Int, Int) -> Int) {

    val float = 10F

    val bd = 10.BD

}

private val Int.BD: BigDecimal
    get() {
        return BigDecimal(this)
    }