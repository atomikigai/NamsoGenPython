package com.google.android.recaptcha.internal;

import ac.c;
import ub.h;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzd extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzg zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, d dVar) {
        super(dVar);
        this.zzb = zzgVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzb = this.zzb.zzb(0L, null, this);
        return objZzb == a.f11555a ? objZzb : new h(objZzb);
    }
}
