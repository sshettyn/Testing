package com.deloitte.testing

object RegistrationUtil {

  val existingUsers = listOf("philip","charles","william")

  fun validateUser(userName: String,
  password: String,
  confirmPassword: String):Boolean{

    if(userName.isEmpty() || password.isEmpty()){
      return false
    }

    if(userName in existingUsers){
      return false
    }

    if(confirmPassword!=password){
      return false
    }

    return true
  }
}