package GUI.ManageGroup.Theme;

import com.formdev.flatlaf.FlatLightLaf;

public class NhapXuatTheme
	extends FlatLightLaf
{
	public static final String NAME = "NhapXuatTheme";

	public static boolean setup() {
		return setup( new NhapXuatTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, NhapXuatTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
