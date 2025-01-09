package com.murtuza.dagger.learning.ui.main

import com.murtuza.dagger.learning.data.local.DatabaseService
import com.murtuza.dagger.learning.data.remote.NetworkService
import com.murtuza.dagger.learning.di.ActivityScope

import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {

    fun getSomeData(): String {
        return "dsHashCode: " + databaseService.hashCode() + "\n" + "nsHashCode: " + networkService.hashCode()
    }

}
