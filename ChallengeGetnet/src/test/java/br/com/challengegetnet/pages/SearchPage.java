package br.com.challengegetnet.pages;

import br.com.challengegetnet.support.DriverFactory;
import br.com.challengegetnet.support.Utils;
import org.openqa.selenium.By;
import static br.com.challengegetnet.support.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

public class SearchPage {

    Utils utils = new Utils();

    public void accessSite(){
        getDriver().get("https://site.getnet.com.br/");
    }

    public void checkTitle(){
        getDriver().getTitle().equals("Getnet: Maquininhas de Cartão e Soluções para o seu Negócio");
    }

    public void fillSearchField(String wordSearch){
        getDriver().findElement(By.xpath("//span[text()=\"buscar\"]")).click();
        getDriver().findElement(By.id("global-search-input")).sendKeys(wordSearch);
        getDriver().findElement(By.xpath("//button[text()=\"Procurar\"]")).click();
    }

    public void findOption(){
        utils.scrollDown();
        getDriver().findElement(By.xpath("/html/body/div[1]/div/section/div/a[2]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Posso contratar a condição de recebimento de 2% para qualquer maquininha?')]")).click();
    }

    public void checkMessage() {
            getDriver().findElement(By.xpath("/html/body/div[27]/div")).isDisplayed();
            String textoMensagem = getDriver().findElement(By.xpath("//*[text()[contains(., 'Observação: essa condição de recebimento não é válida para E-commerce.')]]")).getText();
            assertEquals("Sim, se você por Pessoa Física, MEI ou Pessoa Jurídica com faturamento de até R$3 milhões por ano, é possível contratar para SuperGet " +
                    "Aluguel ou Compra, POS Chip Aluguel, POS 3G + Wi-Fi Aluguel, POS Digital Aluguel e TEF. Observação: essa condição de recebimento não é válida para " +
                    "E-commerce.", textoMensagem);
    }
    public void closeBrowser() {
        DriverFactory.killDriver();
    }

}
