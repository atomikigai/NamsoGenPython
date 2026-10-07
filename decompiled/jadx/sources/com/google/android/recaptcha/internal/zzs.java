package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import r7.g;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs extends i implements p {
    public zzs(d dVar) {
        super(2, dVar);
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzs(dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzs((d) obj2).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11555a;
        g.G(obj);
        Thread.currentThread().setPriority(8);
        return k.f9073a;
    }
}
