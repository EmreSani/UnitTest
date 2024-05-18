package test1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_BeforeEachAfterEach {

    String str;

    @BeforeEach
    void beforeEach(){
        str="JUnit";
        System.out.println("beforeEach çalıştı.");
    }

    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("afterEach çalıştı.");

    }

    @Test
    void testUppercase(){

        String actual=str.toUpperCase();
        String expected="JUNİT";

        assertEquals(expected,actual);

    }

    @Test
    void testContains(){

        boolean actual=str.contains("a");
        boolean exp=false;
        assertEquals(exp,actual);


        assertEquals(false,str.contains("a"));
        //veya
        assertFalse(str.contains("a"));//JUnit


        assertTrue(str.contains("U"));


    }





}
