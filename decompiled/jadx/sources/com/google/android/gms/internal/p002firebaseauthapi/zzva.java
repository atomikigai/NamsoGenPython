package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzva extends zzakk implements zzalq {
    private static final zzva zzb;
    private int zzd;
    private zzajf zze = zzajf.zzb;
    private zzxa zzf;

    static {
        zzva zzvaVar = new zzva();
        zzb = zzvaVar;
        zzakk.zzH(zzva.class, zzvaVar);
    }

    private zzva() {
    }

    public static zzuz zza() {
        return (zzuz) zzb.zzt();
    }

    public static zzva zzc(InputStream inputStream, zzajx zzajxVar) throws IOException {
        return (zzva) zzakk.zzy(zzb, inputStream, zzajxVar);
    }

    public static /* synthetic */ void zzf(zzva zzvaVar, zzxa zzxaVar) {
        zzxaVar.getClass();
        zzvaVar.zzf = zzxaVar;
        zzvaVar.zzd |= 1;
    }

    public final zzajf zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzva();
        }
        zzuy zzuyVar = null;
        if (i10 == 4) {
            return new zzuz(zzuyVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
