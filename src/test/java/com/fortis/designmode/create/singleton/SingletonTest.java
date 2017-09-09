package com.fortis.designmode.create.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void getInstance() throws Exception {
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1==s2);
        assert (s1==s2);
    }

}