package com.kotlin.mvvm.config

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/*
this is the base activity that all other activities should extend from
it contains the main functions that can be used in any activity
*/
abstract class BaseActivity(
    @LayoutRes
    private val layoutRes: Int
) : AppCompatActivity() {

    /* override of onCreate function*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)
        sendAnalytics(this, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        sendAnalytics(this, "onStart")
    }

    /* send analytics to google analytics*/
    private fun sendAnalytics(activity: BaseActivity, message: String) {

    }

}