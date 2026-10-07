package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import w9.k;
import w9.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzacj extends zzaez {
    private final String zza;

    public zzacj(String str) {
        super(1);
        i0.f(str, "refresh token cannot be null");
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzn.zzf())) {
            this.zzn.zzi(this.zza);
        }
        ((w) this.zzi).a(this.zzn, this.zzh);
        zzm(k.a(this.zzn.zze()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzadyVar) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzadyVar.zzj(this.zza, this.zzf);
    }
}
