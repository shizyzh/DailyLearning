package com.szy.kt.util

import android.content.Context
import android.widget.Toast

object ToastUtil {

    fun toast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}