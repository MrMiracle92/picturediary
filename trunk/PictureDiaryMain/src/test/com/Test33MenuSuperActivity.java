package test.com;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class Test33MenuSuperActivity extends Activity {

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		startActivity(item.getIntent());
		super.onOptionsItemSelected(item);
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.layout_menu, menu);
		menu.findItem(R.id.item01).setIntent(new Intent(this, TestLayout01.class));
		menu.findItem(R.id.item02).setIntent(new Intent(this, TestLayout02.class));
		menu.findItem(R.id.item03).setIntent(new Intent(this, TestLayout03.class));
		super.onCreateOptionsMenu(menu);
		return true;
	}
}
