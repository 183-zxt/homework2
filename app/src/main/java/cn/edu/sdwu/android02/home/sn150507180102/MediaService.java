package cn.edu.sdwu.android02.home.sn150507180102;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MediaService extends Service {
    public MediaService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
