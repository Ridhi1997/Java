package com.company.codingPractice;

public class SpeedConverter {

    public static void main(String[] args) {

        System.out.println( toMilesPerHour(1.5));
        System.out.println( toMilesPerHour(10.25));
        System.out.println( toMilesPerHour(-5.6));
        System.out.println( toMilesPerHour(25.42));
    }
    public  static long toMilesPerHour(double killoMeterPerHour){
        if(killoMeterPerHour < 0){
            return  -1;
        }
        return  Math.round(killoMeterPerHour/1.609);
    }
}
