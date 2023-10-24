package com.correa.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {


    int[] primeiroLancamento = {10, 20, 30, 40, 50};
    int[] segundoLancamento = {-1, 5, 2, 3, 10};

    @Test
    void validarLancamento() {
        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }
    @Test
    void LancamentoDiferente() {
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }


    
}

