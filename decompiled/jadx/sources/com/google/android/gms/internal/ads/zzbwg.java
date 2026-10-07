package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbwg extends zzbwi {
    private final String zza;
    private final int zzb;

    public zzbwg(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwg)) {
            zzbwg zzbwgVar = (zzbwg) obj;
            if (i0.m(this.zza, zzbwgVar.zza)) {
                if (i0.m(Integer.valueOf(this.zzb), Integer.valueOf(zzbwgVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzc() {
        return this.zza;
    }
}
