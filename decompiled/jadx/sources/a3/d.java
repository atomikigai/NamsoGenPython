package a3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends f {
    public static final String h = m.f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f95g;

    public d(Context context, f3.a aVar) {
        super(context, aVar);
        this.f95g = new c(this, 0);
    }

    @Override // a3.f
    public final void d() {
        m.d().a(h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f101b.registerReceiver(this.f95g, f());
    }

    @Override // a3.f
    public final void e() {
        m.d().a(h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f101b.unregisterReceiver(this.f95g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
