package br.com.hoptech.androidtoolbox

fun main(args: Array<String>) {

    /*
    Collections:
        - List -> Imutable, fixed lenght, only for read
        - ArrayList -> Mutable, writable
        - Set -> Not allow duplicated elements, fastar than ArrayList, not maintain the order
        - Map -> Is an implementation of key/value
     */

    var listStates = listOf("RJ", "SP", "SC", "RS")
    println(listStates)

    var arrListStates = arrayListOf("RJ", "SP", "SC", "RS")
    arrListStates.add("BA")
    arrListStates.remove("SP")
    arrListStates.removeAt(0)
    arrListStates[0] = "DF"
    println(arrListStates)
    println(arrListStates.size)

    var cities = hashSetOf("Lisboa", "Almada", "Porto", "Aveiro", "Aveiro")
    println(cities)
    for (city in cities) println(city)

    var mapStates = hashMapOf(
        "RJ" to "Rio de Janeiro",
        "SP" to "São Paulo",
        "SC" to "Santa Catarina"
    )
    mapStates.put("DF", "Distrito Federal")
    mapStates.remove("SP")

    println(mapStates)
    println(mapStates.get("RJ"))

}