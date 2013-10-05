package com.androguide.cmdprocessorexample;

import com.androguide.cmdprocessor.CMDProcessor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		((Button) findViewById(R.id.execute))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						if (((CheckBox) findViewById(R.id.withSu)).isChecked())
							CMDProcessor.runSuCommand(((EditText) findViewById(R.id.command))
											.getText().toString());
						else
							CMDProcessor.runShellCommand(((EditText) findViewById(R.id.command))
											.getText().toString());
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
