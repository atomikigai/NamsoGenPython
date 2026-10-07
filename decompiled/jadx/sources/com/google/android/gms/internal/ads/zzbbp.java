package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbbp {
    final /* synthetic */ zzbbr zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbbp(zzbbr zzbbrVar, byte[] bArr, zzbbq zzbbqVar) {
        this.zza = zzbbrVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbbr zzbbrVar = this.zza;
            if (zzbbrVar.zzb) {
                zzbbrVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            h.c("Clearcut log failed", e);
        }
    }

    public final zzbbp zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }
}
