package Entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {
    private Integer id;
    private LocalDateTime moment;
    private OrderStatusEntrega satus_pedido;
    public LocalDateTime horario_pedido;

    public Order(int i, Date date, OrderStatusEntrega pagamentoPendente){

    }
    public Order(Integer id, LocalDateTime moment, OrderStatusEntrega status_pedido,LocalDateTime horario_pedido){
        this.id = id;
        this.moment = moment;
        this.satus_pedido = status_pedido;
        this.horario_pedido = horario_pedido;

    }

    public Order() {

    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatusEntrega getSatus_pedido() {
        return satus_pedido;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public void setSatus_pedido(OrderStatusEntrega satus_pedido) {
        this.satus_pedido = satus_pedido;
    }

    public LocalDateTime getHorario_pedido() {
        return horario_pedido;
    }

    public void setHorario_pedido(LocalDateTime horario_pedido) {
        this.horario_pedido = horario_pedido;
    }
    public String Status(){
        if (horario_pedido.isEqual(moment)){
            satus_pedido = OrderStatusEntrega.PAGAMENTO_PENDENTE;
        }
        return Status();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", satus_pedido=" + satus_pedido +
                ", horario_pedido=" + horario_pedido +
                '}';
    }
}
