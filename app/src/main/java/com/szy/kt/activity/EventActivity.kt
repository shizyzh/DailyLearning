package com.szy.kt.activity

import android.app.Activity
import android.os.Bundle
import android.view.MotionEvent
import com.szy.dailylearning.R
import com.szy.kt.util.LogUtil
import com.szy.kt.util.ToastUtil
import kotlinx.android.synthetic.main.activity_event.*

class EventActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        event_button.setOnClickListener {
            ToastUtil.toast(this, "Test Event dispatch")
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        LogUtil.i("EventActivity,onTouchEvent-event:" + event?.action)
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        LogUtil.i("EventActivity,dispatchTouchEvent-event:" + ev?.action)
        return super.dispatchTouchEvent(ev)
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        //LogUtil.i("EventActivity,onUserInteraction")
    }
}

/**
 * 事件分发事件流转 顺序
 * 相关博客：https://www.freesion.com/article/8167742976/
 * 1.事件传递过程可总结为 Activity--->PhoneWindow
 * --->DecorView--->ViewGroup(可以理解为contentView)
 * 2.View的事件传递是自根节点向叶子节点询问， 如果被某个节点消费了(onTouchEvent或onTouch回调返回true)，
 * 就不再执行父容器的onTouchEvent函数。 (从根节点DecorView到叶子节点的某个View消费了事件)
 * 3.如果拦截了Down事件(onInteruptTouchEvent函数返回true)， 则子节点不会收到任何事件
 * 4.如果当前View消费了Down事件(onTouchEvent函数或onTouch回调返回true), 则当前View才能收到后续的Move、Up和Cancel事件
 * 5.onTouch和onTouchEvent的关系
 * 在View.java的dispatchTouchEvent函数里处理了onTouch回调， 执行时序dispatchTouchEvent---onTouch回调---onTouchEvent，
 * 即onTouch回调在前，onTouchEvent在后。如果onTouch返回true，则不会执行当前视图和父容器的onTouchEvent函数。
 * public boolean dispatchTouchEvent(MotionEvent event) {
 *     ...
 *     ListenerInfo li = mListenerInfo;
 *     if (li != null && li.mOnTouchListener != null && (mViewFlags & ENABLED_MASK) == ENABLED
 *         && li.mOnTouchListener.onTouch(this, event)) {
 *              result = true;
 *     }
 *
 *     if (!result && onTouchEvent(event)) {
 *         result = true;
 *     }
 *     ...
 * }
 *
 *
 *
 * */