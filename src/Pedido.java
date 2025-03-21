//SISTEMA DE PEDIDOS DE RESTAURANTE

import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private Cliente cliente;
    private List<Item> itens;
    private String formaPagamento;
    private double taxaImposto = 0.1;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    public void selecionarFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double calcularTotal() {
        double total = itens.stream().mapToDouble(Item::getPreco).sum();
        return total;
    }

    public void finalizarPedido() {
        double total = calcularTotal();
        double imposto = total * taxaImposto;
        ReceitaFederal.registrarImposto(imposto);
        System.out.println("Pedido finalizado para " + cliente.getNomeDoCliente());
        System.out.println("Total: R$ " + total);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Imposto recolhido: R$ " + imposto);
    }

    public static void exibirCardapio() {
        System.out.println("Escolha os itens do cardápio:");
        System.out.println("1- X-Calabresa - R$16,00");
        System.out.println("2- Cachorro-Quente - R$7,00");
        System.out.println("3- Petit Gâteau - R$50,00");
        System.out.println("4- Coca Cola 2L - R$8,00");
        System.out.println("5- Sanduíche Natural - R$5,50");
        System.out.println("6- Finalizar pedido");
    }

    }

