package com.google.android.recaptcha;

import ac.c;
import ub.h;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM1getClientBWLJW6A = this.zzb.m1getClientBWLJW6A(null, null, 0L, this);
        return objM1getClientBWLJW6A == a.f11555a ? objM1getClientBWLJW6A : new h(objM1getClientBWLJW6A);
    }
}
