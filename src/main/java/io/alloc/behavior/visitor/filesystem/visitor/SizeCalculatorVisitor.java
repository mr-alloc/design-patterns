package io.alloc.behavior.visitor.filesystem.visitor;

import io.alloc.behavior.visitor.filesystem.element.Directory;
import io.alloc.behavior.visitor.filesystem.element.File;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private long totalSize = 0;


    @Override
    public void visit(File file) {
        this.totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        // 디렉토리 자체의 처리는 필요 없음
        for (var child : directory.getChildren()) {
            child.accept(this);
        }
    }

    public long getTotalSize() {
        return this.totalSize;
    }
}
