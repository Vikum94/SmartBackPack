package com.example.root.smartbackpack.Data.Model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {
    public void setBagDetails(){

    }
    public static HashMap<String, List<String>> getInfo(){
        HashMap<String, List<String>> bagsHashMap = new HashMap<String, List<String>>();
        List<String> bag = new ArrayList<String>();
        bag.add("Bag 1");
        bag.add("Bag 2");

        bagsHashMap.put("Bags List", bag);

        return bagsHashMap;
    }


}
