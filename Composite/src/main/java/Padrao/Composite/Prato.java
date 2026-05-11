package Padrao.Composite;

public class Prato extends ItemCardapio {

    private double preco;

    public Prato(String descricao, double preco) {
        super(descricao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getItem() {
        return "Prato: " + this.getDescricao() +
                " - preço: R$" + this.preco + "\n";
    }
}