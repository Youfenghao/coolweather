package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 米 on 2019/1/31.
 */

public class Weather {


    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName( "daily_forecast" )
    public List<Forecast> forecastList;
}
