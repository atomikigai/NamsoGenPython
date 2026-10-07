package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1940a = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.i
    public final void e() {
        ArrayList arrayListE = p4.n.e(this.f1940a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((m4.c) obj).e();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void j() {
        ArrayList arrayListE = p4.n.e(this.f1940a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((m4.c) obj).j();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
        ArrayList arrayListE = p4.n.e(this.f1940a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((m4.c) obj).onDestroy();
        }
    }
}
