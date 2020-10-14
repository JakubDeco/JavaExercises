package sk.deco.keakademia.ciselnesustavy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int value, cs;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive value: ");
            value=sc.nextInt();
        } while(value<0);

        do {
            System.out.print("Enter a base [2,8,16]: ");
            cs=sc.nextInt();
        } while(cs!=2 && cs != 8 && cs!=16);

        String conversion="";
        Converter convert=new Converter();
        switch(cs){
            case 2: conversion = convert.convertDecimalToBinary(value);
                break;
            case 8: conversion = convert.convertDecimalToOctal(value);
                break;
            case 16: conversion = convert.convertDecimalToHexadecimal(value);
        }
        System.out.println("Result: "+conversion);*/
        int value=1273;
        int result;
        Converter converted=new Converter();
        /*result=converted.convertBinaryToDecimal(value);
        System.out.println(result);*/
        result=converted.convertOsctalToDecimal(value);
        System.out.println(result);

        //TODO modify imputing partof application
    }
}
