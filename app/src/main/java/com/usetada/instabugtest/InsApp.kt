package com.usetada.instabugtest

import android.app.Application
import com.instabug.library.Instabug
import com.instabug.library.LogLevel
import com.instabug.library.invocation.InstabugInvocationEvent
import com.instabug.library.ui.onboarding.WelcomeMessage

class InsApp : Application() {

    val instabugKey = ""

    override fun onCreate() {
        super.onCreate()
        Instabug.Builder(this, instabugKey)
            .setInvocationEvents(InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT)
            .setSdkDebugLogsLevel(LogLevel.DEBUG)
            .build()
        Instabug.setWelcomeMessageState(WelcomeMessage.State.DISABLED)
    }
}