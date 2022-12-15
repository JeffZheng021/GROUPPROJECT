package application;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TvShow {
	
	
	private int year;
	private String name;
	private double rating;
	private String genre;
	private int episodes;
	
	
	TvShow()
	{
		
	}
	TvShow(String name, String genre, int year, double rating, int episodes, boolean writeData)
	{
		this.year = year;
		this.name = name;
		this.rating = rating;
		this.genre=genre;
		this.episodes=episodes;
		
		if (writeData == true)
		{
			try
			{
				FileWriter writer = new FileWriter("movie_data.txt", true);
				writer.append(this.name+","+this.genre+","+this.year+","+this.episodes+","+this.rating+"\n");
				writer.close();
				
				
				
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	TvShow(String name, String genre, Integer year, Integer episodes, Double rating)
	{
		this.year = year;
		this.name = name;
		this.rating = rating;
		this.genre=genre;
		this.episodes = episodes;
	}
	
	
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
	
	public int getEpisodes()
	{
		return this.episodes;
	}
	
}
