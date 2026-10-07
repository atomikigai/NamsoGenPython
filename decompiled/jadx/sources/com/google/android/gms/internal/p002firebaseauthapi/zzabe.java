package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzabe implements zzafe {
    final /* synthetic */ zzahr zza;
    final /* synthetic */ zzadx zzb;

    public zzabe(zzabz zzabzVar, zzahr zzahrVar, zzadx zzadxVar) {
        this.zza = zzahrVar;
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzb.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzahr zzahrVar = this.zza;
        zzahs zzahsVar = (zzahs) obj;
        if (zzahrVar instanceof zzahv) {
            this.zzb.zzb(zzahsVar.zzc());
        } else {
            if (!(zzahrVar instanceof zzahx)) {
                throw new IllegalArgumentException(v.i("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", zzahrVar.getClass().getName(), "."));
            }
            this.zzb.zzp(zzahsVar);
        }
    }
}
