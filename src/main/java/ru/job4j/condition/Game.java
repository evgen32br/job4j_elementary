package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            String superMario = new String("super mario");
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            String tanks = new String("tanks");
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            String tetris = new String("tetris");
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
