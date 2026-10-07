package o6;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f7589a;

    public a0(c0 c0Var) {
        this.f7589a = c0Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f7589a) {
            try {
                int size = size();
                c0 c0Var = this.f7589a;
                if (size <= c0Var.f7601a) {
                    return false;
                }
                c0Var.f7605f.add(new Pair((String) entry.getKey(), ((b0) entry.getValue()).f7596b));
                return size() > this.f7589a.f7601a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
