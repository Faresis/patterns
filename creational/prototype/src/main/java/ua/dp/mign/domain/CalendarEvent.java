package ua.dp.mign.domain;

import com.google.common.base.MoreObjects;

public class CalendarEvent implements Prototype {

    private final String name;
    private Priority priority;

    public CalendarEvent(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public Priority getPriority() {
        return this.priority;
    }

    @Override
    public CalendarEvent clone() throws CloneNotSupportedException {
        CalendarEvent event = (CalendarEvent)super.clone();
        event.priority = this.priority.clone();
        return event;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("name", name)
                          .add("priority", priority)
                          .toString();
    }
}
