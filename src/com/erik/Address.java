package com.erik;

public class Address {
    private String name;
    private String street;
    private String city;
    private String code;

    public Address(String n,String s,String city,String c){
        name=n;
        this.street=s;
        this.city=city;
        code=c;
    }
    public String toString(){
        return "name: "+name+", street: "+street
                +",city: "+city+",code: "+code;
    }

}
