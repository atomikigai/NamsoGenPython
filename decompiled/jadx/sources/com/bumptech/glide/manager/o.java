package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1928a;

    public o(r rVar) {
        this.f1928a = rVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z4) {
        ArrayList arrayList;
        p4.n.a();
        synchronized (this.f1928a) {
            arrayList = new ArrayList((HashSet) this.f1928a.f1939d);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((a) obj).a(z4);
        }
    }
}
