package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhbg implements Iterator {
    final /* synthetic */ zzhbj zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhbg(zzhbj zzhbjVar, zzhbi zzhbiVar) {
        this.zza = zzhbjVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzhbj zzhbjVar = this.zza;
        if (i >= zzhbjVar.zzb) {
            return !zzhbjVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzhbj zzhbjVar = this.zza;
        return i < zzhbjVar.zzb ? (zzhbf) zzhbjVar.zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i = this.zzb;
        zzhbj zzhbjVar = this.zza;
        if (i >= zzhbjVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzhbjVar.zzm(i);
        }
    }
}
