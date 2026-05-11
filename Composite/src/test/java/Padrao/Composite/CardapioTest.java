package Padrao.Composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardapioTest {

    @Test
    void deveRetornarCardapioCompleto() {

        Categoria bebidas = new Categoria("Bebidas");
        Prato coca = new Prato("Coca-Cola", 8.0);
        Prato suco = new Prato("Suco Natural", 10.0);

        bebidas.addItem(coca);
        bebidas.addItem(suco);

        Categoria lanches = new Categoria("Lanches");
        Prato hamburguer = new Prato("Hambúrguer", 25.0);

        lanches.addItem(hamburguer);

        Categoria principal = new Categoria("Cardápio Principal");

        principal.addItem(bebidas);
        principal.addItem(lanches);

        Cardapio cardapio = new Cardapio();
        cardapio.setItemCardapio(principal);

        assertEquals(
                "Categoria: Cardápio Principal\n" +
                        "Categoria: Bebidas\n" +
                        "Prato: Coca-Cola - preço: R$8.0\n" +
                        "Prato: Suco Natural - preço: R$10.0\n" +
                        "Categoria: Lanches\n" +
                        "Prato: Hambúrguer - preço: R$25.0\n",
                cardapio.getItemCardapio()
        );
    }

    @Test
    void deveRetornarExcecaoParaCardapioVazio() {

        try {

            Cardapio cardapio = new Cardapio();

            cardapio.getItemCardapio();

            fail();

        } catch (NullPointerException e) {

            assertEquals("Cardápio vazio", e.getMessage());
        }
    }
}