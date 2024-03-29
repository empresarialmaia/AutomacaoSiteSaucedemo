
@regressivoCarrinho
Feature: Carrinho de compras
         
         Como usuario do sistema
         QUERO adicionar itens ao carrinho
         PARA facilitar a organização dos produtos que desejo comprar
      
      
      Background: Configuração carrinho de compras
            Given que o usuario faca login "https://www.saucedemo.com/"	  

  @positivo01
  Scenario: Adicionar item ao carrinho    
    When identificar o item que desejo adicionar ao carrinho
    And clicar em adicionar    
    Then produto adicionado com sucesso
    
  @positivo02
  Scenario: Adicionar mais de um item ao carrinho
    When identicar os dois itens que desejo adicionar ao carrinho
    And clicar no primeiro item para adicionar
    And clicar em continuar shopping para voltar a tela de produtos e adicionar o segundo item
    Then produtos adicionados com sucesso

  