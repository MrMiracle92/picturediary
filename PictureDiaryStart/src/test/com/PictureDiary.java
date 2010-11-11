package test.com;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class PictureDiary extends PictureDiaryMenuSuperActivity {
    
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.i("menu","onCreate");  

    }
    
}