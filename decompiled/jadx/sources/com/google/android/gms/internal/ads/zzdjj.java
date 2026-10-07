package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdjj {
    public static final zzdjj zza = new zzdjj(new zzdjh());
    private final zzbgz zzb;
    private final zzbgw zzc;
    private final zzbhm zzd;
    private final zzbhj zze;
    private final zzbmk zzf;
    private final k zzg;
    private final k zzh;

    public final zzbgw zza() {
        return this.zzc;
    }

    public final zzbgz zzb() {
        return this.zzb;
    }

    public final zzbhc zzc(String str) {
        return (zzbhc) this.zzh.get(str);
    }

    public final zzbhf zzd(String str) {
        return (zzbhf) this.zzg.get(str);
    }

    public final zzbhj zze() {
        return this.zze;
    }

    public final zzbhm zzf() {
        return this.zzd;
    }

    public final zzbmk zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.f8100c);
        int i = 0;
        while (true) {
            k kVar = this.zzg;
            if (i >= kVar.f8100c) {
                return arrayList;
            }
            arrayList.add((String) kVar.f(i));
            i++;
        }
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private zzdjj(zzdjh zzdjhVar) {
        this.zzb = zzdjhVar.zza;
        this.zzc = zzdjhVar.zzb;
        this.zzd = zzdjhVar.zzc;
        this.zzg = new k(zzdjhVar.zzf);
        this.zzh = new k(zzdjhVar.zzg);
        this.zze = zzdjhVar.zzd;
        this.zzf = zzdjhVar.zze;
    }
}
