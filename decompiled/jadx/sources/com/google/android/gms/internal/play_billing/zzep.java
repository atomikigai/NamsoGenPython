package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzep extends zzdz {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzep.class.getName());
    private static final boolean zzd = zzho.zzx();
    zzeq zza;

    private zzep() {
        throw null;
    }

    public static int zzA(zzgl zzglVar, zzgv zzgvVar) {
        int iZze = ((zzds) zzglVar).zze(zzgvVar);
        return zzC(iZze) + iZze;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzhr.zzc(str);
        } catch (zzhq unused) {
            length = str.getBytes(zzfo.zza).length;
        }
        return zzC(length) + length;
    }

    public static int zzC(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzD(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzy(int i, zzgl zzglVar, zzgv zzgvVar) {
        int iZzC = zzC(i << 3);
        return ((zzds) zzglVar).zze(zzgvVar) + iZzC + iZzC;
    }

    public static int zzz(zzgl zzglVar) {
        int iZzj = zzglVar.zzj();
        return zzC(iZzj) + iZzj;
    }

    public final void zzE() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzF(String str, zzhq zzhqVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhqVar);
        byte[] bytes = str.getBytes(zzfo.zza);
        try {
            int length = bytes.length;
            zzv(length);
            zzm(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i, boolean z4) throws IOException;

    public abstract void zze(int i, zzei zzeiVar) throws IOException;

    public abstract void zzg(int i, int i10) throws IOException;

    public abstract void zzh(int i) throws IOException;

    public abstract void zzi(int i, long j4) throws IOException;

    public abstract void zzj(long j4) throws IOException;

    public abstract void zzk(int i, int i10) throws IOException;

    public abstract void zzl(int i) throws IOException;

    public abstract void zzm(byte[] bArr, int i, int i10) throws IOException;

    public abstract void zzn(int i, zzgl zzglVar, zzgv zzgvVar) throws IOException;

    public abstract void zzp(int i, zzgl zzglVar) throws IOException;

    public abstract void zzq(int i, zzei zzeiVar) throws IOException;

    public abstract void zzr(int i, String str) throws IOException;

    public abstract void zzt(int i, int i10) throws IOException;

    public abstract void zzu(int i, int i10) throws IOException;

    public abstract void zzv(int i) throws IOException;

    public abstract void zzw(int i, long j4) throws IOException;

    public abstract void zzx(long j4) throws IOException;

    public /* synthetic */ zzep(zzeo zzeoVar) {
    }
}
