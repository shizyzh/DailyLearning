package com.szy.kt.ex_2106

import java.util.*


//自定义访问器
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    fun createRandomRectangle(): Rectangle {
        val random = Random()
        return Rectangle(random.nextInt(), random.nextInt())
    }

    fun String.lastChar(): Char = this.get(this.length - 1)
}