package com.codeop.android_testing_ex1

import android.content.Context

class ResourceComparer {
    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }
}