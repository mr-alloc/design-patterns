package io.alloc.behavior.visitor.filesystem;

import io.alloc.behavior.visitor.filesystem.element.Directory;
import io.alloc.behavior.visitor.filesystem.element.File;
import io.alloc.behavior.visitor.filesystem.visitor.FileListPrinterVisitor;
import io.alloc.behavior.visitor.filesystem.visitor.SizeCalculatorVisitor;

public class FileSystemUseCase {

    public static void run() {
        // 파일 시스템 구조 생성
        Directory root = new Directory("root");
        Directory documents = new Directory("documents");
        Directory pictures = new Directory("pictures");

        root.addChild(documents);
        root.addChild(pictures);

        documents.addChild(new File("visitor-pattern.md", 42366));
        documents.addChild(new File("composite-pattern.md", 32456));

        pictures.addChild(new File("visitor-pattern-intro.png", 83456));
        pictures.addChild(new File("visitor-pattern-diagram.svg", 23456));

        //크기 계산 Visitor 사용
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total Size: " + sizeVisitor.getTotalSize() + " bytes");

        // 파일 목록 출력 Visitor 사용
        FileListPrinterVisitor printerVisitor = new FileListPrinterVisitor();
        root.accept(printerVisitor);
    }
}
