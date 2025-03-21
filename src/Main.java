import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Rose");
        Pedido pedido = new Pedido(cliente1);

        Pedido.exibirCardapio();
        int opcao = 0;
        while (opcao != 6) {
            System.out.print("Digite o número do item: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1 -> pedido.addItem(new Item("X-Calabresa", 16.00));
                case 2 -> pedido.addItem(new Item("Cachorro-Quente", 7.00));
                case 3 -> pedido.addItem(new Item("Petit Gâteau", 50.00));
                case 4 -> pedido.addItem(new Item("Coca Cola 2L", 8.00));
                case 5 -> pedido.addItem(new Item("Sanduíche Natural", 5.50));
                case 6 -> System.out.println("Pedido finalizado.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.print("Digite a forma de pagamento: ");
        input.nextLine();
        String formaPagamento = input.nextLine();
        pedido.selecionarFormaPagamento(formaPagamento);

        pedido.finalizarPedido();

        System.out.println("Total de imposto devido: R$ " + ReceitaFederal.consultarImpostoDevido());
        input.close();
    }
}
