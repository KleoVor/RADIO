package ru.netology.qa55;

public class Radio {
    private int currentRadioStationNumber; // поле Текущий номер радиостанции
    private int currentVolume; // поле Громкоть звука
    private int maxRadio = 9; // переменная maxRadio - максимальное кол-во станций радио по умолчанию по условию их 10 - первая 0, последняя 9

    // констурктор для создания радиостанций по умолчанию = 10
    public Radio() {
    }

    // констурктор для создания радиостанций количество задается пользователем
    public Radio(int maxRadio) {
        this.maxRadio = (maxRadio-1);
    }

    // геттеры выводят текущий номер радиостанции, текущую громкость, максимальное кол-во станций, сеттер на ввод максимального кол-ва станций
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public int setMaxRadio(int newMaxRadio) {
        maxRadio = newMaxRadio;
        return maxRadio;
    }


    // увеличивает номер текущей радиостанции от 0 до 9 если текущий номер меньше 9, иначе ставит 0 для кол-ва станций по умоланию 10

    public void NextRadioStationNumber() {
        if (currentRadioStationNumber < maxRadio) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else currentRadioStationNumber = 0;
    }


    // уменьшает номер если текущий номер радиостанции больше 0

    public int PrevRadioStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else currentRadioStationNumber = maxRadio;
        return maxRadio;
    }


    // сеттер для ввода данных в приватное поле currentRadioStationNumber с ограничением по номеру станции

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {

        if (newCurrentRadioStationNumber >= 0 && newCurrentRadioStationNumber <= maxRadio) {
            currentRadioStationNumber = newCurrentRadioStationNumber;
        }
    }


    // метод для увеличения звука на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > -1 && newCurrentVolume < 101) {
            currentVolume = newCurrentVolume;
        }

    }

    // метод для уменьшения звука на 1.
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
