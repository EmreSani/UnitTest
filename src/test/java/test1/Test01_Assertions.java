package test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test01_Assertions {

    @Test//bu bir test metodudur ve çalıştırılabilir.
    public void test(){

    }

    //String in length metodunu test edelim

    @Test
    void testLength(){

        String str="Hello World!";
        int gercekDeger=str.length();//12
        int beklenenDeger=12;
        assertEquals(beklenenDeger,gercekDeger,"Yanlış uzunluk!");

    }


    //Math addExact
    @Test
    void testAddExact(){

        int actual=Math.addExact(5,8);
        int expected=13;
        int notExpected=14;

        assertEquals(expected,actual);
        assertNotEquals(notExpected,actual);
    }







}
