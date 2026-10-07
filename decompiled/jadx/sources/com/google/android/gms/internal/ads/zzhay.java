package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhay implements Iterator {
    private final ArrayDeque zza;
    private zzgxl zzb;

    public /* synthetic */ zzhay(zzgxp zzgxpVar, zzhaz zzhazVar) {
        if (!(zzgxpVar instanceof zzhba)) {
            this.zza = null;
            this.zzb = (zzgxl) zzgxpVar;
            return;
        }
        zzhba zzhbaVar = (zzhba) zzgxpVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhbaVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhbaVar);
        this.zzb = zzb(zzhbaVar.zzd);
    }

    private final zzgxl zzb(zzgxp zzgxpVar) {
        while (zzgxpVar instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) zzgxpVar;
            this.zza.push(zzhbaVar);
            zzgxpVar = zzhbaVar.zzd;
        }
        return (zzgxl) zzgxpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgxl next() {
        zzgxl zzgxlVarZzb;
        zzgxl zzgxlVar = this.zzb;
        if (zzgxlVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgxlVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgxlVarZzb = zzb(((zzhba) this.zza.pop()).zze);
        } while (zzgxlVarZzb.zzd() == 0);
        this.zzb = zzgxlVarZzb;
        return zzgxlVar;
    }
}
