package com.example.secondtask.main.view_model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.secondtask.main.model.TetaMenza;

import java.util.ArrayList;
import java.util.List;

public class CustomViewModel extends ViewModel {

    private MutableLiveData<List<TetaMenza>> tete;

    public CustomViewModel() {
        this.tete = new MutableLiveData<>();
        fillList();
    }

    private void fillList(){
        List<TetaMenza> dummyTete = new ArrayList<>();
        TetaMenza teta_1 = new TetaMenza("Marija","Maric","Cvjetno",45,12345678);
        TetaMenza teta_2 = new TetaMenza("Mario","Maric","Cvjetno",65,12225468);
        TetaMenza teta_3 = new TetaMenza("Ana","Raic","Sava",30,12347478);

        dummyTete.add(teta_1);
        dummyTete.add(teta_2);
        dummyTete.add(teta_3);

        tete.setValue(dummyTete);
    }

    public void updateTete(TetaMenza teta){
        List<TetaMenza> list = tete.getValue();
        if (list != null){
            list.add(teta);
            tete.setValue(list);
        }
    }

    public MutableLiveData<List<TetaMenza>> getTete() {
        return tete;
    }
}
