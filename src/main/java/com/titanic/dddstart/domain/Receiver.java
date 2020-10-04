package com.titanic.dddstart.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Receiver {

    @Column(name = "receiver_name")
    private String name;

    @Column(name = "receiver_phone")
    private String phone;

    protected Receiver() {
    }

    public Receiver(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
