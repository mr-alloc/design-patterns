package io.alloc.behavior.command.game.command;

import io.alloc.behavior.command.game.receiver.GameCharacter;

public class MoveCommand implements Command {
    private GameCharacter receiver;

    public MoveCommand(GameCharacter character) {
        this.receiver = character;
    }

    @Override
    public void execute() {
        receiver.moveForWard();
    }

    @Override
    public void undo() {
        receiver.moveBack();
    }
}
