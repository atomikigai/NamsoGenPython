package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jc.q;
import r7.g;
import rc.a0;
import rc.b0;
import rc.e0;
import ub.h;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzf extends i implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzgVar, long j4, zzoe zzoeVar, d dVar) {
        super(2, dVar);
        this.zzb = zzgVar;
        this.zzc = j4;
        this.zzd = zzoeVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, dVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        a aVar = a.f11555a;
        if (this.zza != 0) {
            qVar = (q) this.zze;
            g.G(obj);
        } else {
            g.G(obj);
            a0 a0Var = (a0) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(b0.d(a0Var, new zze((zza) it.next(), this.zzc, this.zzd, null)));
            }
            q qVar2 = new q();
            e0[] e0VarArr = (e0[]) arrayList.toArray(new e0[0]);
            e0[] e0VarArr2 = (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length);
            this.zze = qVar2;
            this.zza = 1;
            Object objE = b0.e(e0VarArr2, this);
            if (objE == aVar) {
                return aVar;
            }
            qVar = qVar2;
            obj = objE;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Throwable thA = h.a(((h) it2.next()).f9068a);
            if (thA != null) {
                zzp zzpVar = null;
                if (qVar.f5776a != null) {
                    zzpVar = new zzp(zzn.zzc, zzl.zzal, null);
                } else if (thA instanceof zzp) {
                    zzpVar = (zzp) thA;
                }
                qVar.f5776a = zzpVar;
            }
        }
        zzp zzpVar2 = (zzp) qVar.f5776a;
        return new h(zzpVar2 != null ? g.m(zzpVar2) : k.f9073a);
    }
}
