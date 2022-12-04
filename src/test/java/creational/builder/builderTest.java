package creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class builderTest {

    @Test
    public void shouldCreateAGamingPc() {
        ComputerBuilder gamingCompute = new ComputerGamingBuilder().build();
        Assertions.assertInstanceOf(ComputerGamingBuilder.class, gamingCompute);
    }

    @Test
    public void shouldGetI9CPU() {
        ComputerBuilder gamingComputer = new ComputerGamingBuilder().setCPU();
        Assertions.assertEquals(gamingComputer.getCPU(), CPUTypes.I9);
    }
}
