package atv2;

public class App {

    public static void main(String[] args) {
        // criar um objeto de Produto
        Produto prod1 = new Produto(111, 1200.00, "PC da Positivo");
        Produto prod2 = new Produto(222, 3500.00, "MacBook");
        // criar  um objeto ItemPedido
        ItemPedido itemProd1 = new ItemPedido(5, prod1);
        ItemPedido itemProd2 = new ItemPedido(3, prod2);

       
        //Imprimir dados do Projeto que está em ItemPedido
        System.out.println("Descrição: "+ itemProd1.getProduto().getDescricao());

        System.out.println("Valor Total: "+ itemProd1.getProduto().getValor() * itemProd1.getQuantidade());

        System.out.println("Descrição: "+ itemProd2.getProduto().getDescricao());

        System.out.println("Valor Total: "+ itemProd2.getProduto().getValor() * itemProd2.getQuantidade());

        //criar um objeto do tipo Pedido 
        Pedido pedido = new Pedido();
        //adicionar um ItemPedido ao Pedido
        pedido.adicionarItem(itemProd1);
        pedido.adicionarItem(itemProd2);
        //imprimir o valor total
        System.out.println("Valor total: "+ pedido.obterTotal());

        //Desafio: Adicionar +1 Produto , + 1 ItemPedido
        //e adicionar ao objeto pedido acima.
        //Verificar valor total"
    }
    
}
