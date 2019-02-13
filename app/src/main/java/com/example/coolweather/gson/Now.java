package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 米 on 2019/1/31.
 */

public class Now {


    @SerializedName( "tmp" )
    public String temperature;

    @SerializedName( "cond" )
    public More more;

    public class More{

        @SerializedName( "txt" )
        public String info;
    }
}
