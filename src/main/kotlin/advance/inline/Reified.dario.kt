// https://www.wikiwand.com/en/Type_erasure
// https://kotlinlang.org/docs/reference/inline-functions.html#reified-type-parameters
// https://dev.to/cjbrooks12/kotlin-reified-generics-explained-3mie
// https://workingdev.net/2018/09/reified-generics-in-kotlin.html

package main.kotlin.advance.inline

fun main(args: Array<String>) {
    val mlist = listOf(Programmer("Ted"), Tester("Steph"))
    val mprogs = mlist.typeOf<Programmer>()
    val mprogs2 = mlist.javaTypeOf(Programmer::class.java)

    mprogs.forEach {
        println("${it.toString()} : ${it.javaClass.simpleName}")
    }

    mprogs2.forEach {
        println("${it.toString()} : ${it.javaClass.simpleName}")
    }
}

fun <T> List<*>.javaTypeOf(clazz: Class<T>) : List<T> {

    val retlist = mutableListOf<T>()
    this.forEach(fun (value) {
        if (clazz.isInstance(value)) {
            @Suppress("UNCHECKED_CAST")
            retlist.add(value as T)
        }
    })
    return retlist;
}

inline fun <reified T> List<*>.typeOf() : List<T> {

    val retlist = mutableListOf<T>()
    this.forEach {
        if (it is T) {
            retlist.add(it)
        }
    }
    return retlist
}

open class Employee(val name:String) {
    override fun toString(): String {
        return name
    }
}

class Programmer(name:String) : Employee(name) {}
class Tester(name:String) : Employee(name) {}