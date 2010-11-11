package test.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class PictureDiaryBG extends Activity {
    private Gallery gallery;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bground);

	
        gallery = (Gallery)findViewById(R.id.Gallery01);
        gallery.setAdapter(new PictureDiaryBgAdapter(this));  // baseAdapter상속받은 것으로 .
                
        gallery.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View v,
					int position, long arg3) {
				Toast.makeText(PictureDiaryBG.this, 						
						""+position,
						Toast.LENGTH_SHORT).show();				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
        	
		});
    } // end onCreate
} // end class