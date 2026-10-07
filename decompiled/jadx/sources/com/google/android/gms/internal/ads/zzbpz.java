package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import k6.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbpz implements c {
    final /* synthetic */ zzbpm zza;
    final /* synthetic */ k6.a zzb;
    final /* synthetic */ zzbqh zzc;

    public zzbpz(zzbqh zzbqhVar, zzbpm zzbpmVar, k6.a aVar) {
        this.zza = zzbpmVar;
        this.zzb = aVar;
        this.zzc = zzbqhVar;
    }

    @Override // k6.c
    public final void onFailure(w5.a aVar) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
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

    public final /* synthetic */ Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        try {
            this.zzc.getClass();
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
