package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import q7.b;
import r7.f;
import z7.k1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcx extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzef zzefVar, String str, String str2, Context context, Bundle bundle) {
        super(zzefVar, true);
        this.zze = zzefVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            if (this.zze.zzW(this.zza, this.zzb)) {
                str3 = this.zzb;
                str2 = this.zza;
                str = this.zze.zzd;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            i0.i(this.zzc);
            zzef zzefVar = this.zze;
            zzefVar.zzj = zzefVar.zzf(this.zzc, true);
            if (this.zze.zzj == null) {
                Log.w(this.zze.zzd, "Failed to connect to measurement client.");
                return;
            }
            int iA = f.a(this.zzc, ModuleDescriptor.MODULE_ID);
            int iD = f.d(this.zzc, ModuleDescriptor.MODULE_ID, false);
            zzcl zzclVar = new zzcl(79000L, Math.max(iA, iD), iD < iA, str, str2, str3, this.zzd, k1.b(this.zzc));
            zzcc zzccVar = this.zze.zzj;
            i0.i(zzccVar);
            zzccVar.initialize(new b(this.zzc), zzclVar, this.zzh);
        } catch (Exception e) {
            this.zze.zzT(e, true, false);
        }
    }
}
