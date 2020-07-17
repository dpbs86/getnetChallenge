#DESAFIO AUTOMAÇÃO
#Passos:
#1 - Acessar o site: https://site.getnet.com.br/
#2 - No campo de busca(LUPA), pesquisar por "superget"
#3 - No resultado da busca, clicar no link "Posso contratar a condição de recebimento de 2% para qualquer maquininha?"
#4 – Verificar se a modal foi aberta e tem a mensagem: “Observação: essa condição de recebimento não é válida para E-commerce.”
#Preferencialmente desenvolver com linguagem Java, com selenium, cucumber.
@Search
  Feature: Getnet Challenge - Check search field and messages
    As a site user
    I must use the field to search and get results relevant to my search
    Clicking on a result I should see more information about what was searched

    Scenario: Validate message
    Given that I access the getnet site
    And fill in the search with "superget"
    When I see the search result and click
    Then I must see the message with the informative content with the text


