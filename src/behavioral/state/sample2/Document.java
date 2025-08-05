package behavioral.state.sample2;

// 3. Context Class
public class Document {
    private State state;

    public Document() {
        this.state = new DraftState(); // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }
}