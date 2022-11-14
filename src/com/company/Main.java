package com.company;

public class Main {

    public static void main(String[] args) {

        int testNumber = 2;

        switch (testNumber){
            case 0:
                System.out.println("number was zero");
                break;
            case 1:
                System.out.println("number was one");
                break;
            case 2:
                System.out.println("number was two");
                break;
            default:
                System.out.println("number was not 0, 1 or 2");
                break;
        }

    }
}
