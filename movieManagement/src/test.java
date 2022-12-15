package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main (String[] args)
	{
		ArrayList<User> arr = new ArrayList<>();
		method1(arr);
		System.out.println(arr.toString());
	}
	
	public static void method1(ArrayList<User> arr)
	{
		try
		{
		File file = new File("user_data.txt");
		Scanner inputStream = new Scanner(file);
		inputStream.useDelimiter("[,,,\n]");
		
		String name;
		String password;
		String email;
		String plan;
		
		while (inputStream.hasNext())
		{
			name=inputStream.next();
			password=inputStream.next();
			email=inputStream.next();
			plan=inputStream.next();
			arr.add(new User(name, password, email, plan));
		}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	

}
