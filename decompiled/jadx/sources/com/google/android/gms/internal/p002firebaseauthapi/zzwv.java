package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwv extends zzakk implements zzalq {
    private static final zzwv zzb;
    private int zzd;
    private zzakp zze = zzakk.zzA();

    static {
        zzwv zzwvVar = new zzwv();
        zzb = zzwvVar;
        zzakk.zzH(zzwv.class, zzwvVar);
    }

    private zzwv() {
    }

    public static zzws zzc() {
        return (zzws) zzb.zzt();
    }

    public static zzwv zzf(InputStream inputStream, zzajx zzajxVar) throws IOException {
        return (zzwv) zzakk.zzy(zzb, inputStream, zzajxVar);
    }

    public static zzwv zzg(byte[] bArr, zzajx zzajxVar) throws zzaks {
        return (zzwv) zzakk.zzz(zzb, bArr, zzajxVar);
    }

    public static /* synthetic */ void zzk(zzwv zzwvVar, zzwu zzwuVar) {
        zzwuVar.getClass();
        zzakp zzakpVar = zzwvVar.zze;
        if (!zzakpVar.zzc()) {
            zzwvVar.zze = zzakk.zzB(zzakpVar);
        }
        zzwvVar.zze.add(zzwuVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    public final int zzb() {
        return this.zzd;
    }

    public final zzwu zzd(int i) {
        return (zzwu) this.zze.get(i);
    }

    public final List zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzwu.class});
        }
        if (i10 == 3) {
            return new zzwv();
        }
        zzwr zzwrVar = null;
        if (i10 == 4) {
            return new zzws(zzwrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
