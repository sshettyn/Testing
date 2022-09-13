package com.deloitte.testing

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Test

class RegistrationUtilTest {


  @Test
  fun `test empty user name`(){
    Assert.assertFalse(
      RegistrationUtil.validateUser("","","")
    )
  }
}