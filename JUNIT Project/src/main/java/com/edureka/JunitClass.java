package com.edureka;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

    public class JunitClass {

        @Test
        public void setup() {
            String str="This is my first Junit Program";
            assertEquals("This is my first Junit Program",str);

        }
    }


