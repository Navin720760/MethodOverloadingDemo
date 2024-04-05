package com.methodoverloading;

//Method Overloading
class Calculator
{
	
	//add two integers
	public int add(int a,int b)
	{
		return a+b;
	}
	
	//add two real numbers
	public float add(float a,float b)
	{
		return a+b;
	}
	
	//add two real numbers
	public Double add(Double a,Double b)
	{
		return a+b;
	}
	
	//concatenate the two strings into one string
	public String concatenate(String a,String b)
	{
		return a+b;
	}
	
	//takes one string and one integer then concatenate/add them into one string
	public String concatenate(String a,int b)
	{
		return a+b;
	}
	
	//add three integer values
	public int add(int a,int b,int c)
	{
		//return a+b;
		return a+b+c;
	}
	
	//add double and int value then result real number
	public Double add(Double a,int b)
	{
		return a+b;
	}
	
	//add int and double value then result real number
	public Double add(int a,Double b)
	{
		return a+b;
	}
	
	//add float and int value then result real number
	public float add(float a,int b)
	{
		return a+b;
	}
	
	//add int and float value then result real number
	public float add(int a,float b)
	{
		return a+b;
	}
	
	//add two real numbers then result real number
	public Double add(float a,double b)
	{
		return a+b;
	}
	
	//method with same name and same type of parameters with same order is not allowed in java. 
	/*public int add(int a,int b)
	{
		return a+b;
	}*/
	
}

public class LaunchDemo 
{

	public static void main(String[] args) 
	{
		
		Calculator calc = new Calculator();        //object instantiation
		
		//methods calling
		/*Integer i = calc.add(5, 10);
		System.out.println(i);*/  
		
		System.out.println(calc.add(5, 10));
		System.out.println(calc.add(2.5, 3.5));
		System.out.println(calc.add(10.5, 345.5));
		System.out.println(calc.concatenate("Nakka ", "Naveen"));
		System.out.println(calc.concatenate("Hyder ", 1994));
		System.out.println(calc.add(20, 30, 40));
		System.out.println(calc.add(20.5, 10));
		System.out.println(calc.add(50, 3645.5));
		System.out.println(calc.add(5.5,60));
		System.out.println(calc.add(70,6.5));
		System.out.println(calc.add(10.5,55575.5));
		
		main();
		main(10);
	
}
	
	public static void main()
	{
		System.out.println("main method with zero parameters");
	}
	
	public static void main(int a)
	{
		System.out.println("main method with one parameters");
	}
	
	public static void main(Float[] f)
	{
		System.out.println("main method with float of arguments");
	}
	
	/*public static void main(String[] args)
	{
		System.out.println("main method with string of arguments");
	}*/

}
