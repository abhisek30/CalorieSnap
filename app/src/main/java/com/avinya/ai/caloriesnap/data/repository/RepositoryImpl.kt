package com.avinya.ai.caloriesnap.data.repository

import com.avinya.ai.caloriesnap.data.local.ILocalRepository
import com.avinya.ai.caloriesnap.domain.repository.IRepository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localRepository: ILocalRepository,
) : IRepository {

    override suspend fun isAuthenticated(): Boolean? {
        return localRepository.isAuthenticated()
    }

    override suspend fun setAuthenticated(isAuthenticated: Boolean) {
        localRepository.setAuthenticated(isAuthenticated)
    }
}