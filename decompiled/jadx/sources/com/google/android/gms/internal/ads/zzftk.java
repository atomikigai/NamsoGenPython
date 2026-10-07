package com.google.android.gms.internal.ads;

import android.content.Context;
import da.v;
import j$.time.Instant;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import u.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class zzftk {
    static final String zza = new UUID(0, 0).toString();
    final zzftj zzb;
    final zzfti zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzftk(Context context, String str, String str2, String str3) {
        this.zzb = zzftj.zzb(context);
        this.zzc = zzfti.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(v.u(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sbC = e.c(this.zzh, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sbC.append(str2 == null ? "null" : "not null");
        sbC.append(", hashKey is ");
        sbC.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sbC.toString());
    }

    public final long zza(boolean z4) {
        return this.zzb.zza(z4 ? this.zzg : this.zzf, -1L);
    }

    public final zzfth zzb(String str, String str2, long j4, boolean z4) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfth();
        }
        boolean z10 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZza = zza(z10);
        if (jZza != -1) {
            if (jCurrentTimeMillis < jZza) {
                this.zzb.zzd(z10 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZza + j4) {
                return zzc(str, str2);
            }
        }
        String strZze2 = zze(z10);
        return (strZze2 != null || z4) ? new zzfth(strZze2, Instant.ofEpochMilli(zza(z10))) : zzc(str, str2);
    }

    public final zzfth zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", string);
        return zzd(zzh(str, str2, string), true);
    }

    public final zzfth zzd(String str, boolean z4) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z4 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        this.zzb.zzd(z4 ? this.zze : this.zzd, str);
        return new zzfth(str, Instant.ofEpochMilli(jCurrentTimeMillis));
    }

    public final String zze(boolean z4) {
        return this.zzb.zzc(z4 ? this.zze : this.zzd, null);
    }

    public final void zzf(boolean z4) throws IOException {
        this.zzb.zze(z4 ? this.zzg : this.zzf);
        this.zzb.zze(z4 ? this.zze : this.zzd);
    }

    public final boolean zzg(boolean z4) {
        return this.zzb.zzg(this.zzd);
    }
}
