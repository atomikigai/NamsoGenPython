package com.google.android.gms.internal.ads;

import android.os.Bundle;
import g6.c;
import g6.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzdnp implements e6.a, zzbih, l, zzbij, c {
    private e6.a zza;
    private zzbih zzb;
    private l zzc;
    private zzbij zzd;
    private c zze;

    @Override // e6.a
    public final synchronized void onAdClicked() {
        e6.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final synchronized void zza(String str, Bundle bundle) {
        zzbih zzbihVar = this.zzb;
        if (zzbihVar != null) {
            zzbihVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final synchronized void zzb(String str, String str2) {
        zzbij zzbijVar = this.zzd;
        if (zzbijVar != null) {
            zzbijVar.zzb(str, str2);
        }
    }

    @Override // g6.l
    public final synchronized void zzdH() {
        l lVar = this.zzc;
        if (lVar != null) {
            lVar.zzdH();
        }
    }

    @Override // g6.l
    public final synchronized void zzdk() {
        l lVar = this.zzc;
        if (lVar != null) {
            lVar.zzdk();
        }
    }

    @Override // g6.l
    public final synchronized void zzdq() {
        l lVar = this.zzc;
        if (lVar != null) {
            lVar.zzdq();
        }
    }

    @Override // g6.l
    public final synchronized void zzdr() {
        l lVar = this.zzc;
        if (lVar != null) {
            lVar.zzdr();
        }
    }

    @Override // g6.l
    public final synchronized void zzdt() {
        l lVar = this.zzc;
        if (lVar != null) {
            lVar.zzdt();
        }
    }

    @Override // g6.l
    public final synchronized void zzdu(int i) {
        l lVar = this.zzc;
        if (lVar != null) {
            lVar.zzdu(i);
        }
    }

    @Override // g6.c
    public final synchronized void zzg() {
        c cVar = this.zze;
        if (cVar != null) {
            cVar.zzg();
        }
    }

    public final synchronized void zzh(e6.a aVar, zzbih zzbihVar, l lVar, zzbij zzbijVar, c cVar) {
        this.zza = aVar;
        this.zzb = zzbihVar;
        this.zzc = lVar;
        this.zzd = zzbijVar;
        this.zze = cVar;
    }
}
