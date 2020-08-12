// repeat関数はfor文に近い,　同じことを引数の数だけ繰り返す
fun main() {
    printBorder()
    println("Happy Birthday, Jhansi!")
    printBorder()
}

fun printBorder(){
    repeat(23){
        print("=")
    }
    println()
}

// =======================
// Happy Birthday, Jhansi!
// =======================
