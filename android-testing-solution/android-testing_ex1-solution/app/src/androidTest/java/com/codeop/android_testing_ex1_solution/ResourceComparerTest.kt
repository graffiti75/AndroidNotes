package com.codeop.android_testing_ex1_solution

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {
    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    @Test
    fun givenStringResourceSameAsGivenString_thenReturnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.hello, "Hello")
        assertThat(result).isTrue()
    }

    @Test
    fun givenStringResourceDifferentAsGivenString_thenReturnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.hello, "Ex1")
        assertThat(result).isFalse()
    }
}