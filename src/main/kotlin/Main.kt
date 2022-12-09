fun main() {
    print(
        solution(
            mutableListOf(
                mutableListOf(1, 2, 1),
                mutableListOf(2, 2, 2),
                mutableListOf(2, 2, 2),
                mutableListOf(1, 2, 3),
                mutableListOf(2, 2, 1)
            )
        )
    )
}

fun solution(matrix: MutableList<MutableList<Int>>): Int {
    val list = mutableListOf<String>()
    var tempString = ""
    for (i in 0 until matrix.size - 1) {
        for (j in 0 until matrix[i].size - 1) {
            for (k in i until i + 2) {
                for (l in j until j + 2) {
                    print("$k,$l - ")
                    tempString += matrix[k][l]
                }
                println()
            }
            println()
            if (!list.contains(tempString)) {
                list.add(tempString)
            }
            tempString = ""
        }
    }
    return list.size
}
