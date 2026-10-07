package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbv {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzbu zzc;

    public final zzbv zza(Object obj, Object obj2) {
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i + i;
        if (i10 > length) {
            if (i10 > length) {
                length = length + (length >> 1) + 1;
                if (length < i10) {
                    int iHighestOneBit = Integer.highestOneBit(i10 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = f.API_PRIORITY_OTHER;
                }
            }
            this.zza = Arrays.copyOf(objArr, length);
        }
        zzbo.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i11 = this.zzb;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.zzb = i11 + 1;
        return this;
    }

    public final zzbw zzb() {
        zzbu zzbuVar = this.zzc;
        if (zzbuVar != null) {
            throw zzbuVar.zza();
        }
        zzcf zzcfVarZzg = zzcf.zzg(this.zzb, this.zza, this);
        zzbu zzbuVar2 = this.zzc;
        if (zzbuVar2 == null) {
            return zzcfVarZzg;
        }
        throw zzbuVar2.zza();
    }
}
