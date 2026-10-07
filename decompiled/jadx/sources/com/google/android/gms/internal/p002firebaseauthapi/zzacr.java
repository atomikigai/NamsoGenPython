package com.google.android.gms.internal.p002firebaseauthapi;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import v9.d;
import w9.a0;
import w9.d0;
import w9.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzacr extends zzaez {
    private final zzaic zza;

    public zzacr(d dVar, String str) {
        super(2);
        i0.j(dVar, "credential cannot be null");
        zzaic zzaicVarJ = a.J(dVar, str);
        zzaicVarJ.zzb(false);
        this.zza = zzaicVarJ;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "reauthenticateWithCredentialWithData";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final void zzb() {
        d0 d0VarZzS = zzadv.zzS(this.zzg, this.zzo);
        if (!((d0) this.zzh).f9820b.f9806a.equalsIgnoreCase(d0VarZzS.f9820b.f9806a)) {
            zzl(new Status(17024, null, null, null));
        } else {
            ((w) this.zzi).a(this.zzn, d0VarZzS);
            zzm(new a0(d0VarZzS));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzadyVar) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzadyVar.zzw(this.zza, this.zzf);
    }
}
