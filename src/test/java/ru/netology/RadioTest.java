package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(-5);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio();

        for(int i = 1; i <= 11; i++){
            radio.volumeUp();

            if (i == 11) assertEquals(10,radio.getVolume());
            else assertEquals(i,radio.getVolume());
        }
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();

        for(int i = 0; i <= 2; i++) {
            radio.volumeUp();
        }
        assertEquals(3, radio.getVolume());
        for (int i = 3; i >=0; i--){
            radio.volumeDown();
            if (i== 0) assertEquals(0,radio.getVolume());
            else assertEquals(i - 1, radio.getVolume());
        }
    }

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void previousStation() {
        Radio radio = new Radio();
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());

    }
}
