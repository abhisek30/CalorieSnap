package com.avinya.ai.caloriesnap.data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

val Context.dataStore: DataStore<Preferences> by preferencesDataStore("calorie_snap")

class LocalRepositoryImpl(private val context: Context) : ILocalRepository {

    companion object {
        val IS_AUTHENTICATED = booleanPreferencesKey("is_authenticated")
    }

    override suspend fun isAuthenticated(): Boolean? = context.dataStore.data.map { preference ->
        preference[IS_AUTHENTICATED]
    }.first()

    override suspend fun setAuthenticated(isAuthenticated: Boolean) {
        context.dataStore.edit { preference ->
            preference[IS_AUTHENTICATED] = isAuthenticated
        }
    }
}