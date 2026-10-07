package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import v9.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzacz extends zzaez {
    private final zzzw zza;

    public zzacz(String str, b bVar) {
        super(6);
        i0.f(str, "token cannot be null or empty");
        this.zza = new zzzw(str, bVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final void zzb() {
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzadyVar) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzadyVar.zzr(this.zza, this.zzf);
    }
}
