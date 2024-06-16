package com.disc.practice.data

import android.util.Log
import javax.inject.Inject



interface UserRepository{
    fun saveUser(email : String ,password : String)
}



class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email : String, password : String){
        Log.i("TAG", "User save in DB");
    }
}


class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.i("TAG", "User save in Firebase");
    }

}