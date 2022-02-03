package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(walk(15 , 9));
        System.out.println(walk(13 , 18));
        System.out.println(walk(20 , 6));
        System.out.println(walk(5 , 22));
        System.out.println(walk(-10 , 24));
    }
     public static String walk (int temperature , int age ) {
         String toy = "Можно идти гулять";
         String toy1 = "Нельзя идти гулять";
         String toy2 = "Остовайтесь дома";
         if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
             return toy;
         }else if (age <= 20 && temperature >= 0 && temperature <= 28) {
             return toy;
         }else {
             return toy2;
         }


}


}
