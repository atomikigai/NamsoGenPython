package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhaw extends zzgxi {
    final zzhay zza;
    zzgxk zzb = zzb();
    final /* synthetic */ zzhba zzc;

    public zzhaw(zzhba zzhbaVar) {
        this.zzc = zzhbaVar;
        this.zza = new zzhay(zzhbaVar, null);
    }

    private final zzgxk zzb() {
        zzhay zzhayVar = this.zza;
        if (zzhayVar.hasNext()) {
            return zzhayVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final byte zza() {
        zzgxk zzgxkVar = this.zzb;
        if (zzgxkVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgxkVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
