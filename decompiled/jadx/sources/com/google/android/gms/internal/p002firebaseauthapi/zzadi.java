package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import w9.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzadi extends zzaez {
    private final boolean zzC;
    private final boolean zzD;
    private final String zzE;
    private final String zzF;
    private final boolean zzG;
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;

    public zzadi(c cVar, String str, String str2, long j4, boolean z4, boolean z10, String str3, String str4, boolean z11) {
        super(8);
        i0.i(cVar);
        i0.e(str);
        String str5 = cVar.f9814a;
        i0.e(str5);
        this.zza = str5;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j4;
        this.zzC = z4;
        this.zzD = z10;
        this.zzE = str3;
        this.zzF = str4;
        this.zzG = z11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzadyVar) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzadyVar.zzB(this.zza, this.zzb, this.zzc, this.zzd, this.zzC, this.zzD, this.zzE, this.zzF, this.zzG, this.zzf);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final void zzb() {
    }
}
