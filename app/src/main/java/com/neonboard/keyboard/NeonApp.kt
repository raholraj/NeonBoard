package com.neonboard.keyboard

import android.app.Application

class NeonApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Prefs.init(this)
        Feedback.init(this)
        if (Prefs.installTime == 0L) Prefs.installTime = System.currentTimeMillis()
        Reminders.schedule(this)
    }
}
