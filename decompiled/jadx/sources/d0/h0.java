package d0;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f2759a;

    static {
        new HashSet();
    }

    public h0(Context context) {
        this.f2759a = (NotificationManager) context.getSystemService("notification");
    }
}
