/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Bean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "userName";
    
    private String userName;
    
    private PropertyChangeSupport propertySupport;
    
    public Bean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return userName;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = userName;
        userName = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, userName);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
