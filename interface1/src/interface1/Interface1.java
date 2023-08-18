/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface1;

/**
 *
 * @author ASUS
 */
interface test1

{

int val=10;

void display();

}

interface test2

{

int val=20;

void display();

}

interface test3 extends test1, test2

{

int val=50;

void display();

}

class test4 implements test3

{

int val=57;

public void display()

{

System.out.println(test1.val);

System.out.println(test2.val);

System.out.println(test3.val);

System.out.println(val);

}

}

public class Interface1

{

public static void main(String args[])

{

test4 ob = new test4();

ob.display();

}

}
