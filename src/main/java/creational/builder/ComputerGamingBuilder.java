package creational.builder;

public class ComputerGamingBuilder implements ComputerBuilder {

    private KeyboardTypes keyboard;

    private GPUTypes gpu;

    private CPUTypes cpu;

    private RAMTypes ram;

    @Override
    public ComputerGamingBuilder setKeyboard() {
        this.keyboard = KeyboardTypes.MECHANICAL;
        return this;
    }

    @Override
    public ComputerGamingBuilder setGPU() {
        this.gpu = GPUTypes.NVIDIA;
        return this;
    }

    @Override
    public ComputerGamingBuilder setCPU() {
        this.cpu = CPUTypes.I9;
        return this;
    }

    @Override
    public ComputerGamingBuilder setRAM() {
        this.ram = RAMTypes.THIRTY_TWO;
        return this;

    }

    @Override
    public ComputerGamingBuilder build() {
        return this;
    }

    public KeyboardTypes getKeyboard() {
        return keyboard;
    }


    public GPUTypes getGpu() {
        return gpu;
    }


    public CPUTypes getCPU() {
        return cpu;
    }

    public RAMTypes getRam() {
        return ram;
    }

}
