package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;


public class AbstractServiceTest
{

    private AbstractService service;

    @Before
    public void setup()
    {
        service = new AbstractService()
        {
        };
    }

    @Test
    public void shouldReturnPositiveValueIfTruePassed()
    {
        // given

        // when
        final int result = service.getResult(true);

        // then
        assertThat(result).isPositive();
    }

    @Test
    public void shouldReturnNegativeValueIfFalsePassed()
    {
        // given

        // when
        final int result = service.getResult(false);

        // then
        assertThat(result).isNegative();
    }

}
