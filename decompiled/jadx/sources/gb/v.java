package gb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f4509c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bd.u f4510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4511b;

    public v(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f4511b = scheduledThreadPoolExecutor;
    }

    public final synchronized u a() {
        String str;
        u uVar;
        bd.u uVar2 = this.f4510a;
        synchronized (((ArrayDeque) uVar2.e)) {
            str = (String) ((ArrayDeque) uVar2.e).peek();
        }
        Pattern pattern = u.f4505d;
        uVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                uVar = new u(strArrSplit[0], strArrSplit[1]);
            }
        }
        return uVar;
    }
}
