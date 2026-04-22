package com.at.a_enum;

public class Test01 {
    public static void main(String[] args) {
        State unpaid = State.UNPAID;
        System.out.println("unpaid = " + unpaid);

        State unsent = State.UNSENT;
        System.out.println(unsent);
        System.out.println(unsent.toString());
        System.out.println(unsent.getName());

        // values
        State[] values = State.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].getName());
        }

        State sent = State.valueOf("SENT");
        System.out.println("sent =" + sent);
    }
}
