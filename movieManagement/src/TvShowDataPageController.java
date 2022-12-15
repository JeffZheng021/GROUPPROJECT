package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TvShowDataPageController implements Initializable{
	
	
	@FXML
	private TableView<TvShow> table;
	@FXML
	private TableColumn<TvShow, String> name;
	@FXML
	private TableColumn<TvShow, String> genre;
	@FXML
	private TableColumn<TvShow, Integer> year;
	@FXML
	private TableColumn<TvShow, Integer> episodes;
	@FXML
	private TableColumn<TvShow, Double> rating;
	
	
	
	ObservableList<TvShow> list = FXCollections.observableArrayList(); 

	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try
		{
		File file = new File("tvshow_data.txt");
		Scanner inputStream = new Scanner(file);
		inputStream.useDelimiter("[,,,,\n]");
		
		String name;
		String genre;
		int year;
		int episodes;
		double rating;
		
		while (inputStream.hasNext())
		{
			name=inputStream.next();
			genre=inputStream.next();
			year=Integer.parseInt(inputStream.next());
			episodes=Integer.parseInt(inputStream.next());
			rating = Double.parseDouble(inputStream.next());
			list.add(new TvShow(name, genre, year, episodes, rating));
		}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		name.setCellValueFactory(new PropertyValueFactory<TvShow, String>("name"));
		genre.setCellValueFactory(new PropertyValueFactory<TvShow, String>("genre"));
		year.setCellValueFactory(new PropertyValueFactory<TvShow, Integer>("year"));
		episodes.setCellValueFactory(new PropertyValueFactory<TvShow, Integer>("episodes"));
		rating.setCellValueFactory(new PropertyValueFactory<TvShow, Double>("rating"));
		
		
		table.setItems(list);
		}
	
}

