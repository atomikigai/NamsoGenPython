package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import h6.o;
import h6.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeao extends zzbvl {
    final /* synthetic */ zzeap zza;

    public zzeao(zzeap zzeapVar) {
        this.zza = zzeapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(q qVar) {
        zzcao zzcaoVar = this.zza.zza;
        qVar.getClass();
        zzcaoVar.zzd(new o(qVar.f5066a, qVar.f5067b));
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
