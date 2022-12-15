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

public class UserDataPageController implements Initializable{
	
	
	@FXML
	private TableView<User> table;
	@FXML
	private TableColumn<User, String> name;
	@FXML
	private TableColumn<User, String> password;
	@FXML
	private TableColumn<User, String> email;
	@FXML
	private TableColumn<User, String> plan;
	
	
	
	ObservableList<User> list = FXCollections.observableArrayList(); 

	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
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
			list.add(new User(name, password, email, plan));
		}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		name.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
		password.setCellValueFactory(new PropertyValueFactory<User, String>("password"));
		email.setCellValueFactory(new PropertyValueFactory<User, String>("email"));
		plan.setCellValueFactory(new PropertyValueFactory<User, String>("plan"));
		
		table.setItems(list);
		}
	
}
