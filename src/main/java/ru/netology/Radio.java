package ru.netology;

public class Radio {
    private int currentStation;
    private int stationCount = 10;
    private int volume;

    public Radio(int stationCount, int volume) {
        this.stationCount = stationCount;
        this.volume = volume;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation == stationCount+1) {
            this.currentStation = 0;
            return;
        }
        if(currentStation > stationCount) {
            return;
        }
        if(currentStation == -1) {
            this.currentStation = stationCount;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        if(volume < 0 || volume > 100) return;

        this.volume = volume;
    }

    public void nextStation() {
        this.setCurrentStation(this.currentStation + 1);
    }

    public void previousStation() {
        this.setCurrentStation(this.currentStation - 1);
    }

    public void volumeUp() {
        this.setVolume(this.volume + 1);
    }

    public void volumeDown() {
        this.setVolume(this.volume - 1);
    }

    public int getStationCount() {
        return stationCount;
    }

}
