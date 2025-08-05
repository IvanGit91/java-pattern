package behavioral.state.sample2;

/*
* The State Pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes.
* It’s useful when an object must change its behavior depending on its current state, and you want to avoid complex if-else or switch statements.
* */

// 4. Client Code
public class Main {
    public static void main(String[] args) {
        Document doc = new Document();

        doc.publish(); // Output: Moving from Draft to Moderation...
        doc.publish(); // Output: Approving and publishing the document...
        doc.publish(); // Output: The document is already published.
    }
}