package com.logzero.myapplication

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
//LifecycleObserver
class MainActivityObserver : LifecycleObserver {

    val TAG = MainActivityObserver::class.java.name

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateMethidObserver()
    {
        Log.v("OBSERVER CLASS","onstart of observer")
    }

}