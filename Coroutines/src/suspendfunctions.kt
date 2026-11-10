import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        simpleFunction()
    }

    Thread.sleep(2000)
}

suspend fun simpleFunction() {
    delay(1000)
    println("Suspend function")
}