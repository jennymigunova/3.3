package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {

    @Test
    public void shouldGetAndSet() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void setCurrentTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(40);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(5);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }
}