package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzwm {
    private int zza;
    private final SparseArray zzb;
    private final zzdg zzc;

    public zzwm() {
        this(new zzdg() { // from class: com.google.android.gms.internal.ads.zzwl
            @Override // com.google.android.gms.internal.ads.zzdg
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zza(int i) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i10 = this.zza;
            if (i10 <= 0 || i >= this.zzb.keyAt(i10)) {
                break;
            }
            this.zza--;
        }
        while (this.zza < this.zzb.size() - 1 && i >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i, Object obj) {
        if (this.zza == -1) {
            zzdb.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            SparseArray sparseArray = this.zzb;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzdb.zzd(i >= iKeyAt);
            if (iKeyAt == i) {
                zzdg zzdgVar = this.zzc;
                SparseArray sparseArray2 = this.zzb;
                zzdgVar.zza(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.zzb.append(i, obj);
    }

    public final void zzd() {
        for (int i = 0; i < this.zzb.size(); i++) {
            this.zzc.zza(this.zzb.valueAt(i));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i) {
        int i10 = 0;
        while (i10 < this.zzb.size() - 1) {
            int i11 = i10 + 1;
            if (i < this.zzb.keyAt(i11)) {
                return;
            }
            this.zzc.zza(this.zzb.valueAt(i10));
            this.zzb.removeAt(i10);
            int i12 = this.zza;
            if (i12 > 0) {
                this.zza = i12 - 1;
            }
            i10 = i11;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzwm(zzdg zzdgVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdgVar;
        this.zza = -1;
    }
}
