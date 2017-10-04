package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class ServiceTest
{

    @Test
    public void shouldReturnOtherPositiveValueIfTruePassed()
    {
        // given
        final Service service = new Service();

        // when
        final int result = service.getOtherResult(true);

        // then
        assertThat(result).isPositive();
    }

    @Test
    public void shouldReturnOtherNegativeValueIfFalsePassed()
    {
        // given
        final Service service = new Service();

        // when
        final int result = service.getOtherResult(false);

        // then
        assertThat(result).isNegative();
    }
}
