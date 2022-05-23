package ua.lviv.iot.texteditor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConsonantInExclamatoryTest {
    private  static final ConsonantInExclamatory counter=new ConsonantInExclamatory();
    String txt="There is a house way down in New Orleans." +
            "They call the Rising Sun!" +
            "And it's been the ruin of many a poor boy." +
            "And God I know I'm one.Mother was a tailor, yeah, yeah!" +
            "Sewed my Levi jeans." +
            "My father was a gambling man, yeah, yeah." +
            "Down, way down in New Orleans!";
    @Test
    void findExclamatoryTest() {
        List<String> expected = new ArrayList<>();
        expected.add("They call the Rising Sun!");
        expected.add("Mother was a tailor, yeah, yeah!");
        expected.add("Down, way down in New Orleans!");
        assertNotEquals(null, counter.findExclamatory(txt));
        assertEquals(expected.toString(), counter.findExclamatory(txt));



    }
    @Test
    void countConsonantTest() {
        assertNotEquals(0,counter.countConsonant(counter.findExclamatory(txt)));
        assertEquals(42,counter.countConsonant(counter.findExclamatory(txt)));
    }


}