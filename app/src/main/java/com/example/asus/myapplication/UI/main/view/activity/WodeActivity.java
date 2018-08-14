package com.example.asus.myapplication.UI.main.view.activity;


import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.makeramen.roundedimageview.RoundedImageView;

import java.io.File;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class WodeActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar tool_xin;
    private RoundedImageView user_img;
    private ImageView id_Img1;
    private ImageView id_Img2;
    private ImageView id_Img3;
    private ImageView id_Img4;
    private ImageView id_Img5;
    private String imgPath;
    private static final int IMAGE = 1;

    protected void initView() {

        tool_xin = (Toolbar) findViewById(R.id.tool_xin);
        user_img = (RoundedImageView) findViewById(R.id.user_img);
        id_Img1 = (ImageView) findViewById(R.id.id_Img1);
        id_Img2 = (ImageView) findViewById(R.id.id_Img2);
        id_Img3 = (ImageView) findViewById(R.id.id_Img3);
        id_Img4 = (ImageView) findViewById(R.id.id_Img4);
        id_Img5 = (ImageView) findViewById(R.id.id_Img5);

        initData();
        user_img.setOnClickListener(this);
    }

    private void initData() {

        tool_xin.setTitle("");
        setSupportActionBar(tool_xin);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //获取图片路径
        if (requestCode == IMAGE && resultCode == Activity.RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            String[] filePathColumns = {MediaStore.Images.Media.DATA};
            Cursor c = getContentResolver().query(selectedImage, filePathColumns, null, null, null);
            c.moveToFirst();
            int columnIndex = c.getColumnIndex(filePathColumns[0]);
            String imagePath = c.getString(columnIndex);
            imgPath=imagePath;
            File f = new File(imagePath);
//            MultipartBody.Builder builder1 = new MultipartBody.Builder()
//                    .setType(MultipartBody.FORM).addFormDataPart("file", imagePath,
//                            RequestBody.create(MediaType.parse("image/png"), f));
//            List<MultipartBody.Part> parts = builder1.build().parts();
//            presenter.setuploadUrls(parts);
            showImage(imagePath);
            c.close();
        }
    }
    //加载图片
    private void showImage(String imaePath){
        Bitmap bm = BitmapFactory.decodeFile(imaePath);
        user_img.setImageBitmap(bm);
//        Glide.with(this)
//                .load(bm)
//                .apply(RequestOptions.bitmapTransform(new CircleCrop()))//加载圆形图片
//                .into(img_touxaing);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.wodeactivity;
    }

    @Override
    public void onClick(View v) {

        user_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, IMAGE);

            }
        });

    }
}
