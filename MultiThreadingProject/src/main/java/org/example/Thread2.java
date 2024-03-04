package org.example;

/**
 * 1. implement Runnable interface
 * 2. override the run() : where you write the task to be performed by the thread
 * 3. create object of this runnable class
 * 4. pass it as a reference to constructor of the Thread class
 * 5. call start() on thhis thread class object: NEVER CALL run()
 */
public class Thread2 implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" in run ");
        for (char i = 'A' ; i <='Z' ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
