package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
final class zzc extends i implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzg zzgVar, String str, long j4, d dVar) {
        super(2, dVar);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j4;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        zzc zzcVar = new zzc(this.zzb, this.zzc, this.zzd, dVar);
        zzcVar.zze = obj;
        return zzcVar;
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11555a;
        int i = this.zza;
        g.G(obj);
        if (i == 0) {
            a0 a0Var = (a0) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(b0.d(a0Var, new zzb((zza) it.next(), this.zzc, this.zzd, null)));
            }
            e0[] e0VarArr = (e0[]) arrayList.toArray(new e0[0]);
            e0[] e0VarArr2 = (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length);
            this.zza = 1;
            obj = b0.e(e0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = this.zzc;
        zzof zzofVarZzf = zzog.zzf();
        zzofVarZzf.zzd(str);
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Object obj2 = ((h) it2.next()).f9068a;
            if (!(obj2 instanceof ub.g)) {
                zzofVarZzf.zzg((zzog) obj2);
            }
        }
        return (zzog) zzofVarZzf.zzj();
    }
}
