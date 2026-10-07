package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import k6.c;
import k6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbqd implements c {
    final /* synthetic */ zzbpm zza;
    final /* synthetic */ zzbqh zzb;

    public zzbqd(zzbqh zzbqhVar, zzbpm zzbpmVar) {
        this.zza = zzbpmVar;
        this.zzb = zzbqhVar;
    }

    @Override // k6.c
    public final void onFailure(w5.a aVar) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            int i = aVar.f9632a;
            int i10 = aVar.f9632a;
            String str = aVar.f9633b;
            h.b(canonicalName + "failed to load mediation ad: ErrorCode = " + i + ". ErrorMessage = " + str + ". ErrorDomain = " + aVar.f9634c);
            this.zza.zzh(aVar.a());
            this.zza.zzi(i10, str);
            this.zza.zzg(i10);
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzg = (t) obj;
            this.zza.zzo();
        } catch (RemoteException e) {
            h.e("", e);
        }
        return new zzbpx(this.zza);
    }

    public final void onFailure(String str) {
        onFailure(new w5.a(0, str, "undefined", null));
    }
}
