package oc;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7715b;

    public /* synthetic */ i(Object obj, int i) {
        this.f7714a = i;
        this.f7715b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7714a) {
            case 0:
                return new pc.b((pc.c) this.f7715b);
            default:
                return ((ArrayList) this.f7715b).iterator();
        }
    }
}
