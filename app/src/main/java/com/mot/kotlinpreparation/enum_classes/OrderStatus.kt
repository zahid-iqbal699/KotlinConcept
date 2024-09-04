package com.mot.kotlinpreparation.enum_classes

enum class OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED
}

class Order(val status: OrderStatus)

fun main1() {
    val order = Order(OrderStatus.SHIPPED)
    val orderDelievered = Order(OrderStatus.DELIVERED)
    println(order.status) // prints SHIPPED
}

///new examples with Color Contants
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main() {
    val color = Color.GREEN
    println(color.rgb) // prints 65280
}
