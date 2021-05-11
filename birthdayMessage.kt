fun main() {
	printMessage("Philip")

}

fun printMessage(name: String) {
    printBorder()
    println("Happy Birthday, ${name}!")
    printBorder()
    
    var age = 12
    var layers = 6
    var candles = age
    
    printCandles(candles)
    printIcing(candles)
    printCake(layers, candles)
}

fun printBorder() {
    repeat(23) {
        print('-')
    }
    println("")
}

fun printCandles(candles: Int) {
    var i = 0
    repeat(candles + 2) {
        if(i == 0 || i == candles + 1) {
            print(" ")
        } else {
            print(",")
        }
        i++
    }
    println("")
    i = 0
    repeat(candles + 2) {
        if(i == 0 || i == candles + 1) {
            print(" ")
        } else {
            print("|")
        }
        i++
    }
    println("")
}

fun printIcing(candles: Int) {
    repeat(candles + 2) {
         print("=")   
    }
    println("")
}

fun printCake(layers: Int, candles: Int) {
    repeat(layers) {
        repeat(candles + 2) {
            print("@")
        }
        println("")
    }
}
