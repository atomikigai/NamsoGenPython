package r9;

import android.os.Bundle;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.OnCompleteListener;
import java.util.concurrent.ConcurrentHashMap;
import s5.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f8231c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7.a f8232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8233b;

    public c(y7.a aVar) {
        i0.i(aVar);
        this.f8232a = aVar;
        this.f8233b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (s9.b.c(str) && s9.b.b(str2, bundle) && s9.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f8232a.f10615a.zzz(str, str2, bundle);
        }
    }

    public final e b(String str, j jVar) {
        OnCompleteListener bVar;
        if (s9.b.c(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f8233b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                y7.a aVar = this.f8232a;
                if (zEquals) {
                    bVar = new j(aVar, jVar);
                } else {
                    bVar = "clx".equals(str) ? new a5.b(aVar, jVar) : null;
                }
                if (bVar != null) {
                    concurrentHashMap.put(str, bVar);
                    return new e();
                }
            }
        }
        return null;
    }
}
