package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ContactPage {

    public static Target nameInput = Target.the("input first name").locatedBy("");
    public static Target lastNameInput = Target.the("input last name").locatedBy("");
    public static Target emailInput = Target.the("input email").locatedBy("");
    public static Target subjectSelect = Target.the("select subject").locatedBy("//*[@id=\"subject\"]");

    public static Target listSubjectComboBox(int count) {
        return Target.the("").locatedBy("//*[@id=\"subject\"]/option[" + count + "]");
    }

    public static Target messageInput = Target.the("message input").locatedBy("//*[@id=\"message\"]");
    public static Target sendButton = Target.the("send button").locatedBy("/html/body/app-root/div/app-contact/div/div/div/form/div/div[2]/div[4]/input");

}
