package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzack extends zzaez {
    private final zzzt zza;

    public zzack() {
        super(11);
        this.zza = new zzzt();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "getRecaptchaParam";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final void zzb() {
        zzm(this.zzy);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzadyVar) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzadyVar.zzk(this.zza, this.zzf);
    }
}
