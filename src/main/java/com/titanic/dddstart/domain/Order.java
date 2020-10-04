package com.titanic.dddstart.domain;

import javax.persistence.*;

@Entity
@Table(name = "purchase_order")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_no")
    private Long id;

    @Embedded
    private Orderer orderer;

    @Embedded
    private ShippingInfo shippingInfo;

}
