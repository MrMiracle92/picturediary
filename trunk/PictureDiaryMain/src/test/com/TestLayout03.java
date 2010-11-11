package test.com;

import android.os.Bundle;
import android.util.Log;

public class TestLayout03 extends PictureDiaryMenuSuperActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout03);
		Log.i("menu","TestLayout03");
		
		//finish();	
		this.closeContextMenu();
	}
	
}
