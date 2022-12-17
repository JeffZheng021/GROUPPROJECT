package application;
//import all packages that is needed to read file, write and exceptions
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Movie {
	
	//variables: year in int, name in string, rating in double, genre in string
	private int year;
	private String name;
	private double rating;
	private String genre;
	
	//no-args constructor
	Movie()
	{
		
	}
	//args constructor that will set everything as what it reads
	Movie(String name, String genre, int year, double rating, boolean writeData)
	{
		this.year = year;
		this.name = name;
		this.rating = rating;
		this.genre=genre;
		
		if (writeData == true)
		{
			try
			{
				FileWriter writer = new FileWriter("movie_data.txt", true);
				writer.append(this.name+","+this.genre+","+this.year+","+this.rating+"\n");
				writer.close();
				
				
				
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	//this is a constructor that just sets everything as it is inputed into the args
	Movie(String name, String genre, Integer year, Double rating)
	{
		this.year = year;
		this.name = name;
		this.rating = rating;
		this.genre=genre;
	}
	
	//getters and setters for every variables
	
	public String getName()
	{
		return this.name;
	}
	public int getYear()
	{
		return this.year;
	}
	public double getRating()
	{
		return this.rating;
	}
	public String getGenre()
	{
		return this.genre;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setRating(double rating)
	{
		this.rating=rating;
	}
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	
}

