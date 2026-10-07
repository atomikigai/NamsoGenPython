package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import v9.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaeu implements zzaex {
    final /* synthetic */ Status zza;

    public zzaeu(zzaew zzaewVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zza(v vVar, Object... objArr) {
        vVar.onVerificationFailed(zzadz.zza(this.zza));
    }
}
