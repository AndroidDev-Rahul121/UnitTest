package com.example.uniytestapplication

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {



 @get:Rule
 val activityScenarioRule=  ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun getBinding() {
    }

    @Test
    fun setBinding() {
    }

    @Test
    fun onCreate() {
    }

    @Test
    fun textVisible(){
//        Espresso.setInitialTouchMode(false);

onView(withId(ViewIds.EDIT_TEXT)).perform(replaceText("Hello"), closeSoftKeyboard())
onView(withId(ViewIds.BUTTON)).perform(click())
onView(withId(ViewIds.TEXTVIEW)).check(matches(withText("Hello")))

    }
}