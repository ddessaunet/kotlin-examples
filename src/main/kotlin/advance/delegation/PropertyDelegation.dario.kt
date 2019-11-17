package main.kotlin.advance.delegation

import kotlin.reflect.KProperty

class Service {
    var delegatedProperty: String by CustomDelegate()
    
}

class CustomDelegate {

    private var backingField = "Default"

    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("getValue called with params: \n" +
                "service: $service\n" +
                "property: ${property.name}")
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, value: String) {
        backingField = value
    }
}

fun main(args: Array<String>) {
    val s = Service()
    s.delegatedProperty = "Joe"
    val s1 = Service()
    println(s1.delegatedProperty)
    println(s.delegatedProperty)
}