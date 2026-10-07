package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzajs extends zzaiv {
    private static final Logger zza = Logger.getLogger(zzajs.class.getName());
    private static final boolean zzb = zzanf.zzx();
    public static final /* synthetic */ int zzf = 0;
    zzajt zze;

    private zzajs() {
    }

    public static int zzA(int i) {
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

    public static int zzB(long j4) {
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

    public static zzajs zzC(byte[] bArr, int i, int i10) {
        return new zzajo(bArr, 0, i10);
    }

    @Deprecated
    public static int zzw(int i, zzalp zzalpVar, zzamb zzambVar) {
        int iZzn = ((zzaip) zzalpVar).zzn(zzambVar);
        int iZzA = zzA(i << 3);
        return iZzA + iZzA + iZzn;
    }

    public static int zzx(int i) {
        if (i >= 0) {
            return zzA(i);
        }
        return 10;
    }

    public static int zzy(zzalp zzalpVar, zzamb zzambVar) {
        int iZzn = ((zzaip) zzalpVar).zzn(zzambVar);
        return zzA(iZzn) + iZzn;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzank.zzc(str);
        } catch (zzanj unused) {
            length = str.getBytes(zzakq.zzb).length;
        }
        return zzA(length) + length;
    }

    public final void zzD() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzanj zzanjVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzanjVar);
        byte[] bytes = str.getBytes(zzakq.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzajp(e);
        }
    }

    public abstract void zzI() throws IOException;

    public abstract void zzJ(byte b10) throws IOException;

    public abstract void zzK(int i, boolean z4) throws IOException;

    public abstract void zzL(int i, zzajf zzajfVar) throws IOException;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public abstract void zza(byte[] bArr, int i, int i10) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i10) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j4) throws IOException;

    public abstract void zzk(long j4) throws IOException;

    public abstract void zzl(int i, int i10) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(int i, zzalp zzalpVar, zzamb zzambVar) throws IOException;

    public abstract void zzo(int i, String str) throws IOException;

    public abstract void zzq(int i, int i10) throws IOException;

    public abstract void zzr(int i, int i10) throws IOException;

    public abstract void zzs(int i) throws IOException;

    public abstract void zzt(int i, long j4) throws IOException;

    public abstract void zzu(long j4) throws IOException;

    public /* synthetic */ zzajs(zzajr zzajrVar) {
    }
}
