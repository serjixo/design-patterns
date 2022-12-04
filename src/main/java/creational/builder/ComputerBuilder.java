package creational.builder;

public interface ComputerBuilder {
    ComputerGamingBuilder setKeyboard();

    ComputerGamingBuilder setGPU();

    ComputerGamingBuilder setCPU();

    ComputerGamingBuilder setRAM();

    ComputerBuilder build();

    RAMTypes getRam();

    CPUTypes getCPU();

    GPUTypes getGpu();

    KeyboardTypes getKeyboard();
}
