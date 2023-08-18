/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface3;

/**
 *
 * @author ASUS
 */
interface test1 {

    int val = 33;

    void display();

}

class test2 implements test1 {

    static int val = 34;

    public void display() {

        System.out.println(test1.val);

        System.out.println(val);

    }

}

class test3 extends test2 {

    int val = 35;

    void show() {

        System.out.println(test1.val);

        System.out.println(test2.val);

        System.out.println(val);

    }

}

class Interface3 {

    public static void main(String args[]) {

        test3 ob = new test3();

        ob.show();

    }

}
