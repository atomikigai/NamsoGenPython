package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlb implements zzvb, zzrl {
    final /* synthetic */ zzlf zza;
    private final zzld zzb;

    public zzlb(zzlf zzlfVar, zzld zzldVar) {
        this.zza = zzlfVar;
        this.zzb = zzldVar;
    }

    private final Pair zzf(int i, zzur zzurVar) {
        zzur zzurVarZza;
        zzur zzurVar2 = null;
        if (zzurVar != null) {
            zzld zzldVar = this.zzb;
            int i10 = 0;
            while (true) {
                if (i10 >= zzldVar.zzc.size()) {
                    zzurVarZza = null;
                    break;
                }
                if (((zzur) zzldVar.zzc.get(i10)).zzd == zzurVar.zzd) {
                    zzurVarZza = zzurVar.zza(Pair.create(zzldVar.zzb, zzurVar.zza));
                    break;
                }
                i10++;
            }
            if (zzurVarZza == null) {
                return null;
            }
            zzurVar2 = zzurVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzurVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaf(int i, zzur zzurVar, final zzun zzunVar) {
        final Pair pairZzf = zzf(0, zzurVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkz
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzur) pair.second, zzunVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzag(int i, zzur zzurVar, final zzui zzuiVar, final zzun zzunVar) {
        final Pair pairZzf = zzf(0, zzurVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzag(((Integer) pair.first).intValue(), (zzur) pair.second, zzuiVar, zzunVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzah(int i, zzur zzurVar, final zzui zzuiVar, final zzun zzunVar) {
        final Pair pairZzf = zzf(0, zzurVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzah(((Integer) pair.first).intValue(), (zzur) pair.second, zzuiVar, zzunVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzai(int i, zzur zzurVar, final zzui zzuiVar, final zzun zzunVar, final IOException iOException, final boolean z4) {
        final Pair pairZzf = zzf(0, zzurVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzai(((Integer) pair.first).intValue(), (zzur) pair.second, zzuiVar, zzunVar, iOException, z4);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaj(int i, zzur zzurVar, final zzui zzuiVar, final zzun zzunVar) {
        final Pair pairZzf = zzf(0, zzurVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzky
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzaj(((Integer) pair.first).intValue(), (zzur) pair.second, zzuiVar, zzunVar);
                }
            });
        }
    }
}
