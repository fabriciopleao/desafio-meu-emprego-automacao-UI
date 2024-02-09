#Author: fabricioleao2005@hotmail.com

@regressivos
Feature: Validar todos modais
  Como QA
  Quero validar todos os modais
  Para treinar automacao

Background: Acessar a aba de modais
	 Given que esteja na aba de modais


  Scenario: Validar Small modal
   When clicar no botao small modal
   And validar texto do small modal
   Then validacao do modal feita com sucesso
   
   Scenario: Validar Large modal
   When clicar no botao large modal
   And validar texto do large modal
   Then validacao do alert feita com sucesso
