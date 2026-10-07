package b3;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f1379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f1381d;

    public d(SystemForegroundService systemForegroundService, int i, Notification notification, int i10) {
        this.f1381d = systemForegroundService;
        this.f1378a = i;
        this.f1379b = notification;
        this.f1380c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.f1379b;
        int i10 = this.f1378a;
        SystemForegroundService systemForegroundService = this.f1381d;
        if (i >= 29) {
            systemForegroundService.startForeground(i10, notification, this.f1380c);
        } else {
            systemForegroundService.startForeground(i10, notification);
        }
    }
}
