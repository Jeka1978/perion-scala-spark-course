package com.peroin.object_methods;

/**
 * @author Evgeny Borisov
 */
public class MainJava {
    public static void main(String[] args) {
        Hero hero1 = new Hero("vladimir", 20);
        Hero hero2 = new Hero("vladimir", 20);

        System.out.println(hero1.hashCode());
        System.out.println(hero2.hashCode());

        System.out.println(hero1==hero2);


    }
}
