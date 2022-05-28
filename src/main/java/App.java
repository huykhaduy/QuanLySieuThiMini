
import BUS.AccountServices.LoginAction;
import GUI.SaleGroup.LoginGui.LoginFrame.LoginGui;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Timestamp;

public class App {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        new LoginGui();
    }
}
