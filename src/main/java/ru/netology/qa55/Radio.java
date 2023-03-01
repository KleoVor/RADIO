package ru.netology.qa55;
public class Radio {
    private int currentRadioStationNumber; // поле Текущий номер радиостанции
    private int currentVolume; // поле Громкоть звука


    // геттеры выводят текущий номер радиостанции и текущую громкость
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    // увеличивает номер текущей радиостанции от 0 до 9 если текущий номер меньше 9, иначе ставит 0

    public void NextRadioStationNumber() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else currentRadioStationNumber = 0;
    }


    // уменьшает номер если текущий номер радиостанции больше 0, иначе ставит 9

    public int PrevRadioStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else currentRadioStationNumber = 9;
        return 9;
    }


    // сеттер для ввода данных в приватное поле currentRadioStationNumber с ограничением по номеру станции не больше 9

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {

        if (newCurrentRadioStationNumber >= 0 && newCurrentRadioStationNumber <= 9) {
            currentRadioStationNumber = newCurrentRadioStationNumber;
        }
    }


    // метод для увеличения звука на 1
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > -1 && newCurrentVolume < 11) {
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
