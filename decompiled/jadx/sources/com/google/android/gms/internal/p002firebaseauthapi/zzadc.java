package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import w9.a0;
import w9.d0;
import w9.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzadc extends zzaez {
    private final String zza;

    public zzadc(String str) {
        super(2);
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "signInAnonymously";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final void zzb() {
        d0 d0VarZzS = zzadv.zzS(this.zzg, this.zzo);
        ((w) this.zzi).a(this.zzn, d0VarZzS);
        zzm(new a0(d0VarZzS));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzadyVar) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzadyVar.zzv(this.zza, this.zzf);
    }
}
