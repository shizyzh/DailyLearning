package com.szy.kt.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.LinearLayout
import com.szy.kt.util.LogUtil

class EventLinearLayout : LinearLayout {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        LogUtil.i("EventLinearLayout-onTouchEvent-event:" + event?.action)
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        LogUtil.i("EventLinearLayout-dispatchTouchEvent-event:" + ev?.action)
        return super.dispatchTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        LogUtil.i("EventLinearLayout-onInterceptTouchEvent-event:" + ev?.action)
        return super.onInterceptTouchEvent(ev)
    }
}