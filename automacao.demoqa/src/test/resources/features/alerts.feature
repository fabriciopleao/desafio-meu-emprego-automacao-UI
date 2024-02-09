#Author: fabricioleao2005@hotmail.com

@regressivos
Feature: Validar todos os alerts
  Como QA
  Quero validar todos os alerts
  Para treinar automacao

Background: Acessar a aba de alerts
	 Given que esteja na aba de alerts


  Scenario: Validar alert basico
   When clicar no botao do alert basico
   And validar alert basico
   Then validacao do alert feita com sucesso
   
   Scenario: Validar alert cinco segundos
   When clicar no botao do alert cinco segundos
   And validar alert cinco segundos
   Then validacao do alert feita com sucesso
   
   Scenario: Validar alert de confirmacao OK
   When clicar no botao do alert de confirmacao
   And validar alert de confirmacao botao ok
   Then validacao do alert feita com sucesso
   
   Scenario: Validar alert de confirmacao CANCELAR
   When clicar no botao do alert de confirmacao
   And validar alert de confirmacao botao cancelar
   Then validacao do alert feita com sucesso
   
   Scenario: Validar alert prompt box com pelo menos um caracter
   When clicar no botao do alert com caixa de prompt
   And validar alert prompt box
   Then validacao do alert feita com sucesso
   
