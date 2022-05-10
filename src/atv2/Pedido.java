package atv2;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens;
    private double valorTotal;

    public Pedido(){
        this.itens = new ArrayList<>();
    }
    
}
