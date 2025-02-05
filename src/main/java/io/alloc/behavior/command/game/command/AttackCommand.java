package io.alloc.behavior.command.game.command;

import io.alloc.behavior.command.game.receiver.GameCharacter;

public class AttackCommand implements Command {

    private GameCharacter receiver;

    public AttackCommand(GameCharacter receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.attack();
    }

    @Override
    public void undo() {
        System.out.println("Attack command undone");
    }
}
