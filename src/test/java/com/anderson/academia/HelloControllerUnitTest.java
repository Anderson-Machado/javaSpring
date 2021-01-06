package com.anderson.academia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.anderson.academia.controller.HelloController;

import org.junit.jupiter.api.Test;

public class HelloControllerUnitTest {
    @Test
    public void getDiaSemana(){
     HelloController controller = new HelloController();
     String result = controller.getDiaSemana();
     var sem = "DOMINGO";
     assertEquals(sem, result);
    }
}
