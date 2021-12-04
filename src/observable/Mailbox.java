package observable;

import observer.Subscriber;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;

public class Mailbox {
    private String message;

    private PropertyChangeSupport propertyChangeSupport;

    public Mailbox() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void register(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener); // // handle the observer list
    }

    public void unregister(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
    }

    public void setMessage(String value) {
        propertyChangeSupport.firePropertyChange("messages", this.message, value); // replace for loop
        this.message = value;
    }
}
