package creational.abstractFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void shouldCreateElementOfTypeMac() {
        ElementsAbstractFactory elementsAbstractFactory = new ElementsMacFactory();
        ButtonElement button = elementsAbstractFactory.createButton();
        Assertions.assertEquals(SystemTypes.MACOS, button.getType());
    }


    @Test
    public void shouldCreateElementOfTypeLinux() {
        ElementsAbstractFactory elementsAbstractFactory = new ElementsLinuxFactory();
        ButtonElement button = elementsAbstractFactory.createButton();
        Assertions.assertEquals(SystemTypes.LINUX, button.getType());
    }

}
