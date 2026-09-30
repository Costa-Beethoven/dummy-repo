import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CICDTest {

    @Test
    void addShouldReturnSum() {
        CICD app = new CICD();

        int result = app.add(2, 3);

        assertEquals(5, result);
    }
}