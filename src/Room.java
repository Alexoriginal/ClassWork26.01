/**
 * Created by java on 26.01.2018.
 */
public class Room {
    private boolean switcher;

    public Room() {
    }

    public Room(boolean switcher) {
        this.switcher = switcher;
    }

    public boolean isSwitcher() {
        return switcher;
    }

    public void setSwitcher(boolean switcher) {
        if (switcher == false)
            this.switcher = switcher;

    }
}
