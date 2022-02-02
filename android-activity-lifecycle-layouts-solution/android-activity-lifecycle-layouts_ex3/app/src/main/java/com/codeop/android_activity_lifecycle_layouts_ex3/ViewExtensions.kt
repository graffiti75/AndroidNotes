package com.codeop.android_activity_lifecycle_layouts_ex3

import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

fun View.initViewAnimation() {
    this.startAnimation(
        this.context.anim(R.anim.zoom_in_95)
    )
}

fun Context.anim(animationId: Int): Animation {
    return AnimationUtils.loadAnimation(this, animationId)
}
