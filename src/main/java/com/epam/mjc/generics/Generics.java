package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public List<List<String>> boxingMethod(String name) {
       List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

 
    public <ObjectT> ObjectT genericMethod(ObjectT data) {
        return data;
    }


    public <T> void cloneMethod(List consumer, List producer) {
        consumer.addAll(producer);
    }

}
