package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzte {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzte(String str, boolean z4, boolean z10) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzte.class) {
            zzte zzteVar = (zzte) obj;
            if (TextUtils.equals(this.zza, zzteVar.zza) && this.zzb == zzteVar.zzb && this.zzc == zzteVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
