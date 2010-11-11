package test.com;

import android.os.Bundle;
import android.util.Log;

public class TestLayout02 extends PictureDiaryMenuSuperActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout02);
		Log.i("menu","TestLayout02");
	}
	
}
