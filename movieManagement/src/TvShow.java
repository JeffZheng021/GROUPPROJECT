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
	
	public void setRating(double rating)
	{
		this.rating=rating;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEpisodes(int episodes)
	{
		this.episodes=episodes;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	
}
