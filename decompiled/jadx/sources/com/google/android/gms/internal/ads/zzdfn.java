package com.google.android.gms.internal.ads;

import android.view.View;
import g6.i;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzdfn {
    private final zzdgv zza;
    private final zzcfk zzb;

    public zzdfn(zzdgv zzdgvVar, zzcfk zzcfkVar) {
        this.zza = zzdgvVar;
        this.zzb = zzcfkVar;
    }

    public final View zza() {
        zzcfk zzcfkVar = this.zzb;
        if (zzcfkVar == null) {
            return null;
        }
        return zzcfkVar.zzG();
    }

    public final View zzb() {
        zzcfk zzcfkVar = this.zzb;
        if (zzcfkVar != null) {
            return zzcfkVar.zzG();
        }
        return null;
    }

    public final zzcfk zzc() {
        return this.zzb;
    }

    public final zzded zzd(Executor executor) {
        final zzcfk zzcfkVar = this.zzb;
        return new zzded(new zzdbb() { // from class: com.google.android.gms.internal.ads.zzdfm
            @Override // com.google.android.gms.internal.ads.zzdbb
            public final void zza() {
                i iVarZzL;
                zzcfk zzcfkVar2 = zzcfkVar;
                if (zzcfkVar2 == null || (iVarZzL = zzcfkVar2.zzL()) == null) {
                    return;
                }
                iVarZzL.zzb();
            }
        }, executor);
    }

    public final zzdgv zze() {
        return this.zza;
    }

    public Set zzf(zzcvj zzcvjVar) {
        return Collections.singleton(new zzded(zzcvjVar, zzcaj.zzf));
    }

    public Set zzg(zzcvj zzcvjVar) {
        return Collections.singleton(new zzded(zzcvjVar, zzcaj.zzf));
    }
}
