package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacv {
    public static int zza(zzacs zzacsVar, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int iZzb = zzacsVar.zzb(bArr, i + i11, i10 - i11);
            if (iZzb == -1) {
                break;
            }
            i11 += iZzb;
        }
        return i11;
    }

    public static void zzb(boolean z4, String str) throws zzbh {
        if (!z4) {
            throw zzbh.zza(str, null);
        }
    }

    public static boolean zzc(zzacs zzacsVar, byte[] bArr, int i, int i10, boolean z4) throws IOException {
        try {
            return zzacsVar.zzm(bArr, 0, i10, z4);
        } catch (EOFException e) {
            if (z4) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzacs zzacsVar, byte[] bArr, int i, int i10) throws IOException {
        try {
            zzacsVar.zzi(bArr, i, i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacs zzacsVar, int i) throws IOException {
        try {
            zzacsVar.zzk(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
