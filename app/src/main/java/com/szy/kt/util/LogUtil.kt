package com.szy.kt.util

import android.util.Log

object LogUtil {
    val TAG = "LogUtil"

    fun i(msg: String) {
        i(TAG, msg)
    }

    fun i(tag: String, msg: String) {
        Log.i(tag, msg)
    }
}