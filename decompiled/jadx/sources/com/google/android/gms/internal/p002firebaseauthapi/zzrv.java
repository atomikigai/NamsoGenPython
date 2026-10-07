package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrv {
    private final zzro zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzrv(zzro zzroVar, List list, Integer num, zzru zzruVar) {
        this.zza = zzroVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrv)) {
            return false;
        }
        zzrv zzrvVar = (zzrv) obj;
        if (this.zza.equals(zzrvVar.zza) && this.zzb.equals(zzrvVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzrvVar.zzc;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
