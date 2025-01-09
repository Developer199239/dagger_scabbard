package com.murtuza.dagger.learning.data.remote

import android.content.Context

import com.murtuza.dagger.learning.di.ApplicationContext
import com.murtuza.dagger.learning.di.NetworkApiKey

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey private val apiKey: String
) {

    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }

}
