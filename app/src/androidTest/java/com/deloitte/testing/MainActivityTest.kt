package com.deloitte.testing

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4Builder
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

  @Test
  fun testIsActivityDisplayed(){
    val activityScenario = ActivityScenario.launch(MainActivity::class.java)
    Espresso.onView(withId(R.id.main)).check(matches(isDisplayed()))

    onView(withId(R.id.button))
      .check(matches(withText("Login")))

    onView(withId(R.id.button))
      .check(matches(withEffectiveVisibility(Visibility.VISIBLE)));
  }

}