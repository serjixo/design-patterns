package creational.abstractFactory;

public class LinuxButtonElement implements ButtonElement {
    private final String name;

    private final SystemTypes type;

    public LinuxButtonElement(String name) {
        this.name = name;
        this.type = SystemTypes.LINUX;
    }

    @Override
    public SystemTypes getType() {
        return type;
    }
}
