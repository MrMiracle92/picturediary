package test.com;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class PictureDiary extends PictureDiaryMenuSuperActivity {
    
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //mainBGbtn = (Button)findViewById(R.id.mainBGbtn))
        //.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.diary));

        Log.i("menu","onCreate");  

    }
    
}