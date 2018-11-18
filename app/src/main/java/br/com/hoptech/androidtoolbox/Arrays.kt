package br.com.hoptech.androidtoolbox


fun arraysTests() {

    val names = arrayOf(
        "Carlos",
        "Luiz",
        "Rodolfo",
        "Sandra"
    )

    for (name in names) {
        println(name)
    }

    for ((index, name) in names.withIndex()) {
        println("$index - $name")
    }
}
