package creational.abstractFactory;

public class ElementsLinuxFactory implements ElementsAbstractFactory {

    @Override
    public ButtonElement createButton() {
        return new LinuxButtonElement(
                "Button"
        );
    }
}
