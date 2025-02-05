package io.alloc.behavior.command.game.command;

import io.alloc.behavior.command.game.receiver.GameCharacter;

public class JumpCommand implements Command {
    private GameCharacter receiver;
    
    public JumpCommand(GameCharacter receiver) {
        this.receiver = receiver;
    }
    

    @Override
    public void execute() {
        this.receiver.jump();
    }

    @Override
    public void undo() {
        System.out.println("Jump command undone");
    }
}
