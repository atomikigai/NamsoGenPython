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
final class zzb extends i implements p {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zza zzaVar, String str, long j4, d dVar) {
        super(2, dVar);
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = j4;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzb(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws zzp {
        Object objZza;
        a aVar = a.f11555a;
        int i = this.zza;
        g.G(obj);
        if (i != 0) {
            objZza = ((h) obj).f9068a;
        } else {
            zza zzaVar = this.zzb;
            String str = this.zzc;
            long j4 = this.zzd;
            this.zza = 1;
            objZza = zzaVar.zza(str, j4, this);
            if (objZza == aVar) {
                return aVar;
            }
        }
        return new h(objZza);
    }
}
