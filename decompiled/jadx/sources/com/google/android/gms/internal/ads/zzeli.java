package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeli {
    private final zzdgn zza;

    public zzeli(zzdgn zzdgnVar) {
        this.zza = zzdgnVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, View view, zzele zzeleVar) {
        zzelg zzelgVar = new zzelg(this, new zzdgv() { // from class: com.google.android.gms.internal.ads.zzelf
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z4, Context context, zzcwz zzcwzVar) {
            }
        });
        zzdfk zzdfkVarZze = this.zza.zze(new zzcsg(zzfffVar, zzfetVar, null), zzelgVar);
        zzeleVar.zzd(new zzelh(this, zzdfkVarZze));
        return zzdfkVarZze.zzg();
    }
}
