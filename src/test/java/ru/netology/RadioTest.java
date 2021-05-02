package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void setCurrentStation() {
        Radio radio = new Radio(12,0);
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(20);
        assertEquals(5, radio.getCurrentStation());

    }

    @Test
    void creationSetStationCount() {
        Radio radio = new Radio(11,0);
        assertEquals(11, radio.getStationCount());
    }

    @Test
    void nextStation() {
        Radio radio = new Radio(15,0);
        radio.setCurrentStation(15);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void previousStation() {
        Radio radio = new Radio();
        radio.previousStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio(0,99);
        assertEquals(99, radio.getVolume());
        radio.volumeUp();
        assertEquals(100, radio.getVolume());
        radio.volumeUp();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio(0,1);
        assertEquals(1, radio.getVolume());
        radio.volumeDown();
        assertEquals(0, radio.getVolume());
        radio.volumeDown();
        assertEquals(0,radio.getVolume());
    }

}
