package com.example.shelter;

import android.app.Application;

import com.example.shelter.model.Shelter;

import java.util.ArrayList;
import java.util.List;

public class ShelterTrackerApplication extends Application {

    private final List<Shelter> shelterList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        for(int i = 0; i < 20; i++) {
            shelterList.add(new Shelter(Integer.toString(i), "Shelter Number " + i));
        }
    }

    public List<Shelter> getShelterList() {
        return shelterList;
    }

    public Shelter findShelterById(String shelterID){
        for (Shelter shelter : shelterList) {
            if(shelter.getShelterId().equals(shelterID)){
                return shelter;
            }
        }
        return null;
    }



}
