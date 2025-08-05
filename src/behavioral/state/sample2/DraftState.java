package behavioral.state.sample2;

// 2. Concrete State Classes
public class DraftState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Moving from Draft to Moderation...");
        doc.setState(new ModerationState());
    }
}