package projeto_automacao_saucedemo.pages;

import projeto_automacao_saucedemo.elementos.ElementosLogin;
import projeto_automacao_saucedemo.metodos.Metodos;

public class LoginPage {

	ElementosLogin eleLogin = new ElementosLogin();

	public void usernamePassword(String username, String password) {
		Metodos.escrever(eleLogin.username, username);
		Metodos.escrever(eleLogin.password, password);

	}

	public void msgPasswordUsernameInvalido() {
		Metodos.validarTexto(eleLogin.msgUsernameInvalido, "Epic sadface: Username and password do not match any user in this service");

	}

	public void msgUsernameEmBranco() {
		Metodos.validarTexto(eleLogin.msgUsernameEmBranco, "Epic sadface: Username is required");
	}

	public void msgPasswordEmBranco() {
		Metodos.validarTexto(eleLogin.msgPasswordEmBranco, "Epic sadface: Password is required");
	}

	public void msgUsernameBloqueado() {
		Metodos.validarTexto(eleLogin.msgUsernameBloqueado, "Epic sadface: Sorry, this user has been locked out.");

	}

	public void validarUrlLogada() {
		Metodos.validarUrl("https://www.saucedemo.com/inventory.html");

	}

	public void botaoLogin() {
		Metodos.clicar(eleLogin.btnLogin);

	}

}

