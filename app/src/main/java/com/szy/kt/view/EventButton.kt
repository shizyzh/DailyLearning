package com.szy.kt.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.Button
import com.szy.kt.util.LogUtil

@SuppressLint("AppCompatCustomView")
class EventButton : Button {

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)

    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) : super(
        context,
        attributeSet,
        defStyleAttr
    )

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        LogUtil.i("EventButton-onTouchEvent," + event?.action+"，x:"+event?.getX()+",y:"+event?.getY())
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        LogUtil.i("EventButton-dispatchTouchEvent," + event?.action)
        return super.dispatchTouchEvent(event)
    }

}