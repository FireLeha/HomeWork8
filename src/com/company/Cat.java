package com.company;

public class Cat implements JumpableRunnable {
    private int maxHeight;
    private int maxLength;
    private String name;

    public Cat(int maxHeight, int maxLength, String nickname) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public String toString() {
        return "Кот по имени " + name;
    }
}
