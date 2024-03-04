package org.example;
// single - threaded application : main
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" in main ");
        System.out.println("Starting Thread T1");
        Thread1 t1 = new Thread1();
        t1.setName("T1");
        //t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        System.out.println("Starting Thread T2");
        Thread1 t2 = new Thread1();
        t2.setName("T2");
        t2.start();
        System.out.println();

        Thread2 ob = new Thread2();
        Thread thread = new Thread(ob);
        // daemon thread runs only till all thread complete. Once all thread finish processing daemon thread stops executing
        thread.setDaemon(true);
        thread.start();
        for (int i = 10; i <=20 ; i++) {
            System.out.println("from main "+i);
            Thread.sleep(200);
        }
    }
}