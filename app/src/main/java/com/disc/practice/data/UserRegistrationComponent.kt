package com.disc.practice.data

import com.disc.practice.MainActivity
import com.disc.practice.SecondActivity
import dagger.Component
import dagger.hilt.InstallIn


@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(secondActivity: SecondActivity)

}