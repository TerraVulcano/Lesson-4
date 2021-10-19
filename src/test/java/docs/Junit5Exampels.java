package docs;

import org.junit.jupiter.api.*;

public class Junit5Exampels {

    @BeforeAll
    static void setup (){

        System.out.println("setup here");
    }

    @BeforeEach
    void each (){

        System.out.println("    befpreeach here");
    }

    @Test
    void someTest() {
        System.out.println("        someTest here");
    }

    @Test
    void anotherTest() {
        System.out.println("        anotherTest here");
    }

    @AfterEach
    void aftereach (){

        System.out.println("    aftereach here");
    }

    @AfterAll
    static void shotdowwn (){

        System.out.println("shotdowwn here");
    }
}