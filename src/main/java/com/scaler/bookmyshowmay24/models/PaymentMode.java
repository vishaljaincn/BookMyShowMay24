package com.scaler.bookmyshowmay24.models;

public enum PaymentMode {
    UPI(10, "vishal"),
    CREDIT_CARD(10, "vishal"),
    DEBIT_CARD(10, "vishal");
    final int id;
    final String name;

    PaymentMode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
