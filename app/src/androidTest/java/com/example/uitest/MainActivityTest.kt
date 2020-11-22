package com.example.uitest

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MainActivity>(
        MainActivity::class.java
    )
    @Test
    fun testUser(){

        Espresso.onView(withId(activityRule.activity.button1.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.button2.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.button3.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.button4.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.button5.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.button6.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.button7.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.button8.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.button9.id)).perform(click())
        val expected:String = "Нолики выиграли"
        assertEquals(expected, activityRule.activity.polepobedi.text)
    }
}