package com.deloitte.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import junit.framework.TestCase
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

  lateinit var  resourceComparer : ResourceComparer

  @Before
  fun setUp(){
    resourceComparer = ResourceComparer()
  }

  @After
  fun tearDown(){

  }

  @Test
  fun testResourceComparer(){

    val context = ApplicationProvider.getApplicationContext<Context>()
    val result = resourceComparer.isEqual(context,R.string.app_name,"Testing")
    Assert.assertTrue(result)
  }
}