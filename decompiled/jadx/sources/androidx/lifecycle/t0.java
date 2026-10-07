package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1096a = new LinkedHashMap();

    public final void a() {
        for (p0 p0Var : this.f1096a.values()) {
            p0Var.f1083c = true;
            HashMap map = p0Var.f1081a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = p0Var.f1081a.values().iterator();
                        while (it.hasNext()) {
                            p0.a(it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = p0Var.f1082b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = p0Var.f1082b.iterator();
                        while (it2.hasNext()) {
                            p0.a((Closeable) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            p0Var.b();
        }
        this.f1096a.clear();
    }
}
