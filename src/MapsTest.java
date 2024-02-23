import static org.junit.jupiter.api.Assertions.*;

class MapsTest {

    @org.junit.jupiter.api.Test
    void frequencyTest() {
        String input = "apple banana Apple banana cherry apple banana";
        String expectedMostFrequent = "banana";


        String mostFrequent = Maps.frequency(input);
        assertEquals(expectedMostFrequent, mostFrequent);
    }
}