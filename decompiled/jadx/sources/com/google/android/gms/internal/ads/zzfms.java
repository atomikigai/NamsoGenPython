package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import e6.h3;
import e6.s0;
import i6.h;
import java.util.concurrent.ScheduledExecutorService;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfms extends zzfmo {
    public zzfms(ClientApi clientApi, Context context, int i, zzbpg zzbpgVar, h3 h3Var, s0 s0Var, ScheduledExecutorService scheduledExecutorService, zzflx zzflxVar, n7.a aVar) {
        super(clientApi, context, i, zzbpgVar, h3Var, s0Var, scheduledExecutorService, zzflxVar, aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final m9.a zza() {
        ClientApi clientApi = this.zza;
        zzgfa zzgfaVarZze = zzgfa.zze();
        zzbxc zzbxcVarA = clientApi.A(new b(this.zzb), this.zze.f3318a, this.zzd, this.zzc);
        zzfmr zzfmrVar = new zzfmr(this, zzgfaVarZze, zzbxcVarA);
        if (zzbxcVarA == null) {
            zzgfaVarZze.zzd(new zzflt(1, "Failed to create a rewarded ad."));
            return zzgfaVarZze;
        }
        try {
            zzbxcVarA.zzf(this.zze.f3320c, zzfmrVar);
            return zzgfaVarZze;
        } catch (RemoteException unused) {
            h.g("Failed to load rewarded ad.");
            zzgfaVarZze.zzd(new zzflt(1, "remote exception"));
            return zzgfaVarZze;
        }
    }
}
