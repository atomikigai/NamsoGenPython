package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import r7.g;
import rc.a0;
import rc.q;
import ub.h;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzew extends i implements p {
    int zza;
    final /* synthetic */ zzez zzb;
    final /* synthetic */ zzoe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(zzez zzezVar, zzoe zzoeVar, d dVar) {
        super(2, dVar);
        this.zzb = zzezVar;
        this.zzc = zzoeVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzew(this.zzb, this.zzc, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11555a;
        int i = this.zza;
        g.G(obj);
        if (i == 0) {
            zzez zzezVar = this.zzb;
            zzezVar.zzi.zza(zzezVar.zzp.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzh().zzj(this.zzc.zzJ())));
            this.zzb.zzn.zzd();
            this.zzb.zzn.zze();
            zzez.zzl(this.zzb, this.zzc);
            new Integer(this.zzb.zzk().hashCode());
            rc.p pVarZzk = this.zzb.zzk();
            this.zza = 1;
            if (((q) pVarZzk).V(this) == aVar) {
                return aVar;
            }
        }
        return new h(k.f9073a);
    }
}
