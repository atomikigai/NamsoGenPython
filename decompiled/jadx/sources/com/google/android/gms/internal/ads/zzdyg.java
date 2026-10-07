package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import h6.o;
import h6.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdyg extends zzbvo {
    private final zzcao zza;
    private final zzbvx zzb;

    public zzdyg(zzcao zzcaoVar, zzbvx zzbvxVar) {
        this.zza = zzcaoVar;
        this.zzb = zzbvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(q qVar) {
        zzcao zzcaoVar = this.zza;
        qVar.getClass();
        zzcaoVar.zzd(new o(qVar.f5066a, qVar.f5067b));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdyx(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvx zzbvxVar) {
        this.zza.zzc(new zzdyx(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvxVar));
    }
}
