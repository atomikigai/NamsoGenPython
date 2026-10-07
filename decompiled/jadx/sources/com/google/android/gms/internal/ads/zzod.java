package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzod implements zzoh {
    public static final zzfxg zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzob
        @Override // com.google.android.gms.internal.ads.zzfxg
        public final Object zza() {
            return zzod.zzn();
        }
    };
    private static final Random zzb = new Random();
    private final zzbu zzc;
    private final zzbt zzd;
    private final HashMap zze;
    private zzog zzf;
    private zzbv zzg;
    private String zzh;
    private long zzi;

    public zzod() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzoc zzocVar = (zzoc) this.zze.get(this.zzh);
        return (zzocVar == null || zzocVar.zzd == -1) ? this.zzi + 1 : zzocVar.zzd;
    }

    private final zzoc zzm(int i, zzur zzurVar) {
        long j4 = Long.MAX_VALUE;
        zzoc zzocVar = null;
        for (zzoc zzocVar2 : this.zze.values()) {
            zzocVar2.zzg(i, zzurVar);
            if (zzocVar2.zzj(i, zzurVar)) {
                long j10 = zzocVar2.zzd;
                if (j10 == -1 || j10 < j4) {
                    zzocVar = zzocVar2;
                    j4 = j10;
                } else if (j10 == j4) {
                    int i10 = zzen.zza;
                    if (zzocVar.zze != null && zzocVar2.zze != null) {
                        zzocVar = zzocVar2;
                    }
                }
            }
        }
        if (zzocVar != null) {
            return zzocVar;
        }
        String strZzn = zzn();
        zzoc zzocVar3 = new zzoc(this, strZzn, i, zzurVar);
        this.zze.put(strZzn, zzocVar3);
        return zzocVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzoc zzocVar) {
        if (zzocVar.zzd != -1) {
            this.zzi = zzocVar.zzd;
        }
        this.zzh = null;
    }

    private final void zzp(zzlx zzlxVar) {
        if (zzlxVar.zzb.zzo()) {
            String str = this.zzh;
            if (str != null) {
                zzoc zzocVar = (zzoc) this.zze.get(str);
                zzocVar.getClass();
                zzo(zzocVar);
                return;
            }
            return;
        }
        zzoc zzocVar2 = (zzoc) this.zze.get(this.zzh);
        zzoc zzocVarZzm = zzm(zzlxVar.zzc, zzlxVar.zzd);
        this.zzh = zzocVarZzm.zzb;
        zzi(zzlxVar);
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar == null || !zzurVar.zzb()) {
            return;
        }
        if (zzocVar2 != null) {
            if (zzocVar2.zzd == zzurVar.zzd && zzocVar2.zze != null && zzocVar2.zze.zzb == zzlxVar.zzd.zzb && zzocVar2.zze.zzc == zzlxVar.zzd.zzc) {
                return;
            }
        }
        zzur zzurVar2 = zzlxVar.zzd;
        String unused = zzm(zzlxVar.zzc, new zzur(zzurVar2.zza, zzurVar2.zzd)).zzb;
        String unused2 = zzocVarZzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized String zzf(zzbv zzbvVar, zzur zzurVar) {
        return zzm(zzbvVar.zzn(zzurVar.zza, this.zzd).zzc, zzurVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized void zzg(zzlx zzlxVar) {
        zzog zzogVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzoc zzocVar = (zzoc) this.zze.get(str);
                if (zzocVar == null) {
                    throw null;
                }
                zzo(zzocVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzoc zzocVar2 = (zzoc) it.next();
                it.remove();
                if (zzocVar2.zzf && (zzogVar = this.zzf) != null) {
                    zzogVar.zzd(zzlxVar, zzocVar2.zzb, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final void zzh(zzog zzogVar) {
        this.zzf = zzogVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized void zzi(zzlx zzlxVar) {
        zzoc zzocVarZzm;
        zzur zzurVar;
        zzoc zzocVarZzm2;
        zzoc zzocVar;
        try {
            if (this.zzf == null) {
                throw null;
            }
            if (!zzlxVar.zzb.zzo()) {
                zzur zzurVar2 = zzlxVar.zzd;
                if (zzurVar2 == null) {
                    zzocVarZzm = zzm(zzlxVar.zzc, zzlxVar.zzd);
                    if (this.zzh == null) {
                        this.zzh = zzocVarZzm.zzb;
                    }
                    zzurVar = zzlxVar.zzd;
                    if (zzurVar != null) {
                        zzocVarZzm2 = zzm(zzlxVar.zzc, new zzur(zzurVar.zza, zzurVar.zzd, zzurVar.zzb));
                        if (!zzocVarZzm2.zzf) {
                            zzocVarZzm2.zzf = true;
                            zzlxVar.zzb.zzn(zzlxVar.zzd.zza, this.zzd);
                            this.zzd.zzg(zzlxVar.zzd.zzb);
                            Math.max(0L, zzen.zzv(0L) + zzen.zzv(0L));
                            String unused = zzocVarZzm2.zzb;
                        }
                    }
                    if (!zzocVarZzm.zzf) {
                        zzocVarZzm.zzf = true;
                        String unused2 = zzocVarZzm.zzb;
                    }
                    if (zzocVarZzm.zzb.equals(this.zzh)) {
                        zzocVarZzm.zzg = true;
                        this.zzf.zzc(zzlxVar, zzocVarZzm.zzb);
                    }
                } else if (zzurVar2.zzd >= zzl() && ((zzocVar = (zzoc) this.zze.get(this.zzh)) == null || zzocVar.zzd != -1 || zzocVar.zzc == zzlxVar.zzc)) {
                    zzocVarZzm = zzm(zzlxVar.zzc, zzlxVar.zzd);
                    if (this.zzh == null) {
                        this.zzh = zzocVarZzm.zzb;
                    }
                    zzurVar = zzlxVar.zzd;
                    if (zzurVar != null && zzurVar.zzb()) {
                        zzocVarZzm2 = zzm(zzlxVar.zzc, new zzur(zzurVar.zza, zzurVar.zzd, zzurVar.zzb));
                        if (!zzocVarZzm2.zzf) {
                            zzocVarZzm2.zzf = true;
                            zzlxVar.zzb.zzn(zzlxVar.zzd.zza, this.zzd);
                            this.zzd.zzg(zzlxVar.zzd.zzb);
                            Math.max(0L, zzen.zzv(0L) + zzen.zzv(0L));
                            String unused3 = zzocVarZzm2.zzb;
                        }
                    }
                    if (!zzocVarZzm.zzf) {
                        zzocVarZzm.zzf = true;
                        String unused4 = zzocVarZzm.zzb;
                    }
                    if (zzocVarZzm.zzb.equals(this.zzh) && !zzocVarZzm.zzg) {
                        zzocVarZzm.zzg = true;
                        this.zzf.zzc(zzlxVar, zzocVarZzm.zzb);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized void zzj(zzlx zzlxVar, int i) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzoc zzocVar = (zzoc) it.next();
                if (zzocVar.zzk(zzlxVar)) {
                    it.remove();
                    if (zzocVar.zzf) {
                        boolean zEquals = zzocVar.zzb.equals(this.zzh);
                        boolean z4 = false;
                        if (i == 0 && zEquals && zzocVar.zzg) {
                            z4 = true;
                        }
                        if (zEquals) {
                            zzo(zzocVar);
                        }
                        this.zzf.zzd(zzlxVar, zzocVar.zzb, z4);
                    }
                }
            }
            zzp(zzlxVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized void zzk(zzlx zzlxVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbv zzbvVar = this.zzg;
            this.zzg = zzlxVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzoc zzocVar = (zzoc) it.next();
                if (!zzocVar.zzl(zzbvVar, this.zzg) || zzocVar.zzk(zzlxVar)) {
                    it.remove();
                    if (zzocVar.zzf) {
                        if (zzocVar.zzb.equals(this.zzh)) {
                            zzo(zzocVar);
                        }
                        this.zzf.zzd(zzlxVar, zzocVar.zzb, false);
                    }
                }
            }
            zzp(zzlxVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zzod(zzfxg zzfxgVar) {
        this.zzc = new zzbu();
        this.zzd = new zzbt();
        this.zze = new HashMap();
        this.zzg = zzbv.zza;
        this.zzi = -1L;
    }
}
