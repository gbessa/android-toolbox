package br.com.hoptech.androidtoolbox

enum class StatusOrder {
    PENDING, APPROVED, SHIPPED, FINISHED, CANCELED
}

class Order {

    var status: StatusOrder = StatusOrder.APPROVED

}

fun main(args: Array<String>) {

    val order = Order()

    val result = when (order.status) {

        StatusOrder.PENDING -> "Order pending"
        StatusOrder.APPROVED -> "Order approved"
        StatusOrder.SHIPPED -> "Order shipped"
        StatusOrder.FINISHED -> "Order finished"
        else -> "Status not treated"
    }



    println(order.status)
    println(result)

}