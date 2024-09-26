package com.nit.constructor;

public class Player {
    private String name1;
    private String name2;

    public Player(String name1, String name2)
    {
        super();
        this.name1 = name1;
        this.name2 = name2;
    }

    public Player(Player p)  //p = p1
    {
        this.name1 = p.name2;
        this.name2 = p.name1;
    }

    @Override
    public String toString() {
        return "Player [name1=" + name1 + ", name2=" + name2 + "]";
    }
}
