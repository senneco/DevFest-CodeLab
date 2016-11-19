package net.senneco.devfest.codelab.di;

import android.content.Context;

import net.senneco.devfest.codelab.di.modules.ContextModule;
import net.senneco.devfest.codelab.di.modules.GithubModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Date: 8/18/2016
 * Time: 14:49
 *
 * @author Artur Artikov
 */
@Singleton
@Component(modules = {ContextModule.class, GithubModule.class})
public interface AppComponent {
	Context getContext();
}
