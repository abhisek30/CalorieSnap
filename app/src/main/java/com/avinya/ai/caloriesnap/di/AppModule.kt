package com.avinya.ai.caloriesnap.di

import android.content.Context
import com.avinya.ai.caloriesnap.data.local.ILocalRepository
import com.avinya.ai.caloriesnap.data.local.LocalRepositoryImpl
import com.avinya.ai.caloriesnap.data.repository.RepositoryImpl
import com.avinya.ai.caloriesnap.domain.repository.IRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalRepo(
        @ApplicationContext context: Context,
    ): ILocalRepository {
        return LocalRepositoryImpl(context)
    }

    @Provides
    @Singleton
    fun provideRepository(
        localRepository: ILocalRepository
    ): IRepository {
        return RepositoryImpl(localRepository)
    }

}