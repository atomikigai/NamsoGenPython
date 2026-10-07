package androidx.work.impl.foreground;

import a2.l;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.u;
import androidx.work.impl.WorkDatabase;
import b3.b;
import b3.c;
import d3.a;
import java.util.UUID;
import t2.m;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1270f = m.f("SystemFgService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f1271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f1273d;
    public NotificationManager e;

    public final void a() {
        this.f1271b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f1273d = cVar;
        if (cVar.f1377t != null) {
            m.d().b(c.f1369u, "A callback already exists.", new Throwable[0]);
        } else {
            cVar.f1377t = this;
        }
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1273d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        super.onStartCommand(intent, i, i10);
        boolean z4 = this.f1272c;
        String str = f1270f;
        if (z4) {
            m.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f1273d.g();
            a();
            this.f1272c = false;
        }
        if (intent == null) {
            return 3;
        }
        c cVar = this.f1273d;
        j jVar = cVar.f1370a;
        String str2 = c.f1369u;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m.d().e(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = jVar.f8821o;
            ((l) cVar.f1371b).m(new b(cVar, workDatabase, stringExtra, 0));
            cVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            cVar.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            m.d().e(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            jVar.getClass();
            jVar.f8822p.m(new a(jVar, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        m.d().e(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = cVar.f1377t;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f1272c = true;
        m.d().a(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
