package test.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Test01Android extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tv01 = (TextView)findViewById(R.id.line01);
        tv01.setText("ù��°�����Դϴ�.");
        
        TextView tv02 = (TextView)findViewById(R.id.line02);
        tv02.setText("�ι�°�����Դϴ�.");
        
        TextView tv03 = (TextView)findViewById(R.id.line03);
        tv03.setText("����°�����Դϴ�.");
    } // end onCreate()
} // end class