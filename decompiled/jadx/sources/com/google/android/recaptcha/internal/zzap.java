package com.google.android.recaptcha.internal;

import ac.c;
import ub.h;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzap extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzaw zzawVar, d dVar) {
        super(dVar);
        this.zzb = zzawVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo2execute0E7RQCE = this.zzb.mo2execute0E7RQCE(null, 0L, this);
        return objMo2execute0E7RQCE == a.f11555a ? objMo2execute0E7RQCE : new h(objMo2execute0E7RQCE);
    }
}
