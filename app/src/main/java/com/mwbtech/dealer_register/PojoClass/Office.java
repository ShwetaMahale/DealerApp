package com.mwbtech.dealer_register.PojoClass;

public class Office {


    String Name,Pincode;

    public String getName() {
        return Name;
    }

    public String getPincode() {
        return Pincode;
    }

    @Override
    public String toString() {
        return "Office{" +
                "Name='" + Name + '\'' +
                ", Pincode='" + Pincode + '\'' +
                '}';
    }
}
