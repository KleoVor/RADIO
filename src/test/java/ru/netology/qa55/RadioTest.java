package ru.netology.qa55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest // зададим максимальое кол-во станций через конструктор
    @CsvFileSource(files = "src/test/resources/MaxRadio.csv")
    public void shouldMaxRadio(int expected, int maxRadio) {
        Radio max = new Radio(maxRadio);
        max.setMaxRadio(maxRadio);
        int actual = max.getMaxRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // включаем номер станции явным образом при 10 станциях по умолчанию
    @CsvFileSource(files = "src/test/resources/CurrentRadioStationNumberByDef.csv")

    public void shouldCurrentRadioStationNumberByDef(int expected, int CurrentRadioStationNumber) {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(CurrentRadioStationNumber);

        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // включаем номер станции явным образом при кол-ве станций введенных пользователем = 100
    @CsvFileSource(files = "src/test/resources/CurrentRadioStationNumber.csv")

    public void shouldCurrentRadioStationNumber(int expected, int CurrentRadioStationNumber) {
        Radio number = new Radio(100);
        number.setCurrentRadioStationNumber(CurrentRadioStationNumber);

        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest  // увеличим номер станции +1 если кол-во станций задается пользователем и = 150
    @CsvFileSource(files = "src/test/resources/NextRadioStationNumber.csv")

    public void shouldNextRadioStationNumber(int expected, int CurrentRadioStationNumber) {
        Radio number = new Radio(150);
        number.setCurrentRadioStationNumber(CurrentRadioStationNumber);
        number.NextRadioStationNumber();

        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // уменьшим номер станции -1 если кол-во станций по умолчанию 10
    @CsvFileSource(files = "src/test/resources/PrevRadioStationNumberByDef.csv")

    public void shouldPrevRadioStationNumberByDef(int expected, int CurrentRadioStationNumber) {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(CurrentRadioStationNumber);
        number.PrevRadioStationNumber();

        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // уменьшим номер станции -1 если кол-во станций задается пользователем и = 50
    @CsvFileSource(files = "src/test/resources/PrevRadioStationNumber.csv")

    public void shouldPrevRadioStationNumber(int expected, int CurrentRadioStationNumber) {
        Radio number = new Radio(50);
        number.setCurrentRadioStationNumber(CurrentRadioStationNumber);
        number.PrevRadioStationNumber();

        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // увеличим звук на +1, если =100 - остановка
    @CsvFileSource(files = "src/test/resources/IncreaseVolume.csv")

    public void shouldIncreaseVolume(int expected, int CurrentVolume) {
        Radio volume = new Radio();
        volume.setCurrentVolume(CurrentVolume);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // уменьшим звук на -1, если =0 - остановка
    @CsvFileSource(files = "src/test/resources/ВecreaseVolume.csv")
    public void shouldВecreaseVolume(int expected, int CurrentVolume) {
        Radio volume = new Radio();
        volume.setCurrentVolume(CurrentVolume);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

