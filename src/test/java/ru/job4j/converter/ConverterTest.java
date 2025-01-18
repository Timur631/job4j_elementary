package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        double output = Converter.rubleToEuro(140);
        assertThat(output).isEqualTo(2, withPrecision(1.0));
    }

}