package com.google.android.gms.internal.p002firebaseauthapi;

import n9.h;
import v9.t;
import v9.u;
import v9.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzafl extends v {
    final /* synthetic */ v zza;
    final /* synthetic */ String zzb;

    public zzafl(v vVar, String str) {
        this.zza = vVar;
        this.zzb = str;
    }

    @Override // v9.v
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzafn.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // v9.v
    public final void onCodeSent(String str, u uVar) {
        this.zza.onCodeSent(str, uVar);
    }

    @Override // v9.v
    public final void onVerificationCompleted(t tVar) {
        zzafn.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(tVar);
    }

    @Override // v9.v
    public final void onVerificationFailed(h hVar) {
        zzafn.zza.remove(this.zzb);
        this.zza.onVerificationFailed(hVar);
    }
}
