package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener {

    private String message;

    private void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setMessage((String) evt.getNewValue());
    }
}
