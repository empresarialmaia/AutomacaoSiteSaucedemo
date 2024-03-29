package projeto_automacao_saucedemo.pages;

import projeto_automacao_saucedemo.elementos.ElementosCarrinho;
import projeto_automacao_saucedemo.elementos.ElementosLogin;
import projeto_automacao_saucedemo.metodos.Metodos;

public class CarrinhoPage {
	
	ElementosLogin login = new ElementosLogin();
	ElementosCarrinho carCompras = new ElementosCarrinho();
	
	
	
	public void usuarioLogado() {
		Metodos.escrever(login.username, "standard_user");
		Metodos.escrever(login.password, "secret_sauce");
		Metodos.clicar(login.btnLogin);
			
	}

	public void selecionarItemLoja() {
		Metodos.clicar(carCompras.backPack);
		
	}
	
	public void carrinho() {
		Metodos.clicar(carCompras.carrinho);
		Metodos.validarUrl("https://www.saucedemo.com/cart.html");
	}
	
	public void selecionarPrimeiroItensLoja() {
		Metodos.clicar(carCompras.backPack);
		
		
		
	}
	public void selecionarSegundoItensLoja() {	
		Metodos.clicar(carCompras.tShirt);
	
	
}
		
	
	public void carrinhoMaisItens() {
		Metodos.clicar(carCompras.carMaisItens);
		Metodos.validarUrl("https://www.saucedemo.com/cart.html");
	}
}

