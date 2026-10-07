package com.bumptech.glide;

import com.bumptech.glide.manager.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p4.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.bumptech.glide.manager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1876b;

    public k(l lVar, r rVar) {
        this.f1876b = lVar;
        this.f1875a = rVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z4) {
        if (z4) {
            synchronized (this.f1876b) {
                r rVar = this.f1875a;
                ArrayList arrayListE = n.e((Set) rVar.f1938c);
                int size = arrayListE.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListE.get(i);
                    i++;
                    l4.c cVar = (l4.c) obj;
                    if (!cVar.j() && !cVar.g()) {
                        cVar.clear();
                        if (rVar.f1937b) {
                            ((HashSet) rVar.f1939d).add(cVar);
                        } else {
                            cVar.h();
                        }
                    }
                }
            }
        }
    }
}
