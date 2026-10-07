package com.google.android.gms.internal.ads;

import d6.p;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfhb {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfia zzd = new zzfia();

    public zzfhb(int i, int i10) {
        this.zzb = i;
        this.zzc = i10;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            zzfhl zzfhlVar = (zzfhl) this.zza.getFirst();
            p.C.f2983j.getClass();
            if (System.currentTimeMillis() - zzfhlVar.zzd < this.zzc) {
                return;
            }
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfhl zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfhl zzfhlVar = (zzfhl) this.zza.remove();
        if (zzfhlVar != null) {
            this.zzd.zzh();
        }
        return zzfhlVar;
    }

    public final zzfhz zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfhl zzfhlVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfhlVar);
        return true;
    }
}
