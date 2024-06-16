package com.disc.practice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.charts.Pie
import com.disc.practice.data.DaggerUserRegistrationComponent
import com.disc.practice.data.EmailService
import com.disc.practice.data.UserRegistrationComponent
import com.disc.practice.data.UserRegistrationService
import com.disc.practice.data.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import dagger.internal.DaggerCollections
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    @Inject
    lateinit var emailService: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this@SecondActivity)

        userRegistrationService.registerUser("atta@gmail.com","aaa123")


    }

}