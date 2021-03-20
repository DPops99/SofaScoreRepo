package com.example.secondtask.main.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.secondtask.main.model.TetaMenza

class CustomViewModel : ViewModel() {

    val tete = MutableLiveData<ArrayList<TetaMenza>>()

    init {
        tete.value = arrayListOf(
            TetaMenza("Marija","Maric","Cvjetno",45,12345678),
            TetaMenza("Marin","Maric","Cvjetno",30,12345678),
            TetaMenza("Ivo","Ivic","Sava",55,123454448)
        )
    }

    fun addTeta(teta : TetaMenza){
        tete.value?.add(teta)
    }
}