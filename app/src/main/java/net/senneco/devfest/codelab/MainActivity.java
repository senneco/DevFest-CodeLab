package net.senneco.devfest.codelab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.senneco.devfest.codelab.presentation.model.network.GithubService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject
	GithubService mGithubService;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
