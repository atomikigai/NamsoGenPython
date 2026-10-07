package v1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
