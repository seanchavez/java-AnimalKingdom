package com.lambdaschool;

public abstract class Animals implements Animal
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int yrDsc;

    public Animals(String name, int yrDsc)
    {
        this.name = name;
        this.yrDsc = yrDsc;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYrDsc()
    {
        return yrDsc;
    }

    public void setYrDsc(int yrDsc)
    {
        this.yrDsc = yrDsc;
    }

    public String eat(String food)
    {
        food = "";
        return food;
    }
}
