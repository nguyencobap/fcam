package com.example.firstcamera;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CheckCam {
    public String TAG = "CheckCam";
    Camera mCamera = null;
    SurfaceView mSurfaceView;
    SurfaceHolder mHolder;

    public CheckCam() {
    }

    public Camera accCamera(Context context){
        boolean hasCamera = context.getPackageManager().hasSystemFeature((PackageManager.FEATURE_CAMERA));
        Log.d(TAG, "accCamera: hasCamera="+hasCamera);
        if (hasCamera) {

            try {
                mCamera = Camera.open(1);
            } catch (Exception e) {
                Log.d(TAG, "accCamera: Exception case, msg="+e.getMessage());

            }
            Log.d(TAG, "accCamera: openCamera done." + mCamera);
            return mCamera;
        }
        return null;
    }

    public void preCam(){
    }


}
