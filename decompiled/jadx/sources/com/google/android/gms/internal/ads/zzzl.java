package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzl {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzzj) obj).zza - ((zzzj) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzzj) obj).zzc, ((zzzj) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzj[] zzd = new zzzj[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzl(int i) {
    }

    public final float zza(float f10) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i = 0;
        for (int i10 = 0; i10 < this.zzc.size(); i10++) {
            float f12 = 0.5f * f11;
            zzzj zzzjVar = (zzzj) this.zzc.get(i10);
            i += zzzjVar.zzb;
            if (i >= f12) {
                return zzzjVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzzj) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i, float f10) {
        zzzj zzzjVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i10 = this.zzh;
        if (i10 > 0) {
            zzzj[] zzzjVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzh = i11;
            zzzjVar = zzzjVarArr[i11];
        } else {
            zzzjVar = new zzzj(null);
        }
        int i12 = this.zzf;
        this.zzf = i12 + 1;
        zzzjVar.zza = i12;
        zzzjVar.zzb = i;
        zzzjVar.zzc = f10;
        this.zzc.add(zzzjVar);
        this.zzg += i;
        while (true) {
            int i13 = this.zzg;
            if (i13 <= 2000) {
                return;
            }
            int i14 = i13 - 2000;
            zzzj zzzjVar2 = (zzzj) this.zzc.get(0);
            int i15 = zzzjVar2.zzb;
            if (i15 <= i14) {
                this.zzg -= i15;
                this.zzc.remove(0);
                int i16 = this.zzh;
                if (i16 < 5) {
                    zzzj[] zzzjVarArr2 = this.zzd;
                    this.zzh = i16 + 1;
                    zzzjVarArr2[i16] = zzzjVar2;
                }
            } else {
                zzzjVar2.zzb = i15 - i14;
                this.zzg -= i14;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
