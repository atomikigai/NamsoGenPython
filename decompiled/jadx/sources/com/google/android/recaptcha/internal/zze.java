package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import r7.g;
import rc.a0;
import ub.h;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zze extends i implements p {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zza zzaVar, long j4, zzoe zzoeVar, d dVar) {
        super(2, dVar);
        this.zzb = zzaVar;
        this.zzc = j4;
        this.zzd = zzoeVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zze(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws zzp {
        Object objZzb;
        a aVar = a.f11555a;
        int i = this.zza;
        g.G(obj);
        if (i != 0) {
            objZzb = ((h) obj).f9068a;
        } else {
            zza zzaVar = this.zzb;
            long j4 = this.zzc;
            zzoe zzoeVar = this.zzd;
            this.zza = 1;
            objZzb = zzaVar.zzb(j4, zzoeVar, this);
            if (objZzb == aVar) {
                return aVar;
            }
        }
        return new h(objZzb);
    }
}
