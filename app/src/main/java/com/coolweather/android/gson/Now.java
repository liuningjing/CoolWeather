package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;  // 当前温度

    @SerializedName("wind_deg")
    public String wind_degree;  //风向角度
    @SerializedName("wind_dir")
    public String wind_direction;  //风向
    @SerializedName("wind_sc")
    public String wind_power;    //风力
    @SerializedName("hum")
    public String humidity;   //湿度
    @SerializedName("pcpn")
    public String precipitation;  //降水量
    @SerializedName("pres")
    public String pressure;  //大气压强
    @SerializedName("vis")
    public String visibility;  //能见度

    @SerializedName("cond")
    public More more;   // 更多信息
    public class More{
        @SerializedName("txt")
        public String info; // 天气信息
    }
}
