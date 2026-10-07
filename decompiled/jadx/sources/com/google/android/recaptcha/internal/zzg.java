package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.List;
import jc.f;
import r7.g;
import rc.b0;
import ub.h;
import vb.q;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg {
    private final List zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Object zza(String str, long j4, d dVar) {
        return b0.g(new zzc(this, str, j4, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzb(long j4, zzoe zzoeVar, d dVar) {
        zzd zzdVar;
        if (dVar instanceof zzd) {
            zzdVar = (zzd) dVar;
            int i = zzdVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdVar = new zzd(this, dVar);
            }
        } else {
            zzdVar = new zzd(this, dVar);
        }
        Object objG = zzdVar.zza;
        a aVar = a.f11555a;
        int i10 = zzdVar.zzc;
        if (i10 == 0) {
            g.G(objG);
            zzf zzfVar = new zzf(this, j4, zzoeVar, null);
            zzdVar.zzc = 1;
            objG = b0.g(zzfVar, zzdVar);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.G(objG);
        }
        return ((h) objG).f9068a;
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zza zzaVar) {
        this.zza.add(zzaVar);
    }

    public /* synthetic */ zzg(List list, int i, f fVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(q.f9297a);
    }
}
