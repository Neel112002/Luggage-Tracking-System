package com.company;

import java.util.*;

class Airport {
    String name;
    String location;

    Airport(String name , String location){
        this.name = name;
        this.location = location;
    }

    public void getAirportDetails() {
        System.out.println("Airport Name :- " + this.name + "\tLoation :- " + this.location);
    }
}

class Lug{
    String hashCode;
    int weight;
    Airport a;

    Lug(String hashCode , int weight , Airport a){
        this.hashCode = hashCode;
        this.weight = weight;
        this.a = a;
    }

    public void lugDetails() {
        System.out.print("Hashcode : - " + this.hashCode+ "\t");
        System.out.print("Weight : - " + this.weight + "\t");
        System.out.print("Transport Cost : - " + this.transportPriceChecker() + "\t");
        a.getAirportDetails();
    }

    public int transportPriceChecker() {
        if(this.weight > 23) {
            return 1000;
        }else {
            return 0;
        }
    }

    public void luggageLocationChage(Airport a) {
        this.a = a;
    }
}

class Person{
    Lug[] l1;
    String name;
    Airport a;
    int money;

    Person(String name , Lug[] l1 , Airport a,int money){
        this.l1 = l1;
        this.name = name;
        this.a = a;
        this.money = money;
    }

    public void getCustomerDetais() {
        System.out.println("name :- " + this.name + "  Location :- " + this.a.location + " Money :- " + this.money);
        for(int i = 0 ; i < l1.length ; i++) {
            System.out.print("BNo" + (i+1) + " : ");
            l1[i].lugDetails();
        }
        getBagTrasportPrice();
    }

    public void getWeight() {
        int weight = 0;
        int i;
        for( i= 0 ; i < l1.length ; i++) {
            weight += l1[i].weight;
        }
        System.out.println("Total Weight of " + (i) + " Bags :- " + weight);
    }

    public void getBagTrasportPrice() {
        int total = 0;
        for(int i= 0 ; i < l1.length ; i++) {
            total += l1[i].transportPriceChecker();
        }
        System.out.println("Total Transport Price :- " + total);
        if(total > this.money) {
            System.out.println("You Cant leave Airport");

        }else {
            money = money - total;
        }
    }

    public void personLocationChage(Airport a) {
        this.a = a;
    }
}

//4D6BE411523A34B7E6AE3FB722B6415F04F5B133537D2DB18D63D99C7E1EA8BA
//C0FF055482E7048FC556260BD17587522C4FA42D797B2713D8076CA73CF352CC

public class Main
{
    public static void main(String []args) {
        Airport a = new Airport("AHD" , "India");
        Lug l1 = new Lug("lkjhgf",23 ,a );
        Lug l2 = new Lug("poiuy",27 ,a );
        Lug l3 = new Lug("mnbvc",28 ,a );
        Lug[] lugarr = {l1 , l2 ,l3};
        Person p1 = new Person("Neel" ,lugarr , a,4000);

        p1.getCustomerDetais();

        p1.getWeight();

        Airport tor = new Airport("TRR" , "Canada");
        //p1.personLocationChage(tor);

        //l1.lugDetails();
//		System.out.println(p1.a.location);
        //p1.getCustomerDetais();
        l1.luggageLocationChage(tor);
        l2.luggageLocationChage(tor);
        l3.luggageLocationChage(tor);
        p1.personLocationChage(tor);
        p1.getCustomerDetais();
    }
}



