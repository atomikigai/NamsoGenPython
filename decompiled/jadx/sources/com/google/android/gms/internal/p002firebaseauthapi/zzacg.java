package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import w9.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzacg extends zzaez {
    private final String zza;
    private final String zzb;

    public zzacg(String str, String str2) {
        super(3);
        i0.f(str, "email cannot be null or empty");
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final void zzb() {
        List listZzb;
        if (this.zzp.zzb() == null) {
            listZzb = zzam.zzi();
        } else {
            listZzb = this.zzp.zzb();
            i0.i(listZzb);
        }
        zzm(new d(listZzb));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzadyVar) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzadyVar.zzl(this.zza, this.zzb, this.zzf);
    }
}
