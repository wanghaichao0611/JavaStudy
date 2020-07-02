package creationalPatterns.abstractFactoryPattern.abstractFactoryExample;


//SummerSkinFactory：Summer皮肤工厂，充当具体工厂
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
