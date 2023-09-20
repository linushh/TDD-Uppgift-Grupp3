package org.example;

public class Bil {
    private boolean lyse;
    private boolean halvLyse;
    private boolean bakLyse;



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

    public boolean isBakLyse() {
        return bakLyse;
    }

    public void setBakLyse(boolean bakLyse) {
        this.bakLyse = bakLyse;
    }
}
