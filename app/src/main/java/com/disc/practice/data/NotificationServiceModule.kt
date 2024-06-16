package com.disc.practice.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class NotificationServiceModule {
    @Provides
    fun getMessageService(): NotificationService{
        return MessageService()
    }

}