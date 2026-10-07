package com.google.android.gms.internal.ads;

import g6.l;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcsl implements l {
    private final zzcxt zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcsl(zzcxt zzcxtVar) {
        this.zza = zzcxtVar;
    }

    private final void zzh() {
        if (this.zzc.get()) {
            return;
        }
        this.zzc.set(true);
        this.zza.zza();
    }

    @Override // g6.l
    public final void zzdq() {
        zzh();
    }

    @Override // g6.l
    public final void zzdr() {
        this.zza.zzc();
    }

    @Override // g6.l
    public final void zzdu(int i) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }

    @Override // g6.l
    public final void zzdH() {
    }

    @Override // g6.l
    public final void zzdk() {
    }

    @Override // g6.l
    public final void zzdt() {
    }
}
