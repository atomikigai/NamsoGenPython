package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzabc implements zzafe {
    final /* synthetic */ zzabd zza;

    public zzabc(zzabd zzabdVar) {
        this.zza = zzabdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zzc.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaim zzaimVar = (zzaim) obj;
        if (TextUtils.isEmpty(zzaimVar.zzb()) || TextUtils.isEmpty(zzaimVar.zzc())) {
            this.zza.zzc.zzh(b.G("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzahb zzahbVar = new zzahb(zzaimVar.zzc(), zzaimVar.zzb(), Long.valueOf(zzahd.zza(zzaimVar.zzb())), "Bearer");
        zzabd zzabdVar = this.zza;
        zzabdVar.zzd.zzR(zzahbVar, null, null, Boolean.FALSE, null, zzabdVar.zzc, this);
    }
}
