package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzll extends zzhn {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbv[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzll(Collection collection, zzwj zzwjVar) {
        zzbv[] zzbvVarArr = new zzbv[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i10 = 0;
        while (it.hasNext()) {
            zzbvVarArr[i10] = ((zzku) it.next()).zza();
            i10++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzku) it2.next()).zzb();
            i++;
        }
        this(zzbvVarArr, objArr, zzwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzq(int i) {
        return zzen.zzc(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzr(int i) {
        return zzen.zzc(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzs(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzt(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final zzbv zzu(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final Object zzv(int i) {
        return this.zzh[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzll zzx(zzwj zzwjVar) {
        zzbv[] zzbvVarArr = new zzbv[this.zzg.length];
        int i = 0;
        while (true) {
            zzbv[] zzbvVarArr2 = this.zzg;
            if (i >= zzbvVarArr2.length) {
                return new zzll(zzbvVarArr, this.zzh, zzwjVar);
            }
            zzbvVarArr[i] = new zzlk(this, zzbvVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzll(zzbv[] zzbvVarArr, Object[] objArr, zzwj zzwjVar) {
        super(false, zzwjVar);
        int i = 0;
        this.zzg = zzbvVarArr;
        int length = zzbvVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZzc = 0;
        int iZzb = 0;
        int i10 = 0;
        while (i < zzbvVarArr.length) {
            zzbv zzbvVar = zzbvVarArr[i];
            this.zzg[i10] = zzbvVar;
            this.zzf[i10] = iZzc;
            this.zze[i10] = iZzb;
            iZzc += zzbvVar.zzc();
            iZzb += this.zzg[i10].zzb();
            this.zzi.put(objArr[i10], Integer.valueOf(i10));
            i++;
            i10++;
        }
        this.zzc = iZzc;
        this.zzd = iZzb;
    }
}
