import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    coroutineScope {

        for (i in 1..1000000) {
            val job2 = launch {
                print(".")
                delay(1)

            }
        }
    }
}