package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem mItemSeller;
	
	@FXML
	private MenuItem mItemDepartment;
	
	@FXML
	private MenuItem mItemAbout;
	
	@FXML
	public void onMIemSellerAction() {
		System.out.println("onMIemSellerAction");
	}
	
	@FXML
	public void onMIemDepartmentAction() {
		System.out.println("onMIemDepartmentAction");
	}
	
	@FXML
	public void onMIemAboutAction() {
		System.out.println("onMIemAboutAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
