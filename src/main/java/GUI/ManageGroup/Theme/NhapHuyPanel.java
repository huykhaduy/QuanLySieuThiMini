package GUI.ManageGroup.Theme;

import com.formdev.flatlaf.FlatLightLaf;

public class NhapHuyPanel
	extends FlatLightLaf
{
	public static final String NAME = "NhapHuyPanel";

	public static boolean setup() {
		return setup( new NhapHuyPanel() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, NhapHuyPanel.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
