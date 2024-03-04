package org.example;

/**
 * 1. inherit Thread class
 * 2. override the run() : where you write the task to be performed by the thread
 * 3. create object of this class
 * 4. call start(): NEVER CALL run()
 *
 * Thread states
 * 1. NewBorn: new object of the class os created
 * 2. Runnable : start()
 * 3. Running : run() => OS decides to give thread a chance to execute
 * 4. Blocked : It can go in this state from running if
 *      sleep() => 1s
 *      wait() => synchronous communication
 *      I/O operation
 *  From blocked it can go back to runnable or dead state
 *  5. Dead state: either OS decides to stop a thread or thread completes the task
 */
public class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" in run ");
        for (int i = 1 ; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
