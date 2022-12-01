package creational.abstractFactory;

public class MacButtonElement implements ButtonElement {
    private final String name;

    private final SystemTypes type;

    public MacButtonElement(String name) {
        this.name = name;
        this.type = SystemTypes.MACOS;
    }

    @Override
    public SystemTypes getType() {
        return type;
    }
}
