/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.ManageGroup.Theme;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author MY ACER
 */
public class NhanVienAddTheme extends FlatLightLaf {
    public static final String NAME = "NhanVienAddTheme";

	public static boolean setup() {
		return setup( new NhanVienAddTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, NhanVienAddTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
