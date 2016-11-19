package net.senneco.devfest.codelab.app;

import android.app.Application;

import net.senneco.devfest.codelab.di.AppComponent;
import net.senneco.devfest.codelab.di.DaggerAppComponent;
import net.senneco.devfest.codelab.di.modules.ContextModule;


/**
 * Date: 18.01.2016
 * Time: 11:22
 *
 * @author Yuri Shmakov
 */
public class GithubApp extends Application {
	private static AppComponent sAppComponent;

	@Override
	public void onCreate() {
		super.onCreate();

		sAppComponent = DaggerAppComponent.builder()
				.contextModule(new ContextModule(this))
				.build();

	}

	public static AppComponent getAppComponent() {
		return sAppComponent;
	}
}
