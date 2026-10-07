package x9;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements ya.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f10343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f10344b;

    @Override // ya.b
    public final Object get() {
        if (this.f10344b == null) {
            synchronized (this) {
                try {
                    if (this.f10344b == null) {
                        this.f10344b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f10343a.iterator();
                                while (it.hasNext()) {
                                    this.f10344b.add(((ya.b) it.next()).get());
                                }
                                this.f10343a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f10344b);
    }
}
