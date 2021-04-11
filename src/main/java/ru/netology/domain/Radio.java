package ru.netology.domain;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public int getMaxStation() {
        if (maxStation == 9) {
            setMaxStation(0);
            setMinStation(0 + 1);
        }
        return maxStation;
    }


    public void setMaxStation(int maxStation) {
        if (maxStation > 9) {
            return;
        }
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        if (minStation == 0) {
            setMinStation(9);
            setMaxStation(0 - 1);
        }
        return minStation;
    }

    public void setMinStation(int minStation) {
        if (minStation < 0) {
            return;
        }
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }

        this.currentStation = currentStation;
    }


    public int getMaxVolume() {
        if (maxVolume == 10) {
            setMaxVolume(0);
        }
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (maxVolume > 10) {
            return;
        }
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        if (minVolume == 0) {
            setMinVolume(10);

        }
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        if (minVolume < 0) {
            return;
        }
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public boolean isOn() {
        if (on = false) {
            setOn(true);
        }
        if (on = true) {
            setOn(false);
        }
        return on;
    }


    public void setOn(boolean on) {
        if (on = true) {
            return;
        }
        this.on = on;
    }
}






