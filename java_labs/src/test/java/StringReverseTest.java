import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {

    @Test
    public void reverse() {
        assertEquals("asdf", StringReverse.reverse("fdsa"));
        assertEquals("ASDF3", StringReverse.reverse("3FDSA"));
    }
}