package com.lambdaschool;

public class Birds extends Animals
{
    public Birds(String name, int yrDsc)
    {
        super(name, yrDsc);
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }


}
