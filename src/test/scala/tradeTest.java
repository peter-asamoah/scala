import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tradeTest {
    trade testing = new trade(12, "APPL", 100, 12.5);

    @Test
    void symbol() {
    }

    @Test
    void price_$eq() {
    }

    @Test
    void quantity() {
    }

    @Test
    void getprice() {
        System.out.println(testing.getprice());
    }

    @Test
    void testToString() {



    }

    @Test
    void price() {
    }

    @Test
    void setPrice() {
        testing.setPrice(32.2);
        System.out.println(testing.getprice());
    }

    @Test
    void ID() {
    }
}