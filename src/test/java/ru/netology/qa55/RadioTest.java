package ru.netology.qa55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class RadioTest {

    @ParameterizedTest // присваиваем номер станции явным образом
    @CsvFileSource(files = "src/test/resources/CurrentRadioStationNumber.csv")

    public void shouldCurrentRadioStationNumber(int expected, int CurrentRadioStationNumber) {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(CurrentRadioStationNumber);

        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest  // увеличим номер станции +1
    @CsvFileSource(files = "src/test/resources/NextRadioStationNumber.csv")

    public void shouldNextRadioStationNumber(int expected, int CurrentRadioStationNumber) {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(CurrentRadioStationNumber);
        number.NextRadioStationNumber();

        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // уменьшим номер станции -1
    @CsvFileSource(files = "src/test/resources/PrevRadioStationNumber.csv")

    public void shouldPrevRadioStationNumber(int expected, int CurrentRadioStationNumber) {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(CurrentRadioStationNumber);
        number.PrevRadioStationNumber();

        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // увеличим звук на +1, если =10 - остановка
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
