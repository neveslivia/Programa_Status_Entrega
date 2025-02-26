package Programs;

import Entities.Order;
import Entities.OrderStatusEntrega;
import Entities.Products;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ProgramEntregas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products product = new Products();

        System.out.println("Digite o nome do produto: ");
        product.nome = sc.next();
        System.out.println("Digite o valor do produto: ");
        product.valor_produto = sc.nextDouble();
        System.out.println("Digite a quantidade de produtos comprados: ");
        product.quantidade = sc.nextInt();
        System.out.println("Digite o código de rastreio do pedido: ");
        Integer id = sc.nextInt();

        Order order = new Order(id, LocalDateTime.now(), OrderStatusEntrega.PAGAMENTO_PENDENTE);
        String continuar;

        do  {
            System.out.println("Deseja atualizar o status do pedido? (S/N)");
            continuar = sc.next().toUpperCase();

            if (continuar.equals("S")) {
                order.atualizacao();
            } else if (continuar.equals("N")) {
                break;
            } else {
                System.out.println("Entrada inválida! Digite 'S' para continuar ou 'N' para sair.");
            }
        }while (continuar.equals("S"));

        System.out.println("Resumo do Pedido");
        System.out.println(product);
        System.out.println(order);

        sc.close();







    }
}
