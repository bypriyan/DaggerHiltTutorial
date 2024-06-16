package com.disc.practice.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository() : UserRepository{
        return FirebaseRepository()
    }

}