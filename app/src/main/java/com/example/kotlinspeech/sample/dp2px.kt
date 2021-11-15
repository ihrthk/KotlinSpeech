package com.example.kotlinspeak.sample

import android.content.res.Resources

//Normal
class ScreenUtils {
    companion object {
        fun dp2px(dpValue: Float): Int {
            val scale = Resources.getSystem().displayMetrics.density
            return (dpValue * scale + 0.5f).toInt()
        }
    }
}

//Better
private val Float.dp: Unit
    get() {
        val scale = Resources.getSystem().displayMetrics.density
        (this * scale + 0.5f).toInt()
    }