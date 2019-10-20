package com.tunaikumobile.rxbustutorial.rxBus1

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

/**
 * Created by Franz Andel on 2019-09-25.
 * Android Engineer
 */

class RxBusEvent() {

    private val bus = PublishSubject.create<Any>()

    fun send(o: Any) {
        bus.onNext(o)
    }

    fun toObserverable(): Observable<Any> {
        return bus
    }

    fun hasObservers(): Boolean {
        return bus.hasObservers()
    }
}