package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvg extends zztz {
    private static final zzaw zza;
    private final zzut[] zzb;
    private final zzbv[] zzc;
    private final ArrayList zzd;
    private int zze = -1;
    private long[][] zzf = new long[0][];
    private zzvf zzg;
    private final zzuc zzh;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zza("MergingMediaSource");
        zza = zzakVar.zzc();
    }

    public zzvg(boolean z4, boolean z10, zzuc zzucVar, zzut... zzutVarArr) {
        this.zzb = zzutVarArr;
        this.zzh = zzucVar;
        this.zzd = new ArrayList(Arrays.asList(zzutVarArr));
        this.zzc = new zzbv[zzutVarArr.length];
        new HashMap();
        zzgau.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzut zzutVar, zzbv zzbvVar) {
        int iZzb;
        Integer num = (Integer) obj;
        if (this.zzg != null) {
            return;
        }
        if (this.zze == -1) {
            iZzb = zzbvVar.zzb();
            this.zze = iZzb;
        } else {
            int iZzb2 = zzbvVar.zzb();
            int i = this.zze;
            if (iZzb2 != i) {
                this.zzg = new zzvf(0);
                return;
            }
            iZzb = i;
        }
        if (this.zzf.length == 0) {
            this.zzf = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzb, this.zzc.length);
        }
        this.zzd.remove(zzutVar);
        this.zzc[num.intValue()] = zzbvVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        zzve zzveVar = (zzve) zzupVar;
        int i = 0;
        while (true) {
            zzut[] zzutVarArr = this.zzb;
            if (i >= zzutVarArr.length) {
                return;
            }
            zzutVarArr[i].zzG(zzveVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final zzup zzI(zzur zzurVar, zzys zzysVar, long j4) {
        zzbv[] zzbvVarArr = this.zzc;
        int length = this.zzb.length;
        zzup[] zzupVarArr = new zzup[length];
        int iZza = zzbvVarArr[0].zza(zzurVar.zza);
        for (int i = 0; i < length; i++) {
            zzupVarArr[i] = this.zzb[i].zzI(zzurVar.zza(this.zzc[i].zzf(iZza)), zzysVar, j4 - this.zzf[iZza][i]);
        }
        return new zzve(this.zzh, this.zzf[iZza], zzupVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final zzaw zzJ() {
        zzut[] zzutVarArr = this.zzb;
        return zzutVarArr.length > 0 ? zzutVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zztq
    public final void zzn(zzhd zzhdVar) {
        super.zzn(zzhdVar);
        int i = 0;
        while (true) {
            zzut[] zzutVarArr = this.zzb;
            if (i >= zzutVarArr.length) {
                return;
            }
            zzB(Integer.valueOf(i), zzutVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zztq
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zze = -1;
        this.zzg = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzut
    public final void zzt(zzaw zzawVar) {
        this.zzb[0].zzt(zzawVar);
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final /* bridge */ /* synthetic */ zzur zzy(Object obj, zzur zzurVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzurVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zzut
    public final void zzz() throws IOException {
        zzvf zzvfVar = this.zzg;
        if (zzvfVar != null) {
            throw zzvfVar;
        }
        super.zzz();
    }
}
