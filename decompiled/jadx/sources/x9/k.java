package x9;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements va.c, va.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f10338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y9.l f10339c;

    public k() {
        y9.l lVar = y9.l.f10666a;
        this.f10337a = new HashMap();
        this.f10338b = new ArrayDeque();
        this.f10339c = lVar;
    }

    public final synchronized void a(Executor executor, va.a aVar) {
        try {
            executor.getClass();
            if (!this.f10337a.containsKey(n9.b.class)) {
                this.f10337a.put(n9.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f10337a.get(n9.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
