package com.itjj.LSP.Impl;

import com.itjj.LSP.Bird;
import com.itjj.LSP.Flyable;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("sparrow eat");
    }

    @Override
    public void fly() {
        System.out.println("sparrow fly");
    }
}
