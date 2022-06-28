package japbook.jpashop.domain;

import japbook.jpashop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "order_item")
@Getter @Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @Column(name = "item_id")
    private Item item;

    @ManyToOne
    @Column(name = "order_id")
    private Order order;

    private int orderPrice;
    private int count;
}
