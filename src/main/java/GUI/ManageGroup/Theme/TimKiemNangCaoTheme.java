package GUI.ManageGroup.Theme;

import com.formdev.flatlaf.FlatLightLaf;

public class TimKiemNangCaoTheme
	extends FlatLightLaf
{
	public static final String NAME = "TimKiemNangCaoTheme";

	public static boolean setup() {
		return setup( new TimKiemNangCaoTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, TimKiemNangCaoTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
