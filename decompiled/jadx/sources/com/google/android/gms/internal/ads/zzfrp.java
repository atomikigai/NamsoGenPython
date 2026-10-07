package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfrp {
    final /* synthetic */ zzfrr zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfrp(zzfrr zzfrrVar, byte[] bArr, zzfrq zzfrqVar) {
        this.zza = zzfrrVar;
        this.zzb = bArr;
    }

    public final zzfrp zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfrp zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfrr zzfrrVar = this.zza;
            if (zzfrrVar.zzb) {
                zzfrrVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
