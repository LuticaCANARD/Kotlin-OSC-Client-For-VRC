package lutica_oscevent_adapter

class AppKt {
    val greeting: String
        get() {
            return "Hello World????!"
        }
}

fun main(args:Array<String>){
    println(AppKt().greeting)
}