package com.lambdaschool;

public class Mammals extends Animals
{
    public Mammals(String name, int yrDsc)
    {
        super(name, yrDsc);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }


}
