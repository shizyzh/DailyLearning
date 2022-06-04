package com.szy.kt.activity

import android.app.Activity
import android.os.Bundle
import com.szy.dailylearning.R
import com.szy.kt.util.ToastUtil
import kotlinx.android.synthetic.main.activity_event.*

class EventActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        event_button.setOnClickListener{
            ToastUtil.toast(this,"Test Event dispatch")
        }
    }
}