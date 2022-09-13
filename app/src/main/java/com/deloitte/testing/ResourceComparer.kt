package com.deloitte.testing

import android.content.Context
import android.content.LocusId

class ResourceComparer {

  fun isEqual(context: Context,resId: Int,string: String):Boolean{
      return context.getString(R.string.app_name).equals(string)
  }
}