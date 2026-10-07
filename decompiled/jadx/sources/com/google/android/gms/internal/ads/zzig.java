package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzig extends zzbi {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzad zzf;
    public final int zzg;
    public final zzur zzh;
    final boolean zzi;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    private zzig(int i, Throwable th, int i10) {
        this(i, th, null, i10, null, -1, null, 4, false);
    }

    public static zzig zzb(Throwable th, String str, int i, zzad zzadVar, int i10, boolean z4, int i11) {
        if (zzadVar == null) {
            i10 = 4;
        }
        return new zzig(1, th, null, i11, str, i, zzadVar, i10, z4);
    }

    public static zzig zzc(IOException iOException, int i) {
        return new zzig(0, iOException, i);
    }

    public static zzig zzd(RuntimeException runtimeException, int i) {
        return new zzig(2, runtimeException, i);
    }

    public final zzig zza(zzur zzurVar) {
        String message = getMessage();
        int i = zzen.zza;
        return new zzig(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzurVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzig(int i, Throwable th, String str, int i10, String str2, int i11, zzad zzadVar, int i12, boolean z4) {
        String str3;
        int i13;
        String strM;
        String str4;
        if (i == 0) {
            str3 = str2;
            i13 = i11;
            strM = "Source error";
        } else if (i != 1) {
            strM = "Unexpected runtime error";
            str3 = str2;
            i13 = i11;
        } else {
            String strValueOf = String.valueOf(zzadVar);
            int i14 = zzen.zza;
            if (i12 == 0) {
                str4 = "NO";
            } else if (i12 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb2 = new StringBuilder();
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            sb2.append(strValueOf);
            strM = q1.a.m(sb2, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strM : strM.concat(": null"), th, i10, i, str3, i13, zzadVar, i12, null, SystemClock.elapsedRealtime(), z4);
    }

    private zzig(String str, Throwable th, int i, int i10, String str2, int i11, zzad zzadVar, int i12, zzur zzurVar, long j4, boolean z4) {
        boolean z10;
        super(str, th, i, Bundle.EMPTY, j4);
        if (!z4) {
            z10 = true;
        } else if (i10 == 1) {
            i10 = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        zzdb.zzd(th != null);
        this.zzc = i10;
        this.zzd = str2;
        this.zze = i11;
        this.zzf = zzadVar;
        this.zzg = i12;
        this.zzh = zzurVar;
        this.zzi = z4;
    }
}
