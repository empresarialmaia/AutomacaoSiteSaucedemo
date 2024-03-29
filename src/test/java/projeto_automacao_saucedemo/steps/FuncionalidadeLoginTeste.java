package projeto_automacao_saucedemo.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto_automacao_saucedemo.pages.LoginPage;
import projeto_automacao_saucedemo.runner.Executa;

public class FuncionalidadeLoginTeste {

	String username = "standard_user";
	String password = "secret_sauce";
	String userInvalido = "invalido";
	String passInvalido = "invalido";
	String userBloqueado = "locked_out_user";
	String userComProblema = "problem_user";
	String userComFalha = "performance_glitch_user";
	String userComErro = "error_user";
	String userErroVisual = "visual_user";
	

	LoginPage page = new LoginPage();

	@After
	public void depoisDoTest() {
		Executa.encerrarTest();
	}

	@Given("que o usuario esteja na tela de login {string}")
	public void queOUsuarioEstejaNaTelaDeLogin(String url) {
		Executa.iniciarTest(url);

	}

	@When("informar dados validos de login")
	public void informarDadosValidosDeLogin() {
		page.usernamePassword(username, password);

	}

	@When("clicar em login apos informar os dados validos")
	public void clicarEmLoginAposInformarOsDadosValidos() {
		page.botaoLogin();

	}

	@Then("login efetuado com sucesso direcionando para tela de usuário logado")
	public void loginEfetuadoComSucessoDirecionandoParaTelaDeUsuárioLogado() {

	}

	@When("informar username invalido")
	public void informarUsernameInvalido() {
		page.usernamePassword("invalido", password);

	}

	@When("clicar em login mesmo com username invalido")
	public void clicarEmLoginMesmoComUsernameInvalido() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar username valido")
	public void apareceMenssagemSolicitandoParaInformarUsernameValido() {
		page.msgPasswordUsernameInvalido();

	}

	@When("informar password invalido")
	public void informarPasswordInvalido() {
		page.usernamePassword(username, "invalido");

	}

	@When("clicar em login mesmo com password invalido")
	public void clicarEmLoginMesmoComPasswordInvalido() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar password valido")
	public void apareceMenssagemSolicitandoParaInformarPasswordValido() {
		page.msgPasswordUsernameInvalido();

	}

	@When("deixar o username em branco")
	public void deixarOUsernameEmBranco() {
		page.usernamePassword("", password);


	}

	@When("clicar em login mesmo com o username em branco")
	public void clicarEmLoginMesmoComOUsernameEmBranco() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar username")
	public void apareceMenssagemSolicitandoParaInformarUsername() {
		page.msgUsernameEmBranco();

	}

	@When("deixar o password em branco")
	public void deixarOPasswordEmBranco() {
		page.usernamePassword(username, "");

	}

	@When("clicar em login mesmo com o password em branco")
	public void clicarEmLoginMesmoComOPasswordEmBranco() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar password")
	public void apareceMenssagemSolicitandoParaInformarPassword() {
		page.msgPasswordEmBranco();

	}

	@When("deixar o username e password em branco")
	public void deixarOUsernameEPasswordEmBranco() {
		

	}

	@When("clicar em login mesmo com username e password em branco")
	public void clicarEmLoginMesmoComUsernameEPassordEmBranco() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar username e password")
	public void apareceMenssagemSolicitandoParaInformarUsernameEPassword() {
		page.msgUsernameEmBranco();

	}

	@When("inforamr os dados de username bloqueado")
	public void inforamrODadosDeUsernameBloqueado() {
		page.usernamePassword(userBloqueado, password);


	}

	@When("clicar em login mesmo informando usuario bloqueado")
	public void clicarEmLoginMesmoInformandoUsuarioBloqueado() {
		page.botaoLogin();

	}

	@Then("aparece mensagem solicitando para informar username valido")
	public void apareceMensagemSolicitandoParaInformarUsernameValido() {
		page.msgUsernameBloqueado();

	}

	@When("informar os dados de username com problema")
	public void informarOsDadosDeUsernameComProblema() {
		page.usernamePassword(userComProblema, password);


	}

	@When("clicar em login mesmo informando usuario com problema")
	public void clicarEmLoginMesmoInformandoUsuarioComProblema() {
		page.botaoLogin();

	}

	@Then("direciona para pagina com problema")
	public void direcionaParaPaginaComProblema() {
		page.validarUrlLogada();

	}

	@When("informar os dados de username com falha")
	public void informarOsDadosDeUsernameComFalha() {
		page.usernamePassword(userComFalha, password);


	}

	@When("clicar em login mesmo informando usuario com falha")
	public void clicarEmLoginMesmoInformandoUsuarioComFalha() {
		page.botaoLogin();

	}

	@Then("direciona para pagina com falha")
	public void direcionaParaPaginaComFalha() {
		page.validarUrlLogada();

	}

	@When("informar os dados de username com erro")
	public void informarOsDadosDeUsernameComErro() {
		page.usernamePassword(userComErro, password);


	}

	@When("clicar em login mesmo informando usuario com erro")
	public void clicarEmLoginMesmoInformandoUsuarioComErro() {
		page.botaoLogin();

	}

	@Then("direciona para pagina com erro")
	public void direcinaParaPaginaComErro() {
		page.validarUrlLogada();

	}

	@When("informar os dados de username com problema visual e password")
	public void informarOsDadosDeUsernameComProblemaVisualEPassword() {
		page.usernamePassword(userErroVisual, password);

	}

	@When("clicar em login para seguir")
	public void clicarEmLoginParaSeguir() {
		page.botaoLogin();

	}

	@Then("direciona para pagina com erro na imagem")
	public void direcionaParaPaginaComErroNaImagem() {
		page.validarUrlLogada();

	}

}
