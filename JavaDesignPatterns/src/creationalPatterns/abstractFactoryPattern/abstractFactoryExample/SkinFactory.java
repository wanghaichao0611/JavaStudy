package creationalPatterns.abstractFactoryPattern.abstractFactoryExample;


/**
 * 例题：
 *     某软件公司开发一套界面皮肤库，可以对基于Java的桌面软件进行界面优化。用户在使用时可以通过菜单来选择皮肤，不同的皮肤将
 * 提供视觉不同的按钮，文本框，组合框等界面元素，例如春天（Spring）风格的皮肤将提供浅绿色的按钮，绿色边框的文本框和绿色边框的
 * 组合框，而下台你（Summer）风格的皮肤则提供浅蓝色的按钮，蓝色边框的文本框和兰色边框的组合框，其结构图示意图如以下所示：
 * 皮肤框->（Spring风格，Summer风格）->【（浅绿色按钮，绿色边框文本框，绿色边框组合框），（浅蓝色按钮，蓝色边框文本框，蓝色边框组合框）】
 *     该皮肤需要具备良好的灵活性和可扩展性，用户可以自由选择不同的皮肤，开发人员在不修改既有的代码的基础上增加新的皮肤。
 */
//SkinFactory：界面皮肤工厂接口，充当抽象工厂
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
