package com.company;

public class Vehicle {
    public class engine{
        String rodzaj = "diesel";
        public void say(){
            System.out.println(rodzaj);
        }
    }
    public class color{
        String kolor = "czerwony";
        public void say(){
            System.out.println(kolor);
        }
    }
    public class size{
        String size1 = "big";
        public void say(){
            System.out.println(size1);
        }
    }
    engine silnik = new engine();
    color kolur = new color();
    size poziom = new size();

    public void info(){
        silnik.say();
        kolur.say();
        poziom.say();
    }

}
