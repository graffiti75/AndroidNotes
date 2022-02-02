package com.codeop.android_testing_ex2_solution

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class RecyclerViewSampleTest {

    @get:Rule
    val rule = activityScenarioRule<MainActivity>()

    @Test
    fun givenRecyclerView_whenScrollToItem_thenCheckItsTextIsCorrect() {
        onView(withId(R.id.recyclerView))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(itemText, click())
            )
        onView(withText(displayedText))
            .check(matches(isDisplayed()))
    }

    companion object {
        private const val itemText = 40
        private const val displayedText = "This is element #$itemText"
    }
}
