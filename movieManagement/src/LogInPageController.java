package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class LogInPageController {
	
	private Stage stage;
	private Parent root;
	private Scene scene;
	@FXML
	private TextField inputUsername;
	@FXML
	private TextField inputPassword;
	
	public void login(ActionEvent event)
	{	
		if(VerifyLogin.verify(inputUsername.getText(), inputPassword.getText(), "manager_data.txt"))
		{
			
			try {
				root = FXMLLoader.load(getClass().getResource("/SelectionPage.fxml"));
				stage = (Stage)((Node) event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				
				stage.setScene(scene);
				stage.show();
			}
			catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
		else
		{
			System.out.println("login failed");
		}
	}


}