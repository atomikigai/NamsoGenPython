package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhh extends zzgm {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzhh.class.getName());
    private static final boolean zzd = zzlv.zzx();
    zzhi zza;

    private zzhh() {
    }

    public static zzhh zzA(byte[] bArr, int i, int i10) {
        return new zzhe(bArr, 0, i10);
    }

    @Deprecated
    public static int zzt(int i, zzke zzkeVar, zzkr zzkrVar) {
        int iZza = ((zzgf) zzkeVar).zza(zzkrVar);
        int iZzy = zzy(i << 3);
        return iZzy + iZzy + iZza;
    }

    public static int zzu(int i) {
        if (i >= 0) {
            return zzy(i);
        }
        return 10;
    }

    public static int zzv(zzke zzkeVar) {
        int iZzn = zzkeVar.zzn();
        return zzy(iZzn) + iZzn;
    }

    public static int zzw(zzke zzkeVar, zzkr zzkrVar) {
        int iZza = ((zzgf) zzkeVar).zza(zzkrVar);
        return zzy(iZza) + iZza;
    }

    public static int zzx(String str) {
        int length;
        try {
            length = zzma.zzc(str);
        } catch (zzlz unused) {
            length = str.getBytes(zzjc.zzb).length;
        }
        return zzy(length) + length;
    }

    public static int zzy(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzz(long j4) {
        int i;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j4) != 0) {
            j4 >>>= 14;
            i += 2;
        }
        return (j4 & (-16384)) != 0 ? i + 1 : i;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzlz zzlzVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzlzVar);
        byte[] bytes = str.getBytes(zzjc.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhf(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i, boolean z4) throws IOException;

    public abstract void zze(int i, zzgw zzgwVar) throws IOException;

    public abstract void zzf(int i, int i10) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j4) throws IOException;

    public abstract void zzi(long j4) throws IOException;

    public abstract void zzj(int i, int i10) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i10) throws IOException;

    public abstract void zzm(int i, String str) throws IOException;

    public abstract void zzo(int i, int i10) throws IOException;

    public abstract void zzp(int i, int i10) throws IOException;

    public abstract void zzq(int i) throws IOException;

    public abstract void zzr(int i, long j4) throws IOException;

    public abstract void zzs(long j4) throws IOException;

    public /* synthetic */ zzhh(zzhg zzhgVar) {
    }
}
