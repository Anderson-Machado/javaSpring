package com.anderson.academia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.anderson.academia.model.Professor;

import org.junit.jupiter.api.Test;

public class ProfessorUnitTest {
    @Test
    public void TesteSomaSucesso(){
        Professor prf = new Professor();
       var result = prf.Soma(2, 5);
        assertEquals(7, result);
    }
    @Test
    public void TesteSomaFalha(){
       Professor prf = new Professor();
       var result = prf.Soma(2, 5);
       assertNotEquals(9, result);
    }
}
