#Author: fabricioleao2005@hotmail.com

@regressivos
Feature: Validar o formulario de inscricao de estudante
  Como estudante de QA
  Quero validar o formulario de inscricao
  Para praticar automacao

Background: Acessar a aba do formulario
	 Given que esteja na aba do formulario

	
  Scenario: Inscricao com dados validos
  When preencher primeiro nome
  And preencher sobrenome
  And preecher email valido
  And selecionar genero
  And preencher numero de telefone com dez digitos
  And selecionar data de aniversario
  And selecionar uma das opcoes de assunto 
  And selecionar hobbie
  And selecionar imagem
  And preencher endereco
  And selecionar estado
  And selecionar cidade
  And clicar em enviar
  Then inscricao feita com sucesso
  
  Scenario: Inscricao com dados invalidos
  When preencher primeiro nome
  And preencher sobrenome
  But preecher email invalido
  And selecionar genero
  But preencher numero de telefone com menos de dez digitos
  And selecionar data de aniversario
  And selecionar uma das opcoes de assunto 
  And selecionar hobbie
  And selecionar imagem
  And preencher endereco
  And selecionar estado
  And selecionar cidade
  And clicar em enviar
  Then sistema retorna com avisos de erro
  
  Scenario: Inscricao com dados em branco
  But nao preencher campos obrigatorios
  And clicar em enviar
  Then sistema retorna com avisos de erro
  

