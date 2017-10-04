package com.example.demo;

@org.springframework.stereotype.Service
public class Service extends AbstractService
{

    public int getOtherResult(final boolean param)
    {
        if (param)
            return Integer.MAX_VALUE;
        else
            return Integer.MIN_VALUE;
    }
}
