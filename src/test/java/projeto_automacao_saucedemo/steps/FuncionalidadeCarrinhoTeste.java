package projeto_automacao_saucedemo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto_automacao_saucedemo.pages.CarrinhoPage;
import projeto_automacao_saucedemo.runner.Executa;

public class FuncionalidadeCarrinhoTeste {

	CarrinhoPage page = new CarrinhoPage();

	@Given("que o usuario faca login {string}")
	public void queOUsuarioFacaLogin(String url) {
		Executa.iniciarTest(url);

	}

	@When("identificar o item que desejo adicionar ao carrinho")
	public void identificarOItemQueDesejoAdicionarAoCarrinho() {
		page.usuarioLogado();

	}

	@When("clicar em adicionar")
	public void clicarEmAdicionar() {
		page.selecionarItemLoja();

	}

	@Then("produto adicionado com sucesso")
	public void produtoAdicionadoComSucesso() {
		page.carrinho();

	}

	@When("identicar os dois itens que desejo adicionar ao carrinho")
	public void identicarOsDoisItensQueDesejoAdicionarAoCarrinho() {
		page.usuarioLogado();

	}

	@When("clicar no primeiro item para adicionar")
	public void clicarNoPrimeiroItemParaAdicionar() {
		page.selecionarPrimeiroItensLoja();

	}

	@When("clicar em continuar shopping para voltar a tela de produtos e adicionar o segundo item")
	public void clicarEmContinuarShoppingParaVoltarATelaDeProdutosEadicionarOsegundoItem() {
		page.selecionarSegundoItensLoja();

	}

	@Then("produtos adicionados com sucesso")
	public void produtosAdicionadosComSucesso() {
		page.carrinhoMaisItens();

	}

}
