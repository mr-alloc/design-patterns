package io.alloc.behavior.visitor.filesystem.visitor;

import io.alloc.behavior.visitor.filesystem.element.Directory;
import io.alloc.behavior.visitor.filesystem.element.File;

public class FileListPrinterVisitor implements FileSystemVisitor {

    @Override
    public void visit(File file) {
        System.out.println("File: " + file.getName() + ", Size: " + file.getSize() + " bytes");
    }

    @Override
    public void visit(Directory directory) {
        System.out.println("Directory: " + directory.getName());
        for (var child : directory.getChildren()) {
            child.accept(this);
        }
    }
}
