package org.example;

public class Bil {
    private boolean lyse;

    public Bil(boolean lyse) {
        this.lyse = lyse;
    }

    public boolean isLyse() {
        return lyse;
    }

    public void setLyse(boolean lyse) {
        this.lyse = lyse;
    }

    public String lyseOnEllerOf() {
        if (this.lyse) {
            return "Lyser som satan";
        }
        return "Ser inte ett skit";
    }
}
