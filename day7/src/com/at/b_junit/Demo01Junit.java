package com.at.b_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo01Junit {
    @Test
    public void test() {
        System.out.println("test junit");
    }

    @Test
    public void test2() {
        System.out.println("test02");
    }

    @Before
    public void before01() {
        System.out.println("before");
    }

    @After
    public void after01() {
        System.out.println("after");
    }
}
