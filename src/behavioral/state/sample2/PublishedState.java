package behavioral.state.sample2;

// 2. Concrete State Classes
public class PublishedState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("The document is already published.");
    }
}