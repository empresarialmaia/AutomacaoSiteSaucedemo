package projeto_automacao_saucedemo.elementos;

import org.openqa.selenium.By;

public class ElementosLogin  {
	
	public By username = By.id("user-name");
	public By password = By.id("password");
	public By btnLogin = By.id("login-button");
	public By msgUsernameInvalido = By.xpath("//h3[@data-test='error']");
	public By msgPasswordInvalido = By.xpath("//h3[@data-test='error']");
	public By msgUsernameEmBranco = By.xpath("//h3[@data-test='error']");
	public By msgPasswordEmBranco = By.xpath("//h3[@data-test='error']");
	public By msgUsernameBloqueado = By.xpath("//h3[@data-test='error']");
	
	

}