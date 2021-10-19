package com.company;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        Audi audi=new Audi("Audi",LocalDate.now(),"BMW");
        audi.move();

    }
}
class Car{
    String brand;
    LocalDate dateOfManufacture;
    String manufacturer;
    public Car(String carBrand,LocalDate date,String maker){
        brand=carBrand;
        dateOfManufacture=date;
        manufacturer=maker;
    }
    public void move(){
        System.out.println(getClass()+" is moving");
    }
}
class Audi extends Car{
    public Audi(String brand,LocalDate date,String maker){
        super(brand,date,maker);
    }
    @Override
    public void move(){
        System.out.println(getClass().getSimpleName()+" is moving");
    }

}