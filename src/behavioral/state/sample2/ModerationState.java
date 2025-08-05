package behavioral.state.sample2;

// 2. Concrete State Classes
public class ModerationState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Approving and publishing the document...");
        doc.setState(new PublishedState());
    }
}