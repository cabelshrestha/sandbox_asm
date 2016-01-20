package com.suspend.test;


public class Caller implements Runnable {
	
	@Override
	public void run() {
		int x = 5;
		int retval = 1;

		Procedure test1 = new Procedure();
		
		while (retval != 0) {
			System.out.println("[Caller] calling procedure...");
			retval = test1.procedure1();
			x = x + 5;
			System.out.println("[Caller] back from procedure...");
			System.out.println("----------------------");
		}

		System.out.println("[Caller] Done!");
		
	}

	public static void main(String args[]) throws Exception {
        Caller tester = new Caller();
        tester.run();
        return;
    }
}
