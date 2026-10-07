package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhy {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzhy(String str, Uri uri, String str2, String str3, boolean z4, boolean z10, boolean z11, boolean z12, zzig zzigVar) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z4;
        this.zze = z11;
    }

    public final zzhy zza() {
        return new zzhy(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public final zzhy zzb() {
        if (this.zzb.isEmpty()) {
            return new zzhy(null, this.zza, this.zzb, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzib zzc(String str, double d10) {
        return new zzhw(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzib zzd(String str, long j4) {
        return new zzhu(this, str, Long.valueOf(j4), true);
    }

    public final zzib zze(String str, String str2) {
        return new zzhx(this, str, str2, true);
    }

    public final zzib zzf(String str, boolean z4) {
        return new zzhv(this, str, Boolean.valueOf(z4), true);
    }

    public zzhy(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
