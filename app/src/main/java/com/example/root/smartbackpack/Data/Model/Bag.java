package com.example.root.smartbackpack.Data.Model;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.widget.Toast;;

import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.List;


public class Bag {
    private String bagName;
    private String wifiPassword="dickmysuck";
    private String location;
    private Date dateTime;
    private PasswordAuthentication pass;

    public Bag(String bagName, String wifiPassword) {
        this.bagName = bagName;
        this.wifiPassword = wifiPassword;
    }

    public String getBagName() {
        return bagName;
    }
    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    public String getWifiPassword() {
        return wifiPassword;
    }
    public void setWifiPassword(String wifiPassword) {
        this.wifiPassword = wifiPassword;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void connectToBag(Context context) {

        try {
            WifiManager wifi = (WifiManager)
                    context.getSystemService(Context.WIFI_SERVICE);

            boolean b=wifi.isWifiEnabled();
            if(!b){
                wifi.setWifiEnabled(true);
                Toast.makeText(context,"WiFi activated", Toast.LENGTH_SHORT).show();
            }
            WifiConfiguration conf =new WifiConfiguration();
            conf.SSID = "\""+bagName+"\"";
            conf.preSharedKey = "\""+wifiPassword+"\"";
            wifi.addNetwork(conf);

            List<WifiConfiguration> wifiList = wifi.getConfiguredNetworks();
            for(WifiConfiguration i:wifiList){
                if(i.SSID != null && i.SSID.equals("\""+bagName+"\"")){
                    wifi.disconnect();
                    wifi.enableNetwork(i.networkId, true);
                    wifi.reconnect();
                    Toast.makeText(context,"Connected to bag", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void disconnectBag(Context context){
        WifiManager wifi = (WifiManager)
                context.getSystemService(Context.WIFI_SERVICE);
        wifi.setWifiEnabled(false);
        Toast.makeText(context,"Bag Disconnected", Toast.LENGTH_SHORT).show();
    }

}
