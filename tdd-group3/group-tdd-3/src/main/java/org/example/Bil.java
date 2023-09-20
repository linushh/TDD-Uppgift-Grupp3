package org.example;

public class Bil {
    private boolean lyse;
    private boolean halvLyse;
    private boolean bakLyse;
    private boolean bilStart;
    private boolean blinkers;
    private int gas;
    private int hastighet;
    private boolean bromsa;

    public boolean isBromsa() {
        return bromsa;
    }

    public void setBromsa(boolean bromsa) {
        this.bromsa = bromsa;
        if (bromsa) {
            setHastighet(0);
        }
    }

    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        if (hastighet > 180) {
            this.hastighet = 180;
        }
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        if (hastighet > 180) {
            this.gas = 0;
        }
        if (gas < 0) {
            this.gas = 0;
        } else if (gas > 100) {
            this.gas = 100;
        }
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
