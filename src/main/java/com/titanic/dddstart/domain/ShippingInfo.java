package com.titanic.dddstart.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class ShippingInfo {

    @Embedded
    private Receiver receiver;

    protected ShippingInfo() {
    }
}
