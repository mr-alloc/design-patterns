package io.alloc.behavior.command.game.receiver;

public class GameCharacter {

    private final String name;
    private int positionX = 0;
    private int positionY = 0;

    public GameCharacter(String name) {
        this.name = name;
    }

    public void moveForWard() {
        this.positionX += 1;
        System.out.println(name + " moved forward to position X: " + this.positionX);
    }

    public void moveBack() {
        this.positionX -= 1;
        System.out.println(name + " moved back to position X: " + this.positionX);
    }

    public void jump() {
        positionY += 2;
        System.out.println(name + " jumped to height Y: " + positionY);
        // 중력으로 인해 다시 내려옴
        positionY = 0;
    }

    public void attack() {
        System.out.println(name + " performed attack!");
    }
}
