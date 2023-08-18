/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classthread;
class NewThread implements Runnable

{

Thread t;

NewThread()

{

t = new Thread(this, "demo thread");

System.out.println("Child thread: " +t);

t.start();

}

public void run()

{

try

{

for(int n=5;n>0;n--)

{

System.out.println("Child Thread: " +n);

Thread.sleep(500);

}

}

catch(InterruptedException e)

{

System.out.println("Child Interrupted.");

}

System.out.println("Exiting child thread.");

}

}

class classThread

{

public static void main(String args[])

{

new NewThread();

try

{

for(int n=5;n>0;n--)

{

System.out.println("Main Thread: " +n);

Thread.sleep(1000);

}

}

catch(InterruptedException e)

{

System.out.println("Main Interrupted.");

}

System.out.println("Exiting Main thread.");

}

}

