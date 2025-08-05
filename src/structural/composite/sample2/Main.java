package structural.composite.sample2;

// The Composite Pattern is a structural design pattern that lets you treat individual objects and compositions of objects uniformly.
// It's commonly used when you have a tree-like structure where both individual elements and groups of elements need to be treated the same way.

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Folder folder1 = new Folder("Documents");
        folder1.add(file1);
        folder1.add(file2);

        File file3 = new File("photo.jpg");

        Folder root = new Folder("Home");
        root.add(folder1);
        root.add(file3);

        root.ls(); // Output the structure
    }
}
