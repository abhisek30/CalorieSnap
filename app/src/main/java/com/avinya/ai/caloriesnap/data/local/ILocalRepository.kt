package com.avinya.ai.caloriesnap.data.local

interface ILocalRepository {

    suspend fun isAuthenticated() : Boolean?

    suspend fun setAuthenticated(isAuthenticated: Boolean)

}