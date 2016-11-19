package net.senneco.devfest.codelab.utils.common;

import android.util.Base64;

/**
 * Date: 18.01.2016
 * Time: 15:02
 *
 * @author Yuri Shmakov
 */
public class AuthUtils {
	private static final String TOKEN = "token";

	public static String getToken() {
		return PrefUtils.getPrefs().getString(TOKEN, "");
	}

	public static void setToken(String token) {
		PrefUtils.getEditor().putString(TOKEN, token).commit();
	}

	public static void generateToken(String email, String password) {
		String credentials = String.format("%s:%s", email, password);

		final String token = "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);
	}
}
