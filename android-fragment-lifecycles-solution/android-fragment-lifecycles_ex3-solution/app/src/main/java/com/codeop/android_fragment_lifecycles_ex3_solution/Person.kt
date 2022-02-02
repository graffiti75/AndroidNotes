package com.codeop.android_fragment_lifecycles_ex3_solution

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person (
    val name: String,
    val age: Int
): Parcelable