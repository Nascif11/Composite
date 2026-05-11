package Padrao.Composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemCardapio {

    private List<ItemCardapio> itens;

    public Categoria(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemCardapio>();
    }

    public void addItem(ItemCardapio item) {
        this.itens.add(item);
    }

    @Override
    public String getItem() {

        String saida = "";

        saida = "Categoria: " + this.getDescricao() + "\n";

        for (ItemCardapio item : itens) {
            saida += item.getItem();
        }

        return saida;
    }
}