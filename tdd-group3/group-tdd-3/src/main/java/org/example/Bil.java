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
    private int vaxel;
    private boolean batteri;
    private boolean batteriDrain;

    public boolean getDrain() {
        return batteriDrain;
    }

    public void setBatteri(boolean bat) {
        this.batteri = bat;
    }

    public boolean getBatteri() {
        return batteri;
    }

    public void setVaxel(int val) {
        if (val == 1) {
            this.vaxel = val;
        } else if (val == 0) {
            this.vaxel = val;
        } else {
            this.vaxel = 0;
        }
    }

    public String getVaxel() {
        if (vaxel == 1) {
            return "Drive";
        } else if (vaxel == 0) {
            return "Reverse";
        }
        return null;
    }

    public boolean isBromsa() {
        return bromsa;
    }

    public void setBromsa(boolean broms) {
        if (broms) {
            setBakLyse(true);
            setHastighet(0);
        }
        this.bromsa = broms;
    }

    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        if (hastighet > 180) {
            this.hastighet = 180;
        } else if (hastighet < 0) {
            this.hastighet = 0;
        } else {
            this.hastighet = hastighet;
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
        this.batteriDrain = blinkers;
    }

    public boolean isLyse() {
        return lyse;
    }

    public void setLyse(boolean lyse) {
        this.lyse = lyse;
        this.batteriDrain = lyse;
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
        this.batteriDrain = halvLyse;
    }

    public boolean isBakLyse() {
        return bakLyse;
    }

    public void setBakLyse(boolean bakLyse) {
        this.bakLyse = bakLyse;
        this.batteriDrain = bakLyse;
    }

    public boolean isBilStart() {
        return bilStart;
    }

    public void setBilStart(boolean bilStart) {
        this.bilStart = bilStart;
        this.batteriDrain = bilStart;
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
