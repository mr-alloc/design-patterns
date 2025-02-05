package io.alloc.behavior.visitor.filesystem.element;

import io.alloc.behavior.visitor.filesystem.visitor.FileSystemVisitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
