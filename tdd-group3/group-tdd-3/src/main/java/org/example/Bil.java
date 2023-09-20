package org.example;

public class Bil {
    private boolean lyse;
    private boolean halvLyse;
    private boolean bakLyse;
    private boolean bilStart;
    private boolean blinkers;
    private int hastighet;

    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public boolean isBlinkers() {
        return blinkers;
    }

    public void setBlinkers(boolean blinkers) {
        this.blinkers = blinkers;
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

    public boolean isBakLyse() {
        return bakLyse;
    }

    public void setBakLyse(boolean bakLyse) {
        this.bakLyse = bakLyse;
    }

    public boolean isBilStart() {
        return bilStart;
    }

    public void setBilStart(boolean bilStart) {
        this.bilStart = bilStart;
    }

    public void kontrolleraLysen() {
        if (bilStart == false) {
            setBakLyse(false);
            setLyse(false);
            setHalvLyse(false);
        }

        if (bilStart == true) {
            setLyse(true);
            setHalvLyse(true);
        } else {
            System.out.println("Bilen är igång");
        }
    }
}
