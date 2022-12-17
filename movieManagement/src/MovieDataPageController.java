package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MovieDataPageController implements Initializable{
	
	private Stage stage;
	private Parent root;
	private Scene scene;
	@FXML
	private TableView<Movie> table;
	@FXML
	private TableColumn<Movie, String> name;
	@FXML
	private TableColumn<Movie, String> genre;
	@FXML
	private TableColumn<Movie, Integer> year;
	@FXML
	private TableColumn<Movie, Double> rating;
	
	
	
	ObservableList<Movie> list = FXCollections.observableArrayList(); 

	
	public void back(ActionEvent event)
	{	
			
		try {
			root = FXMLLoader.load(getClass().getResource("/SelectionPage.fxml"));
			stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
				
			stage.setScene(scene);
			stage.show();
			}
		catch (IOException e1)
			{		
			e1.printStackTrace();
			}
				
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try
		{
		File file = new File("movie_data.txt");
		Scanner inputStream = new Scanner(file);
		inputStream.useDelimiter("[,,,\n]");
		
		String movie;
		String genre;
		Integer year;
		Double rating;
		
		while (inputStream.hasNext())
		{
			movie=inputStream.next();
			genre=inputStream.next();
			year=Integer.parseInt(inputStream.next());
			rating=Double.parseDouble(inputStream.next());
			list.add(new Movie(movie, genre, year, rating));
		}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		name.setCellValueFactory(new PropertyValueFactory<Movie, String>("name"));
		genre.setCellValueFactory(new PropertyValueFactory<Movie, String>("genre"));
		year.setCellValueFactory(new PropertyValueFactory<Movie, Integer>("year"));
		rating.setCellValueFactory(new PropertyValueFactory<Movie, Double>("rating"));
		
		table.setItems(list);
		}
	
}
