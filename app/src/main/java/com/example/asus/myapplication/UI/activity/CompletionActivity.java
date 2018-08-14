package com.example.asus.myapplication.UI.activity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.home.mvp.contract.HomeContract;
import com.example.asus.myapplication.bean.PeopleBean;
import com.example.asus.myapplication.bean.UpImgBean;
import com.example.asus.myapplication.home.mvp.model.HomeModel;
import com.example.asus.myapplication.home.mvp.presenter.StarPresenter;
import com.example.asus.myapplication.UI.main.view.activity.XingquActivity;

import java.io.File;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class CompletionActivity extends BaseActivity<HomeModel, StarPresenter> implements View.OnClickListener ,HomeContract.View{

    private Toolbar toolbar;
    private ImageView img_touxaing;
    //调用系统相册-选择图片
    private static final int IMAGE = 1;
    private TextView text_wancheng;
    private EditText edit_name;
    private TextView tv_nan;
    private TextView tv_nv;
    private EditText edit_mima;
    private String sex;
    private String imgPath;

    @Override
    protected void initView() {
        toolbar = findViewById(R.id.toolbar);
        img_touxaing = findViewById(R.id.img_touxaing);
        text_wancheng = findViewById(R.id.text_wancheng);
        edit_name = findViewById(R.id.edit_name);
        tv_nan = findViewById(R.id.tv_nan);
        tv_nv = findViewById(R.id.tv_nv);
        edit_mima = findViewById(R.id.edit_mima);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        img_touxaing.setOnClickListener(this);
        text_wancheng.setOnClickListener(this);
        tv_nan.setOnClickListener(this);
        tv_nv.setOnClickListener(this);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_completion;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_touxaing :
                //调用相册
                Intent intent = new Intent(Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, IMAGE);
                break;
            case R.id.text_wancheng :
                information();
                break;
            case R.id.tv_nan :
                String stringnan = tv_nan.getText().toString();
                sex=stringnan;
                break;
            case R.id.tv_nv :
                String stringnv = tv_nv.getText().toString();
                sex=stringnv;
                break;
        }
    }

    private void information() {

        Intent intent = new Intent(CompletionActivity.this, XingquActivity.class);

        startActivity(intent);
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
            MultipartBody.Builder builder1 = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM).addFormDataPart("file", imagePath,
                            RequestBody.create(MediaType.parse("image/png"), f));
            List<MultipartBody.Part> parts = builder1.build().parts();
            presenter.setuploadUrls(parts);
            showImage(imagePath);
            c.close();
        }
    }
    //加载图片
    private void showImage(String imaePath){
        Bitmap bm = BitmapFactory.decodeFile(imaePath);
        img_touxaing.setImageBitmap(bm);
    }

    @Override
    public void getLoginData(Object bean) {
        UpImgBean bean1 = (UpImgBean) bean;
        Log.e("CompletionActivity", "bean1:" + bean1.getData().getFileName());
    }

    @Override
    public void getRegisterData(Object bean) {
        PeopleBean bean1 = (PeopleBean) bean;
        if (bean1 != null) {
            Intent intent1 = new Intent(this, LoginActivity.class);
            startActivity(intent1);
            Toast.makeText(this, bean1.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("CompletionActivity", bean1.getMessage());
        }

    }
}
