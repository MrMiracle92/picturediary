package test.com;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PictureExitDialog extends Activity {

	private static final int dialog_ok_cancel_exit = 1;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		showDialog(dialog_ok_cancel_exit);
//		
//		setContentView(R.layout.exit_dialog);
//
//		Button twoButtonsTitle = (Button) findViewById(R.id.exit);
//		twoButtonsTitle.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				showDialog(dialog_ok_cancel_exit);
//			}
//		});
	} // end onCreate
	
	
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case dialog_ok_cancel_exit:
			return new AlertDialog.Builder(PictureExitDialog.this)
			.setIcon(R.drawable.dialog_icon)
			.setTitle(R.string.dialog_two_buttons_title)
			.setMessage(R.string.dialog_two_buttons_msg)
			.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int whichButton) {
					finish();
				}
			})
			.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int whichButton) {
				}
			})
			.create();
		}
		return null;
	} // onCreateDialog
} // end class