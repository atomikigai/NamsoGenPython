package o;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7430a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.d f7431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f7432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f7433d;

    public n(b.d dVar, g gVar, ComponentName componentName) {
        this.f7431b = dVar;
        this.f7432c = gVar;
        this.f7433d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f7430a) {
            try {
                try {
                    ((b.b) this.f7431b).I(this.f7432c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
