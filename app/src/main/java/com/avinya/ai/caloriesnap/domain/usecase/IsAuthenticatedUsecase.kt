package com.avinya.ai.caloriesnap.domain.usecase

import com.avinya.ai.caloriesnap.domain.repository.IRepository
import javax.inject.Inject

class IsAuthenticatedUsecase @Inject constructor(
    private val repository: IRepository
) {
    suspend operator fun invoke(): Boolean? {
        return repository.isAuthenticated()
    }
}