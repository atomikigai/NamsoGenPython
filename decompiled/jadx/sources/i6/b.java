package i6;

import da.x;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f5217a = new ThreadPoolExecutor(2, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new x("ClientDefault", 1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f5218b = Executors.newSingleThreadExecutor(new x("ClientSingle", 1));
}
