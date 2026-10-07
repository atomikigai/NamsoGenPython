package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzyj {
    private zzyi zza;
    private zzyr zzb;

    public zzlp zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzg zzgVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzyk zzo(zzlq[] zzlqVarArr, zzwr zzwrVar, zzur zzurVar, zzbv zzbvVar) throws zzig;

    public abstract void zzp(Object obj);

    public final zzyr zzq() {
        zzyr zzyrVar = this.zzb;
        zzdb.zzb(zzyrVar);
        return zzyrVar;
    }

    public final void zzr(zzyi zzyiVar, zzyr zzyrVar) {
        this.zza = zzyiVar;
        this.zzb = zzyrVar;
    }

    public final void zzs() {
        zzyi zzyiVar = this.zza;
        if (zzyiVar != null) {
            zzyiVar.zzj();
        }
    }
}
