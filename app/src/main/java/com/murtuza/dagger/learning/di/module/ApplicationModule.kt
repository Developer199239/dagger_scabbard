package com.murtuza.dagger.learning.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import com.murtuza.dagger.learning.MyApplication
import com.murtuza.dagger.learning.data.local.FileStorageService
import com.murtuza.dagger.learning.data.remote.HttpClient
import com.murtuza.dagger.learning.di.ApplicationContext
import com.murtuza.dagger.learning.di.DatabaseName
import com.murtuza.dagger.learning.di.DatabaseVersion
import com.murtuza.dagger.learning.di.NetworkApiKey
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

    @Provides
    @DatabaseName
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseVersion
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkApiKey
    fun provideApiKey(): String = "SOME_API_KEY"

    @Singleton
    @Provides
    fun provideFileStorageService(): FileStorageService {
        return FileStorageService()
    }

}
