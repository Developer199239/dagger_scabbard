package com.murtuza.dagger.learning.data.local

import android.content.Context

import com.murtuza.dagger.learning.di.ApplicationContext
import com.murtuza.dagger.learning.di.DatabaseName
import com.murtuza.dagger.learning.di.DatabaseVersion

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val version: Int
) {

    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }

}
