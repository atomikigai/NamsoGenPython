package jb;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements com.google.android.gms.common.api.internal.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f5745a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z4) {
        Random random = k.f5746j;
        synchronized (k.class) {
            Iterator it = k.f5747k.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).d(z4);
            }
        }
    }
}
