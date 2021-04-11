package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSwitchStationDown() {
        radio.setMaxStation(0);
        radio.setMaxStation(1);
        radio.setMaxStation(2);
        radio.setMaxStation(3);
        radio.setMaxStation(4);
        radio.setMaxStation(5);
        radio.setMaxStation(6);
        radio.setMaxStation(7);
        radio.setMaxStation(8);
        radio.setMaxStation(9);
        assertEquals(0, radio.getMaxStation());
    }

    @Test
    public void shouldSwitchStationUp() {
        radio.setMinStation(9);
        radio.setMinStation(8);
        radio.setMinStation(7);
        radio.setMinStation(6);
        radio.setMinStation(5);
        radio.setMinStation(4);
        radio.setMinStation(3);
        radio.setMinStation(2);
        radio.setMinStation(1);
        radio.setMinStation(0);
        assertEquals(9, radio.getMinStation());
    }

    @Test
    public void shouldSwitchStation() {

        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setMinVolume(10);
        radio.setMinVolume(9);
        radio.setMinVolume(8);
        radio.setMinVolume(7);
        radio.setMinVolume(6);
        radio.setMinVolume(5);
        radio.setMinVolume(4);
        radio.setMinVolume(3);
        radio.setMinVolume(2);
        radio.setMinVolume(1);
        radio.setMinVolume(0);
        radio.setMinVolume(0);
        assertEquals(10, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setMaxVolume(0);
        radio.setMaxVolume(1);
        radio.setMaxVolume(2);
        radio.setMaxVolume(3);
        radio.setMaxVolume(4);
        radio.setMaxVolume(5);
        radio.setMaxVolume(6);
        radio.setMaxVolume(7);
        radio.setMaxVolume(8);
        radio.setMaxVolume(9);
        radio.setMaxVolume(10);
        radio.setMaxVolume(10);
        assertEquals(0, radio.getMaxVolume());
    }

    @Test
    public void shouldChangeStationOverMaximum() {
        radio.setCurrentStation(10);
        assertEquals(9, radio.getMinStation());
    }

    @Test
    public void shouldChangeStationUnderMinimum() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getMaxStation());
    }

    @Test
    public void shouldChangeVolumeOverMaximum() {
        radio.setCurrentVolume(15);
        assertEquals(10, radio.getMinVolume());

    }

    @Test
    public void shouldChangeVolumeUnderMinimum() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getMaxVolume());
    }

    @Test
    public void shouldWork() {
        radio.setOn(true);
        assertEquals(true, radio.isOn());
    }

    @Test
    public void shouldntWork() {
        radio.setOn(false);
        assertEquals(true, radio.isOn());
    }

}



