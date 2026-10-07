package z1;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import r7.i;
import s5.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f10952c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f10953d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f10955b;

    public a(String str, boolean z4) {
        ReentrantLock reentrantLock;
        synchronized (f10952c) {
            try {
                LinkedHashMap linkedHashMap = f10953d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10954a = reentrantLock;
        this.f10955b = z4 ? new j(str, 22) : null;
    }
}
