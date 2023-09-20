package org.example;

public class Bil {
    private boolean lyse;
    private boolean halvLyse;

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

    public boolean isHalvLyse() {
        return this.halvLyse;
    }

    public void setHalvLyse(boolean halvLyse) {
        this.halvLyse = halvLyse;
    }
}
