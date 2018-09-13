package com.example.opilane.lastview;

import java.util.ArrayList;
import java.util.List;

public class Zipcodes {
    //loon uue listi
    private final List<Zipcode> list=new ArrayList<>();

    private static final String[][] codes={
            {"10115","Berliin"},
            {"10243","Tallinn"},
            {"10346","Oslo"},
            {"56844","Las Vegas"},
            {"25249","Kiiev"},
            {"18646","London"},


    };

    //lisame väärtused listi
    public Zipcodes(){
        for (String[] code : codes) list.add(new Zipcode(code[0], code[1]));
    }

    //teeme oma search() meetodi, et otsida zip code
    public List<Zipcode> search(String code, String city ) {
        city=city.toLowerCase();
        List<Zipcode> lines= new ArrayList();
        for (Zipcode z:list)
            if  (z.getCode().startsWith(code)&& z.getCity().toLowerCase().contains(city))lines.add(z);
        return lines;
    }
}
