package com.company;

public class Main {
    public static void main(String[] args) {
        SolarSystem FactorX=new SolarSystem();
        FactorX.sun="1";
        FactorX.Moon="4";
        FactorX.Star="1000";
        FactorX.Planet="2";

        //Adding feature to our sun
        FeatureSun Xfact=new FeatureSun();
        Xfact.color="green";
        Xfact.redius="10000000";
        Xfact.heat="30932493489kj";
    }
}
