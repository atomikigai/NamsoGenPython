package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzni extends zzit implements zzkf {
    private static final zzni zzb;
    private zzjb zzd = zzit.zzx();
    private zzjb zze = zzit.zzx();

    static {
        zzni zzniVar = new zzni();
        zzb = zzniVar;
        zzit.zzD(zzni.class, zzniVar);
    }

    private zzni() {
    }

    public static /* synthetic */ void zzI(zzni zzniVar, zznf zznfVar) {
        zznfVar.getClass();
        zzjb zzjbVar = zzniVar.zzd;
        if (!zzjbVar.zzc()) {
            zzniVar.zzd = zzit.zzy(zzjbVar);
        }
        zzniVar.zzd.add(zznfVar);
    }

    public static /* synthetic */ void zzJ(zzni zzniVar, zznu zznuVar) {
        zznuVar.getClass();
        zzjb zzjbVar = zzniVar.zze;
        if (!zzjbVar.zzc()) {
            zzniVar.zze = zzit.zzy(zzjbVar);
        }
        zzniVar.zze.add(zznuVar);
    }

    public static zznh zzi() {
        return (zznh) zzb.zzp();
    }

    public static zzni zzk(byte[] bArr) throws zzje {
        return (zzni) zzit.zzu(zzb, bArr);
    }

    public final List zzH() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzd.size();
    }

    public final int zzg() {
        return this.zze.size();
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", zznf.class, "zze", zznu.class});
        }
        if (i10 == 3) {
            return new zzni();
        }
        zzng zzngVar = null;
        if (i10 == 4) {
            return new zznh(zzngVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
