package com.company;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by garim_000 on 6/18/2015.
 */
public class TestClass  {

    public static void testEquals(){
        String gingerBiscuit="Ginger";
        String mybiscuit="Ginger";

        assertThat(mybiscuit,equalTo(gingerBiscuit));
        // assertThat(mybiscuit,isNotNull(gingerBiscuit));

        System.out.println("Test pass ");



    }
}

