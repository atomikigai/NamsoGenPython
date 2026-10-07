package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import da.v;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeiu {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzeiu(String str, String str2, int i, long j4, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = j4;
        this.zze = num;
    }

    public final String toString() {
        String strU = this.zza + "." + this.zzc + "." + this.zzd;
        if (!TextUtils.isEmpty(this.zzb)) {
            strU = v.u(strU, ".", this.zzb);
        }
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbI)).booleanValue() || this.zze == null || TextUtils.isEmpty(this.zzb)) {
            return strU;
        }
        return strU + "." + this.zze;
    }
}
