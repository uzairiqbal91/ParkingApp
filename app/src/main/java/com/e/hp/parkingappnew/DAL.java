package com.e.hp.parkingappnew;

import android.app.Activity;
import android.content.Context;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by Hp on 9/28/2017.
 */

public class DAL {

    private static String DB_NAME = "parkingreservationsystem";
    private static String ENTITY_NAME_PROFILES="user records";


    private FirebaseDatabase firebase;
    private static DatabaseReference database;

    private static Context context;
    private StorageReference mStorageRef;
    Activity activity;
    public DAL(Activity activity, Context context) {

        this.activity = activity;
        firebase = FirebaseDatabase.getInstance();
        //firebase.setPersistenceEnabled(true);

        database = firebase.getReference(DB_NAME);


        mStorageRef = FirebaseStorage.getInstance().getReference();



        this.context = context;

    }

    public DAL()
    {

    }

    public void addProfile() {

//        final DatabaseReference table = database.child(ENTITY_NAME_PROFILES);
        database.push().setValue("elloworl!");;

    }

}
