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
final class zzey extends i implements p {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzoe zzb;
    final /* synthetic */ zzbb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzez zzezVar, zzoe zzoeVar, zzbb zzbbVar, d dVar) {
        super(2, dVar);
        this.zza = zzezVar;
        this.zzb = zzoeVar;
        this.zzc = zzbbVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzey(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws Exception {
        a aVar = a.f11555a;
        g.G(obj);
        try {
            zzez zzezVar = this.zza;
            b0.q(this.zza.zzq.zzb(), null, new zzex(this.zza, zzezVar.zzf().zzb(this.zzb, zzezVar.zzp), null), 3);
        } catch (zzp e) {
            zzez zzezVar2 = this.zza;
            zzezVar2.zzi.zzb(this.zzc, e, null);
            ((q) this.zza.zzk()).W(e);
        }
        return k.f9073a;
    }
}
