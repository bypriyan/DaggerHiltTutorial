package com.disc.practice.models

data class StudentModel(
    override var key:String = "",
    var name:String = "",
    var age:Int = 0,
):ParentModel(key)
