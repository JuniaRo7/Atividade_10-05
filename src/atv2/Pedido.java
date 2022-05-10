package atv2;

import java.util.ArrayList;


public class Pedido {
    private ArrayList<ItemPedido> itens;
    private double valorTotal;

    public Pedido(){
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(ItemPedido novoItem){
        this.itens.add(novoItem);
        atualizaValorTotal(novoItem);
    }

    private void atualizaValorTotal(ItemPedido novoItem){
        int qtd = novoItem.getQuantidade();
        double valor = novoItem.getProduto().getValor();
        this.valorTotal = this.valorTotal + valor*qtd;
    }

    public double obterTotal(){
        return valorTotal;
    }
}
