package Programs;

import Entities.Order;
import Entities.OrderStatusEntrega;

import java.util.Date;
import java.util.Scanner;

public class ProgramEntregas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Digite o nome do produto: ");
        int di = order.getId();
        System.out.println(order);




    }
}
