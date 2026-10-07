package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyk {
    public final int zza;
    public final zzlr[] zzb;
    public final zzyd[] zzc;
    public final zzcd zzd;
    public final Object zze;

    public zzyk(zzlr[] zzlrVarArr, zzyd[] zzydVarArr, zzcd zzcdVar, Object obj) {
        int length = zzlrVarArr.length;
        zzdb.zzd(length == zzydVarArr.length);
        this.zzb = zzlrVarArr;
        this.zzc = (zzyd[]) zzydVarArr.clone();
        this.zzd = zzcdVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(zzyk zzykVar, int i) {
        return zzykVar != null && Objects.equals(this.zzb[i], zzykVar.zzb[i]) && Objects.equals(this.zzc[i], zzykVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
