package com.at.a_enum;

public enum State {
//    UNPAID, // State UNPAID = new State()
//    PAID, // State PAID = new State()
//    UNSENT, // State UNSENT = new State()
//    SENT; // State SENT = new State()

    UNPAID("unpaid"),   // State UNPAID = new State("unpaid")
    PAID("paid"), // State PAID = new State("paid")
    UNSENT("unsent"), // State UNSENT = new State("unsent")
    SENT("sent"); // State SENT = new State("sent")
    String name;
    State() {

    }
    State(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
