package org.example.app;

public class AnonimExample {

    public static void run()
    {
        int a = 2; int b = 3;
        Anonim c = new Anonim(){

            @Override
            int addwith(int a, int b) {
                return a+b;
            }
        };
        System.out.println(c) ;


    }

}
