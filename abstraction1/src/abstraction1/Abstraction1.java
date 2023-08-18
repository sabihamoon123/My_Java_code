/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraction1;


abstract class Book {

protected int pages;

Book(int numPages) {

pages = numPages;

}

abstract void show() ;

}

class Dictionary extends Book {

protected int definitions;

Dictionary(int numPages, int numDefinitions) {

super(numPages);

definitions = numDefinitions; }

@Override
void show() {

System.out.println("Number of definitions "+ definitions);

System.out.println("Definitions per page: " + (definitions/pages));

}

}

class Abstraction1 {

public static void main(String args[])

{

Book B;

Dictionary D = new Dictionary (1200,
3500);

D.show();

B = D;

B.show();

}

}