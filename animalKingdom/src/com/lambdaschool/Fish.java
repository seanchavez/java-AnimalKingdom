package com.lambdaschool;

public class Fish extends Animals
{
    public Fish(String name, int yrDsc)
    {
        super(name, yrDsc);
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
