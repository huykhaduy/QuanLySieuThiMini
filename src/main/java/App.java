
import BUS.AccountServices.LoginAction;
import GUI.SaleGroup.LoginGui.LoginFrame.LoginGui;
import com.formdev.flatlaf.FlatLightLaf;

public class App {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        new LoginGui();
    }
}
