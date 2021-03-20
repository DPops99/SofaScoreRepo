package com.example.secondtask.main.model

import java.io.Serializable

class TetaMenza constructor(
    var first_name :String,
    var last_name : String,
    var workplace : String,
    var age : Int,
    var OIB : Int
):Serializable{

    override fun toString(): String {
        return first_name+" "+last_name+" "+workplace+" "+ age.toString()+" "+OIB.toString()
    }
}