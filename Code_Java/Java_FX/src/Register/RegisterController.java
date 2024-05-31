package Register;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegisterController {
	@FXML
	private TextField EmailTF;
	@FXML
	private TextField FullNameTF;
	@FXML
	private Label errorL;


	@FXML
	public void onClick() {
		String email = EmailTF.getText();
		String hoTen = FullNameTF.getText();
	}
}
