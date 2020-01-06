package com.example.safemessenger.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClientInstance { //Function to get Data from API MongoDB

    private static Retrofit retrofit;
    private static final String BASE_URL = "mongodb+srv://Aetaugan:Wo5a7zg#Kk&5MC4yhA%sP&dE7b$mtX@smdb-8uo3d.azure.mongodb.net/test?retryWrites=true&w=majority";

    public static Retrofit getRetrofitInstance(){
        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
