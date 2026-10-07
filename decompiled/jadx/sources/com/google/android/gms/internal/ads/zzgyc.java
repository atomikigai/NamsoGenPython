package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgyc extends zzgxg {
    private static final Logger zza = Logger.getLogger(zzgyc.class.getName());
    private static final boolean zzb = zzhbu.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgyd zze;

    private zzgyc() {
        throw null;
    }

    public static int zzA(zzhai zzhaiVar, zzhbb zzhbbVar) {
        int iZzaM = ((zzgwy) zzhaiVar).zzaM(zzhbbVar);
        return zzD(iZzaM) + iZzaM;
    }

    public static int zzB(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhbz.zze(str);
        } catch (zzhby unused) {
            length = str.getBytes(zzgzk.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzE(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzy(int i, zzhai zzhaiVar, zzhbb zzhbbVar) {
        int iZzD = zzD(i << 3);
        return ((zzgwy) zzhaiVar).zzaM(zzhbbVar) + iZzD + iZzD;
    }

    public static int zzz(zzhai zzhaiVar) {
        int iZzaY = zzhaiVar.zzaY();
        return zzD(iZzaY) + iZzaY;
    }

    public final void zzF() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzG(String str, zzhby zzhbyVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhbyVar);
        byte[] bytes = str.getBytes(zzgzk.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxz(e);
        }
    }

    public abstract void zzK() throws IOException;

    public abstract void zzL(byte b10) throws IOException;

    public abstract void zzM(int i, boolean z4) throws IOException;

    public abstract void zzN(int i, zzgxp zzgxpVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgxg
    public abstract void zza(byte[] bArr, int i, int i10) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i10) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j4) throws IOException;

    public abstract void zzk(long j4) throws IOException;

    public abstract void zzl(int i, int i10) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(int i, zzhai zzhaiVar, zzhbb zzhbbVar) throws IOException;

    public abstract void zzo(int i, zzhai zzhaiVar) throws IOException;

    public abstract void zzp(int i, zzgxp zzgxpVar) throws IOException;

    public abstract void zzq(int i, String str) throws IOException;

    public abstract void zzs(int i, int i10) throws IOException;

    public abstract void zzt(int i, int i10) throws IOException;

    public abstract void zzu(int i) throws IOException;

    public abstract void zzv(int i, long j4) throws IOException;

    public abstract void zzw(long j4) throws IOException;

    public /* synthetic */ zzgyc(zzgyb zzgybVar) {
    }
}
