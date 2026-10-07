package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzix extends zziu {
    public zzix() {
        super(4);
    }

    public final zzix zza(Object... objArr) {
        zzjd.zzb(objArr, 15);
        int i = this.zzb;
        int i10 = i + 15;
        Object[] objArr2 = this.zza;
        int length = objArr2.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int iHighestOneBit = Integer.highestOneBit(i + 14);
                i11 = iHighestOneBit + iHighestOneBit;
            }
            if (i11 < 0) {
                i11 = f.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr2, i11);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr2.clone();
            this.zzc = false;
        }
        System.arraycopy(objArr, 0, this.zza, this.zzb, 15);
        this.zzb += 15;
        return this;
    }

    public final zzja zzb() {
        this.zzc = true;
        return zzja.zzg(this.zza, this.zzb);
    }
}
