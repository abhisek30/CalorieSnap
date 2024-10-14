package com.avinya.ai.caloriesnap.domain.repository

interface IRepository {

    suspend fun isAuthenticated() : Boolean?

    suspend fun setAuthenticated(isAuthenticated: Boolean)
}