package com.bootcamp.app;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
	System.out.println("What's your name?");
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
        System.out.println( "Hello " + name + " !!!" );
    }
}
