package com.murtuza.dagger.learning.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import com.murtuza.dagger.learning.di.ActivityContext

@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

}
