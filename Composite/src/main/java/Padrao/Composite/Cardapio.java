package Padrao.Composite;

public class Cardapio {

    private ItemCardapio itemCardapio;

    public void setItemCardapio(ItemCardapio itemCardapio) {
        this.itemCardapio = itemCardapio;
    }

    public String getItemCardapio() {

        if (this.itemCardapio == null) {
            throw new NullPointerException("Cardápio vazio");
        }

        return this.itemCardapio.getItem();
    }
}