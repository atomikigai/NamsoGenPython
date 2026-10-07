package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhax {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhax() {
    }

    public static /* bridge */ /* synthetic */ zzgxp zza(zzhax zzhaxVar, zzgxp zzgxpVar, zzgxp zzgxpVar2) {
        zzhaxVar.zzb(zzgxpVar);
        zzhaxVar.zzb(zzgxpVar2);
        zzgxp zzhbaVar = (zzgxp) zzhaxVar.zza.pop();
        while (!zzhaxVar.zza.isEmpty()) {
            zzhbaVar = new zzhba((zzgxp) zzhaxVar.zza.pop(), zzhbaVar);
        }
        return zzhbaVar;
    }

    private final void zzb(zzgxp zzgxpVar) {
        zzhaz zzhazVar;
        if (!zzgxpVar.zzh()) {
            if (!(zzgxpVar instanceof zzhba)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgxpVar.getClass())));
            }
            zzhba zzhbaVar = (zzhba) zzgxpVar;
            zzb(zzhbaVar.zzd);
            zzb(zzhbaVar.zze);
            return;
        }
        int iZzc = zzc(zzgxpVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int iZzc2 = zzhba.zzc(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzgxp) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzgxpVar);
            return;
        }
        int iZzc3 = zzhba.zzc(iZzc);
        zzgxp zzhbaVar2 = (zzgxp) this.zza.pop();
        while (true) {
            zzhazVar = null;
            if (this.zza.isEmpty() || ((zzgxp) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzhbaVar2 = new zzhba((zzgxp) this.zza.pop(), zzhbaVar2);
            }
        }
        zzhba zzhbaVar3 = new zzhba(zzhbaVar2, zzgxpVar);
        while (!this.zza.isEmpty()) {
            int iZzc4 = zzc(zzhbaVar3.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgxp) arrayDeque2.peek()).zzd() >= zzhba.zzc(iZzc4)) {
                break;
            } else {
                zzhbaVar3 = new zzhba((zzgxp) this.zza.pop(), zzhbaVar3);
            }
        }
        this.zza.push(zzhbaVar3);
    }

    private static final int zzc(int i) {
        int iBinarySearch = Arrays.binarySearch(zzhba.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public /* synthetic */ zzhax(zzhaz zzhazVar) {
    }
}
