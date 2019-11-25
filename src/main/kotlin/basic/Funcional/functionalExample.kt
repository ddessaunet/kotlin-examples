package basic.Funcional

fun main(args: Array<String>){
    val numbers = (1..100_000).toList()

    val list = mutableListOf<String>()
    for(it in numbers) {
        if(it % 16 == 0) {
            list.add("0x" + it.toString(16))
        }
    }

    println(list)
}