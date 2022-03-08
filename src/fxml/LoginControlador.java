package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;
	
	public void entar() {
		
		boolean emailValido = campoEmail.getText().equals("pipo@hotmail.com");
		boolean senhaValida = campoSenha.getText().equals("12345678");
		
		if(emailValido && senhaValida) {
			System.out.println("Sucesso");
		}else {
			System.out.println("E-mail ou senha inválidos");
		}
	}

}
