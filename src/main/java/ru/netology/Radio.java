package ru.netology;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation > 9) {
            this.currentStation = 0;
            return;
        }
        if(currentStation < 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        if(volume < 0 || volume > 10) return;

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
}
