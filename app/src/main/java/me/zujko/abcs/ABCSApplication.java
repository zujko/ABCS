package me.zujko.abcs;

import android.app.Application;

import com.path.android.jobqueue.JobManager;
import com.path.android.jobqueue.config.Configuration;

public class ABCSApplication extends Application {
    public static JobManager JOB_MANAGER;

    @Override
    public void onCreate() {
        super.onCreate();
        createJobManager();
    }

    /**
     * Creates a job manager.
     */
    private void createJobManager() {
        Configuration configuration = new Configuration.Builder(this)
                .minConsumerCount(0)
                .maxConsumerCount(5)
                .loadFactor(3)
                .consumerKeepAlive(120)
                .build();

        JOB_MANAGER = new JobManager(this, configuration);
    }
}
