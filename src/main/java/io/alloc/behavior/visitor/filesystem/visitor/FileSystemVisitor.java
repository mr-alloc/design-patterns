package io.alloc.behavior.visitor.filesystem.visitor;


import io.alloc.behavior.visitor.filesystem.element.Directory;
import io.alloc.behavior.visitor.filesystem.element.File;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
