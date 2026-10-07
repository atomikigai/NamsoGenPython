package a3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends f {
    public static final String i = m.f("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f106g;
    public final g h;

    public h(Context context, f3.a aVar) {
        super(context, aVar);
        this.f106g = (ConnectivityManager) this.f101b.getSystemService("connectivity");
        this.h = new g(this, 0);
    }

    @Override // a3.f
    public final Object a() {
        return f();
    }

    @Override // a3.f
    public final void d() {
        String str = i;
        try {
            m.d().a(str, "Registering network callback", new Throwable[0]);
            this.f106g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            m.d().b(str, "Received exception while registering network callback", e);
        }
    }

    @Override // a3.f
    public final void e() {
        String str = i;
        try {
            m.d().a(str, "Unregistering network callback", new Throwable[0]);
            this.f106g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            m.d().b(str, "Received exception while unregistering network callback", e);
        }
    }

    public final y2.a f() {
        boolean z4;
        ConnectivityManager connectivityManager = this.f106g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            z4 = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            m.d().b(i, "Unable to validate active network", e);
        }
        boolean zA = l0.a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        y2.a aVar = new y2.a();
        aVar.f10537a = z11;
        aVar.f10538b = z4;
        aVar.f10539c = zA;
        aVar.f10540d = z10;
        return aVar;
    }
}
