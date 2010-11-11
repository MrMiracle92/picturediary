package test.com;

import android.os.Bundle;
import android.util.Log;

public class TestLayout01 extends Test33MenuSuperActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout01);
		Log.i("menu","TestLayout01");
	}
	
}
