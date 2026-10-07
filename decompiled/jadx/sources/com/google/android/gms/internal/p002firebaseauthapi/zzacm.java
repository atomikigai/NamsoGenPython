package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import v9.e;
import w9.a0;
import w9.d0;
import w9.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzacm extends zzaez {
    private final e zza;

    public zzacm(e eVar) {
        super(2);
        i0.j(eVar, "credential cannot be null");
        this.zza = eVar;
        i0.f(eVar.f9235a, "email cannot be null");
        i0.f(eVar.f9236b, "password cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "linkEmailAuthCredential";
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
        e eVar = this.zza;
        String str = eVar.f9235a;
        String str2 = eVar.f9236b;
        i0.e(str2);
        zzadyVar.zzn(str, str2, ((d0) this.zzh).f9819a.zzh(), this.zzf);
    }
}
