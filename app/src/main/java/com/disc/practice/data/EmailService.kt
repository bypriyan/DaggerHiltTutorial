package com.disc.practice.data

import android.util.Log
import javax.inject.Inject


interface NotificationService{
    fun send(to:String,from:String,body : String?)
}



class EmailService @Inject constructor() : NotificationService {
    override fun send(to:String, from:String, body : String?){
        Log.i("TAG", "Email Send");
    }
}


class MessageService : NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.i("TAG", "Message Sent");
    }
}