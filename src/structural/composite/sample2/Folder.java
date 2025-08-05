package structural.composite.sample2;

// Composite
import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem component) {
        children.add(component);
    }

    @Override
    public void ls() {
        System.out.println("Folder: " + name);
        for (FileSystem child : children) {
            child.ls();
        }
    }
}
