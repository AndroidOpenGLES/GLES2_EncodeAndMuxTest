package xiaxl.le.com.android_test;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        setContentView(R.layout.activity_main);
        //
        CameraToMpegTest test = new CameraToMpegTest();
        try {
            test.testEncodeCameraToMp4();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
