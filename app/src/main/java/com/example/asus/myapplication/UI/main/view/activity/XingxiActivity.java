package com.example.asus.myapplication.UI.main.view.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.home.mvp.base.BaseActivity;
import com.example.asus.myapplication.util.PhotoUtils;
import com.example.asus.myapplication.util.ToastUtils;

import java.io.File;

import de.hdodenhof.circleimageview.CircleImageView;

public class XingxiActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar tool_xin;
    private ImageView id_Img1;
    private ImageView id_Img2;
    private ImageView id_Img3;
    private ImageView id_Img4;
    private ImageView id_Img5;
    private ImageView user_img;
    private String imgPath;
    private static final int IMAGE = 1;


    private static final String TAG = "XingxiActivity";
    private CircleImageView photo;
    private Button takePic;
    private Button takeGallery;
    private static final int CODE_GALLERY_REQUEST = 0xa0;
    private static final int CODE_CAMERA_REQUEST = 0xa1;
    private static final int CODE_RESULT_REQUEST = 0xa2;
    private static final int CAMERA_PERMISSIONS_REQUEST_CODE = 0x03;
    private static final int STORAGE_PERMISSIONS_REQUEST_CODE = 0x04;
    private File fileUri = new File(Environment.getExternalStorageDirectory().getPath() + "/photo.jpg");
    private File fileCropUri = new File(Environment.getExternalStorageDirectory().getPath() + "/crop_photo.jpg");
    private Uri imageUri;
    private Uri cropImageUri;


    protected void initView() {
        tool_xin = (Toolbar) findViewById(R.id.tool_xin);
        id_Img1 = (ImageView) findViewById(R.id.id_Img1);
        id_Img2 = (ImageView) findViewById(R.id.id_Img2);
        id_Img3 = (ImageView) findViewById(R.id.id_Img3);
        id_Img4 = (ImageView) findViewById(R.id.id_Img4);
        id_Img5 = (ImageView) findViewById(R.id.id_Img5);
        user_img = (ImageView) findViewById(R.id.user_img);
        photo = (CircleImageView) findViewById(R.id.photo);
        takePic = (Button) findViewById(R.id.takePic);
        takeGallery = (Button) findViewById(R.id.takeGallery);

        user_img.setOnClickListener(this);

        initData();

    }

    private void initData() {

        tool_xin.setTitle("");
        setSupportActionBar(tool_xin);
        //关键下面两句话，设置了回退按钮，及点击事件的效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tool_xin.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        //获取图片路径
//        int IMAGE = 1;
//        if (requestCode == IMAGE && resultCode == Activity.RESULT_OK && data != null) {
//            Uri selectedImage = data.getData();
//            String[] filePathColumns = {MediaStore.Images.Media.DATA};
//            Cursor c = getContentResolver().query(selectedImage, filePathColumns, null, null, null);
//            c.moveToFirst();
//            int columnIndex = c.getColumnIndex(filePathColumns[0]);
//            String imagePath = c.getString(columnIndex);
//            imgPath=imagePath;
//            Log.e("path",imgPath);
//            File f = new File(imagePath);
//            MultipartBody.Builder builder1 = new MultipartBody.Builder()
//                    .setType(MultipartBody.FORM).addFormDataPart("file", imagePath,
//                            RequestBody.create(MediaType.parse("image/png"), f));
//            List<MultipartBody.Part> parts = builder1.build().parts();
//            presenter.setuploadUrls(parts);
//            showImage(imagePath);
//            c.close();
//
//        }
//    }
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

        return R.layout.xingxiactivity;
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

        switch (v.getId()) {
            case R.id.takePic:
                autoObtainCameraPermission();
                break;
            case R.id.takeGallery:
                autoObtainStoragePermission();
                break;
            default:
        }

    }

    private void autoObtainStoragePermission() {


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSIONS_REQUEST_CODE);
        } else {
            PhotoUtils.openPic(this, CODE_GALLERY_REQUEST);
        }
    }

    private void showImages(Bitmap bitmap) {
        photo.setImageBitmap(bitmap);
    }


    private void autoObtainCameraPermission() {

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
                || ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)) {
                ToastUtils.showShort(this, "bbb");
            }
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE}, CAMERA_PERMISSIONS_REQUEST_CODE);
        } else {
            imageUri = Uri.fromFile(fileUri);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                imageUri = FileProvider.getUriForFile(XingxiActivity.this, "com.zz.fileprovider", fileUri);
            }
            PhotoUtils.takePicture(this, imageUri, CODE_CAMERA_REQUEST);
        } {
            ToastUtils.showShort(this, "ccc");
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case CAMERA_PERMISSIONS_REQUEST_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (hasSdcard()) {
                        imageUri = Uri.fromFile(fileUri);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                            imageUri = FileProvider.getUriForFile(XingxiActivity.this, "com.zz.fileprovider", fileUri);//閫氳繃FileProvider鍒涘缓涓€涓猚ontent绫诲瀷鐨刄ri
                        PhotoUtils.takePicture(this, imageUri, CODE_CAMERA_REQUEST);
                    } else {
                        ToastUtils.showShort(this, "aaa");
                    }
                } else {

                    ToastUtils.showShort(this, "qqq");
                }
                break;


            }
            case STORAGE_PERMISSIONS_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    PhotoUtils.openPic(this, CODE_GALLERY_REQUEST);
                } else {

                    ToastUtils.showShort(this, "222");
                }
                break;
            default:
        }
    }

    private static final int OUTPUT_X = 480;
    private static final int OUTPUT_Y = 480;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case CODE_CAMERA_REQUEST:
                    cropImageUri = Uri.fromFile(fileCropUri);
                    PhotoUtils.cropImageUri(this, imageUri, cropImageUri, 1, 1, OUTPUT_X, OUTPUT_Y, CODE_RESULT_REQUEST);
                    break;
                case CODE_GALLERY_REQUEST:
                    if (hasSdcard()) {
                        cropImageUri = Uri.fromFile(fileCropUri);
                        Uri newUri = Uri.parse(PhotoUtils.getPath(this, data.getData()));
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            newUri = FileProvider.getUriForFile(this, "com.zz.fileprovider", new File(newUri.getPath()));
                        }
                        PhotoUtils.cropImageUri(this, newUri, cropImageUri, 1, 1, OUTPUT_X, OUTPUT_Y, CODE_RESULT_REQUEST);
                    } else {
                        ToastUtils.showShort(this, "111");
                    }
                    break;
                case CODE_RESULT_REQUEST:
                    Bitmap bitmap = PhotoUtils.getBitmapFromUri(cropImageUri, this);
                    if (bitmap != null) {
                        showImages(bitmap);
                    }
                    break;
                default:
            }
        }
    }
    private boolean hasSdcard() {

        String state = Environment.getExternalStorageState();
        return state.equals(Environment.MEDIA_MOUNTED);

    }
}
