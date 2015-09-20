package ua.dp.mign.domain;

import com.google.common.base.MoreObjects;

public class Priority implements Cloneable {

    private String level;

    public Priority(String level) {
        this.level = level;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public Priority clone() throws CloneNotSupportedException {
        return (Priority)super.clone();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("level", level)
                          .toString();
    }
}
