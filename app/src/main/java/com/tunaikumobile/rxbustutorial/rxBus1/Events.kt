package com.tunaikumobile.rxbustutorial.rxBus1

import android.text.format.DateFormat

/**
 * Created by Franz Andel on 2019-09-25.
 * Android Engineer
 */

object Events {

    class Message(message: String) {
        val message: String = DateFormat.format(
            "MM/dd/yy h:mm:ss aa",
            System.currentTimeMillis()
        ).toString() +  ": " + message

    }
}