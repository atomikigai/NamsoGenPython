package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.u;
import d3.k;
import java.util.HashMap;
import java.util.WeakHashMap;
import t2.m;
import w2.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f1263d = m.f("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f1264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1265c;

    public final void a() {
        this.f1265c = true;
        m.d().a(f1263d, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.f2823a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = k.f2824b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                m.d().h(k.f2823a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g gVar = new g(this);
        this.f1264b = gVar;
        if (gVar.f9477u != null) {
            m.d().b(g.f9468v, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            gVar.f9477u = this;
        }
        this.f1265c = false;
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1265c = true;
        this.f1264b.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        super.onStartCommand(intent, i, i10);
        if (this.f1265c) {
            m.d().e(f1263d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1264b.d();
            g gVar = new g(this);
            this.f1264b = gVar;
            if (gVar.f9477u != null) {
                m.d().b(g.f9468v, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                gVar.f9477u = this;
            }
            this.f1265c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1264b.a(intent, i10);
        return 3;
    }
}
