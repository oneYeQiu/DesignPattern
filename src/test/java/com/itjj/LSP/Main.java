package com.itjj.LSP;

import com.itjj.LSP.Impl.Penguin;
import com.itjj.LSP.Impl.Sparrow;

public class Main {
    public static void makeBirdFly(Flyable bird) {
        bird.fly(); // 只接受会飞的鸟
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        makeBirdFly(sparrow); // 正常
//        makeBirdFly(penguin); // 编译错误，企鹅不是Flyable，避免运行时异常
    }
}
