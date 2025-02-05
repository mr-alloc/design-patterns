package io.alloc.behavior.command.game;

import io.alloc.behavior.command.game.command.AttackCommand;
import io.alloc.behavior.command.game.command.Command;
import io.alloc.behavior.command.game.command.JumpCommand;
import io.alloc.behavior.command.game.command.MoveCommand;
import io.alloc.behavior.command.game.invoker.GameController;
import io.alloc.behavior.command.game.receiver.GameCharacter;

public class GameUseCase {

    public static void run() {

        // Receiver 생성
        GameCharacter mario = new GameCharacter("Mario");

        // Commands 생성
        Command moveCommand = new MoveCommand(mario);
        Command jumpCommand = new JumpCommand(mario);
        Command attackCommand = new AttackCommand(mario);

        // Invoker 설정
        GameController controller = new GameController();
        controller.setCommand(0, moveCommand);  // 버튼 0: 이동
        controller.setCommand(1, jumpCommand);  // 버튼 1: 점프
        controller.setCommand(2, attackCommand); // 버튼 2: 공격

        // 게임 플레이 시뮬레이션
        System.out.println("=== Game Start ===");
        controller.pressButton(0); // 이동
        controller.pressButton(1); // 점프
        controller.pressButton(2); // 공격

        System.out.println("\n=== Undo Last Action ===");
        controller.undoLastCommand(); // 마지막 명령 취소
    }
}
