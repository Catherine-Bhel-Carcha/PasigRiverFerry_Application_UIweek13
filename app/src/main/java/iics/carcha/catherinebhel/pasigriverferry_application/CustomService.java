package iics.carcha.catherinebhel.pasigriverferry_application;
import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class CustomService extends IntentService {
    public CustomService() {
        super("CustomService");
    }

    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITF","Pasig River Ferry is running on the background");
    }
}



