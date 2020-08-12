// 関数の仮引数の型を指定する
// %のような演算子をString型にするとかいうケースで使う

fun main() {
    val border = "%"
    printBorder(border)
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}

fun printBorder(border: String) {  // ここで仮引数の型をStringに固定する
    repeat(23) {
        print(border)
    }
    println()
}

