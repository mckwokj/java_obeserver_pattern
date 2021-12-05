package observable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Mailbox {
    private String message;

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void register(PropertyChangeListener propertyChangeListener) {
        support.addPropertyChangeListener(propertyChangeListener); // // handle the observer list
    }

    public void unregister(PropertyChangeListener propertyChangeListener) {
        support.removePropertyChangeListener(propertyChangeListener);
    }

    public void setMessage(String value) {
        support.firePropertyChange("messages", this.message, value); // replace for loop
        this.message = value;
    }
}
