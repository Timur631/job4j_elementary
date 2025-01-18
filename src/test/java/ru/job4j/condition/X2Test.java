package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}