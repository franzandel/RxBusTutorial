package com.tunaikumobile.rxbustutorial.rxBus1

import android.app.Application
import android.os.SystemClock
import android.util.Log


/**
 * Created by Franz Andel on 2019-09-25.
 * Android Engineer
 */

class MyApp : Application() {
    private var bus: RxBusEvent? = null

    override fun onCreate() {
        super.onCreate()
        bus = RxBusEvent()
        Log.d("before", "" + System.currentTimeMillis())
        object : Thread() {
            override fun run() {
                SystemClock.sleep(3000)
                bus!!.send(Events.Message("Hey I just took a nap, how are you!!!"))
            }
        }.start()
        Log.d("after ", "" + System.currentTimeMillis())
    }

    fun bus(): RxBusEvent? {
        return bus
    }
}