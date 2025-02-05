package io.alloc.behavior.visitor.filesystem.element;

import io.alloc.behavior.visitor.filesystem.visitor.FileSystemVisitor;

public class File implements FileSystemElement {

    private final String name;
    private final long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return this.size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
