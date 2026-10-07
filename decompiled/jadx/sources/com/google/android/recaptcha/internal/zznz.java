package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznz extends zzit implements zzkf {
    private static final zznz zzb;
    private int zzd;
    private zznx zze;
    private zznx zzf;

    static {
        zznz zznzVar = new zznz();
        zzb = zznzVar;
        zzit.zzD(zznz.class, zznzVar);
    }

    private zznz() {
    }

    public static zznz zzj(byte[] bArr) throws zzje {
        return (zznz) zzit.zzu(zzb, bArr);
    }

    public final zznx zzf() {
        zznx zznxVar = this.zze;
        return zznxVar == null ? zznx.zzg() : zznxVar;
    }

    public final zznx zzg() {
        zznx zznxVar = this.zzf;
        return zznxVar == null ? zznx.zzg() : zznxVar;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zznz();
        }
        zznv zznvVar = null;
        if (i10 == 4) {
            return new zzny(zznvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
