package n9;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements com.google.android.gms.common.api.internal.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f7354a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z4) {
        synchronized (g.f7357k) {
            try {
                ArrayList arrayList = new ArrayList(g.f7358l.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    g gVar = (g) obj;
                    if (gVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f7353a;
                            if (!z4) {
                                ((wa.c) gVar2.h.get()).a();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
