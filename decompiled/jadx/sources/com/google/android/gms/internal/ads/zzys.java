package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzys {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyl[] zzd = new zzyl[100];

    public zzys(boolean z4, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzyl zzb() {
        zzyl zzylVar;
        try {
            this.zzb++;
            int i = this.zzc;
            if (i > 0) {
                zzyl[] zzylVarArr = this.zzd;
                int i10 = i - 1;
                this.zzc = i10;
                zzylVar = zzylVarArr[i10];
                if (zzylVar == null) {
                    throw null;
                }
                zzylVarArr[i10] = null;
            } else {
                zzylVar = new zzyl(new byte[65536], 0);
                int i11 = this.zzb;
                zzyl[] zzylVarArr2 = this.zzd;
                int length = zzylVarArr2.length;
                if (i11 > length) {
                    this.zzd = (zzyl[]) Arrays.copyOf(zzylVarArr2, length + length);
                    return zzylVar;
                }
            }
            return zzylVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc(zzyl zzylVar) {
        zzyl[] zzylVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzylVarArr[i] = zzylVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzym zzymVar) {
        while (zzymVar != null) {
            try {
                zzyl[] zzylVarArr = this.zzd;
                int i = this.zzc;
                this.zzc = i + 1;
                zzylVarArr[i] = zzymVar.zzc();
                this.zzb--;
                zzymVar = zzymVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i10 = this.zza;
        this.zza = i;
        if (i < i10) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        int i10 = zzen.zza;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i11 = this.zzc;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i11, (Object) null);
        this.zzc = iMax;
    }
}
