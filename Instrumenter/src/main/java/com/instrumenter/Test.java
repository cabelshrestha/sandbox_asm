package com.instrumenter;

public class Test
{
	public static void suspend(){
		System.out.println("suspending..");
	}
	public static void resume(){
		System.out.println("resuming..");
	}
	
    public static void main(String[] args) {
        printOne();

        suspend();

        resume();
        
        printOne();
        printTwo();
    }
    
    public static void printOne() {
        System.out.println("Hello World");
    }
    
    public static void printTwo() {
        printOne();
        suspend();
        printOne();
    }
    
    public static final boolean yes() {
        return true == true;
    }
}
