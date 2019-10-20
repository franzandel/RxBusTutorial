package com.tunaikumobile.rxbustutorial.rxBus2

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

/**
 * Created by Franz Andel on 2019-09-25.
 * Android Engineer
 */

object RxBus {

    private val publisher = PublishSubject.create<Any>()

    fun publish(event: Any) {
        publisher.onNext(event)
    }

    // Listen should return an Observable and not the publisher
    // Using ofType we filter only events that match that class type
    fun <T> listen(eventType: Class<T>): Observable<T> = publisher.ofType(eventType)
}