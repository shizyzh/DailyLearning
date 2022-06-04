package com.szy.kt.ex_2106

import android.content.Context
import android.util.AttributeSet

open class View {
    constructor(ctx: Context) {}
    constructor(ctx: Context, attr: AttributeSet) {}
}

class MyButton : View {
    constructor(ctx: Context) : super(ctx) {}
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {}
}