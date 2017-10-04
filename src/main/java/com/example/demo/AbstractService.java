package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class AbstractService
{

    public int getResult(boolean param)
    {
        return getResultAsInteger(param);

    }

    private int getResultAsInteger(final boolean param)
    {
        if (isTrue(param, true))
            return Integer.MAX_VALUE;
        else
            return Integer.MIN_VALUE;
    }

    private boolean isTrue(boolean param, boolean whatever)
    {
        return param && whatever;
    }

}
