package oc;

import ic.l;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f7719b;

    public k(e eVar, l lVar) {
        this.f7718a = eVar;
        this.f7719b = lVar;
    }

    @Override // oc.e
    public final Iterator iterator() {
        return new j(this);
    }
}
