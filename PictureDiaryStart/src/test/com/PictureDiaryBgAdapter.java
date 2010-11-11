package test.com;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

public class PictureDiaryBgAdapter extends BaseAdapter {

	private Context c;  // 1
	private Integer[] imgArry = {
			R.drawable.sample_0, R.drawable.sample_1,
			R.drawable.sample_2, R.drawable.sample_3,
			R.drawable.sample_4, R.drawable.sample_5,
			R.drawable.sample_6, R.drawable.sample_7,
	};
	private int mGalleryItemBackground;	

	public PictureDiaryBgAdapter(Context c) { 
		this.c = c;
		// ����
//		TypedArray a = c.obtainStyledAttributes(R.styleable.HelloGallery);
//        mGalleryItemBackground = a.getResourceId(
//                R.styleable.HelloGallery_android_galleryItemBackground, 0);
//        a.recycle();  // �����ϰڴ�.
	}

	@Override
	public int getCount() {// 2
		// �ݵ��
		return imgArry.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {// 2
		ImageView iv;

        if (convertView == null) {  // if it's not recycled, initialize some attributes
        	iv = new ImageView(c);
        	iv.setLayoutParams(new Gallery.LayoutParams(800, 800));
        	iv.setScaleType(ImageView.ScaleType.FIT_XY);
        	iv.setPadding(8, 8, 8, 8); 
        } else {
            iv = (ImageView) convertView;
        }
        iv.setBackgroundResource(mGalleryItemBackground);  // ����.
        iv.setImageResource(imgArry[position]);

		//�̹����並 �ݵ�� ����
		return iv;
	}

}
