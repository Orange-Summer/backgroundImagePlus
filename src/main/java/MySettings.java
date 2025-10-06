import com.intellij.openapi.components.PersistentStateComponent;

/**
 * @author Orange Summer
 * @version 1.0
 * @classname MySettings
 * @description TODO
 * @createTime 2025/10/5
 */
public class MySettings implements PersistentStateComponent<MySettings.State> {
    public static class State {
        public String folder = "";
        public boolean autoChange = false;
        public int interval = 0;
    }

    private State state = new State();

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void loadState(State state) {
        myState = state;
    }
}
