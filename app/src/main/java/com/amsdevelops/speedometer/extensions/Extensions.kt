package com.amsdevelops.speedometer.extensions

import android.util.TypedValue
import com.amsdevelops.speedometer.App
import com.amsdevelops.speedometer.presentation.viewmodel.AutoDisposable
import io.reactivex.disposables.Disposable

//Rx
fun Disposable.addTo(autoDisposable: AutoDisposable) {
    autoDisposable.add(this)
}