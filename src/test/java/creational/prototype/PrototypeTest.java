package creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    public void shouldCloneAnInstance() {

        Square square = new Square(30, 50);
        ShapePrototype clone = square.clone();
        Assertions.assertEquals(square.getHeight(), clone.getHeight());
        Assertions.assertEquals(square.getHeight(), clone.getHeight());

    }

}
