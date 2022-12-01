package creational.abstractFactory;

public class ElementsMacFactory implements ElementsAbstractFactory {

    @Override
    public ButtonElement createButton() {
        return new MacButtonElement(
                "Button"
        );
    }

}
