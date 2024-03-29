#Author: empresarialmaia1@gmail.com

@regressivoLogin
Feature: Login site saucedemo

  COMO usuario do site									
  QUERO informar dados de acesso									
  PARA acessar a conta									

   Background: Configuracao inicial
   Given que o usuario esteja na tela de login "https://www.saucedemo.com/"	 
   


  @positivo
  Scenario: Login com sucesso
    When informar dados validos de login
     And clicar em login apos informar os dados validos
    Then login efetuado com sucesso direcionando para tela de usuário logado


  @negativo1
  Scenario: Login username invalido
    When informar username invalido
     But clicar em login mesmo com username invalido
    Then aparece menssagem solicitando para informar username valido


  @negativo2
  Scenario: Login password invalido
    When informar password invalido
     But clicar em login mesmo com password invalido
    Then aparece menssagem solicitando para informar password valido
    
  @negativo3
  Scenario: Login username em branco
    When deixar o username em branco
     But clicar em login mesmo com o username em branco
    Then aparece menssagem solicitando para informar username 
    
  @negativo4
  Scenario: Login password em branco
    When deixar o password em branco
     But clicar em login mesmo com o password em branco
    Then aparece menssagem solicitando para informar password 

  @negativo5
    Scenario: Login username e password em branco
    When deixar o username e password em branco
     But clicar em login mesmo com username e password em branco
    Then aparece menssagem solicitando para informar username e password 
    
  @negativo6
  Scenario: Login username bloqueado
     When inforamr os dados de username bloqueado
     But clicar em login mesmo informando usuario bloqueado
     Then aparece mensagem solicitando para informar username valido
     
  @negativo7
  Scenario: Login username com problema
      When informar os dados de username com problema
      But clicar em login mesmo informando usuario com problema
      Then direciona para pagina com problema
      
  @negativo8
  Scenario: Login username com falha
      When informar os dados de username com falha
      But clicar em login mesmo informando usuario com falha
      Then direciona para pagina com falha
    
  @negativo9
  Scenario: Login username com erro
    When informar os dados de username com erro
    But clicar em login mesmo informando usuario com erro
    Then direciona para pagina com erro
    
  @negativo10
  Scenario: Login username com problema visual
    When informar os dados de username com problema visual e password
    But clicar em login para seguir
    Then direciona para pagina com erro na imagem 
  
 
  

    
    
  


    