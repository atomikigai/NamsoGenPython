package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import r7.g;
import rc.a0;
import rc.b0;
import rc.q;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzet extends i implements p {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(String str, zzez zzezVar, d dVar) {
        super(2, dVar);
        this.zzb = str;
        this.zzc = zzezVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzet(this.zzb, this.zzc, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f11555a;
        int i = this.zza;
        g.G(obj);
        if (i != 0) {
            return obj;
        }
        zzez zzezVar = this.zzc;
        String str = this.zzb;
        q qVarA = b0.a();
        zzezVar.zzl.put(str, qVarA);
        String str2 = this.zzb;
        zzou zzouVarZzf = zzov.zzf();
        zzouVarZzf.zzd(str2);
        byte[] bArrZzd = ((zzov) zzouVarZzf.zzj()).zzd();
        b0.q(this.zzc.zzq.zzb(), null, new zzes(this.zzc, zzfy.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
        this.zza = 1;
        Object objV = qVarA.V(this);
        return objV == aVar ? aVar : objV;
    }
}
