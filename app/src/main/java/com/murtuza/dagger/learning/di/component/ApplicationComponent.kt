package com.murtuza.dagger.learning.di.component

import android.content.Context
import dagger.Component
import com.murtuza.dagger.learning.MyApplication
import com.murtuza.dagger.learning.data.local.DatabaseService
import com.murtuza.dagger.learning.data.local.FileStorageService
import com.murtuza.dagger.learning.data.remote.NetworkService
import com.murtuza.dagger.learning.di.ApplicationContext
import com.murtuza.dagger.learning.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getFileStorageService(): FileStorageService

}
