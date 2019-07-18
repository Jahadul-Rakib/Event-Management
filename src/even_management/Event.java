/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even_management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jahadul-Rakib
 */
@Entity
@Table(name = "event", catalog = "eventmanage", schema = "")
@NamedQueries({
    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e")
    , @NamedQuery(name = "Event.findById", query = "SELECT e FROM Event e WHERE e.id = :id")
    , @NamedQuery(name = "Event.findByEventId", query = "SELECT e FROM Event e WHERE e.eventId = :eventId")
    , @NamedQuery(name = "Event.findByName", query = "SELECT e FROM Event e WHERE e.name = :name")
    , @NamedQuery(name = "Event.findByLocation", query = "SELECT e FROM Event e WHERE e.location = :location")
    , @NamedQuery(name = "Event.findByEventduration", query = "SELECT e FROM Event e WHERE e.eventduration = :eventduration")
    , @NamedQuery(name = "Event.findByMinimumNumberOfAttendies", query = "SELECT e FROM Event e WHERE e.minimumNumberOfAttendies = :minimumNumberOfAttendies")
    , @NamedQuery(name = "Event.findByMinimumNumberOfThresold", query = "SELECT e FROM Event e WHERE e.minimumNumberOfThresold = :minimumNumberOfThresold")
    , @NamedQuery(name = "Event.findByEventDescription", query = "SELECT e FROM Event e WHERE e.eventDescription = :eventDescription")})
public class Event implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Id
    @Basic(optional = false)
    @Column(name = "event_id")
    private String eventId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @Column(name = "eventduration")
    private String eventduration;
    @Basic(optional = false)
    @Column(name = "minimum_number_of_attendies")
    private String minimumNumberOfAttendies;
    @Basic(optional = false)
    @Column(name = "minimum_number_of_thresold")
    private String minimumNumberOfThresold;
    @Basic(optional = false)
    @Column(name = "event_description")
    private String eventDescription;

    public Event() {
    }

    public Event(String eventId) {
        this.eventId = eventId;
    }

    public Event(String eventId, String id, String name, String location, String eventduration, String minimumNumberOfAttendies, String minimumNumberOfThresold, String eventDescription) {
        this.eventId = eventId;
        this.id = id;
        this.name = name;
        this.location = location;
        this.eventduration = eventduration;
        this.minimumNumberOfAttendies = minimumNumberOfAttendies;
        this.minimumNumberOfThresold = minimumNumberOfThresold;
        this.eventDescription = eventDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        String oldEventId = this.eventId;
        this.eventId = eventId;
        changeSupport.firePropertyChange("eventId", oldEventId, eventId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public String getEventduration() {
        return eventduration;
    }

    public void setEventduration(String eventduration) {
        String oldEventduration = this.eventduration;
        this.eventduration = eventduration;
        changeSupport.firePropertyChange("eventduration", oldEventduration, eventduration);
    }

    public String getMinimumNumberOfAttendies() {
        return minimumNumberOfAttendies;
    }

    public void setMinimumNumberOfAttendies(String minimumNumberOfAttendies) {
        String oldMinimumNumberOfAttendies = this.minimumNumberOfAttendies;
        this.minimumNumberOfAttendies = minimumNumberOfAttendies;
        changeSupport.firePropertyChange("minimumNumberOfAttendies", oldMinimumNumberOfAttendies, minimumNumberOfAttendies);
    }

    public String getMinimumNumberOfThresold() {
        return minimumNumberOfThresold;
    }

    public void setMinimumNumberOfThresold(String minimumNumberOfThresold) {
        String oldMinimumNumberOfThresold = this.minimumNumberOfThresold;
        this.minimumNumberOfThresold = minimumNumberOfThresold;
        changeSupport.firePropertyChange("minimumNumberOfThresold", oldMinimumNumberOfThresold, minimumNumberOfThresold);
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        String oldEventDescription = this.eventDescription;
        this.eventDescription = eventDescription;
        changeSupport.firePropertyChange("eventDescription", oldEventDescription, eventDescription);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.Event[ eventId=" + eventId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
