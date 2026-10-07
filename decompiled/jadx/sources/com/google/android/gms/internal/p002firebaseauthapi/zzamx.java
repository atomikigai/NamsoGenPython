package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzamx extends zzamv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ int zza(Object obj) {
        return ((zzamw) obj).zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzamw) obj).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzakk zzakkVar = (zzakk) obj;
        zzamw zzamwVar = zzakkVar.zzc;
        if (zzamwVar != zzamw.zzc()) {
            return zzamwVar;
        }
        zzamw zzamwVarZzf = zzamw.zzf();
        zzakkVar.zzc = zzamwVarZzf;
        return zzamwVarZzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzakk) obj).zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzamw.zzc().equals(obj2)) {
            if (zzamw.zzc().equals(obj)) {
                return zzamw.zze((zzamw) obj, (zzamw) obj2);
            }
            ((zzamw) obj).zzd((zzamw) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ Object zzf() {
        return zzamw.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzamw) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i10) {
        ((zzamw) obj).zzj((i << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j4) {
        ((zzamw) obj).zzj((i << 3) | 1, Long.valueOf(j4));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzamw) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzajf zzajfVar) {
        ((zzamw) obj).zzj((i << 3) | 2, zzajfVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j4) {
        ((zzamw) obj).zzj(i << 3, Long.valueOf(j4));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zzm(Object obj) {
        ((zzakk) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzakk) obj).zzc = (zzamw) obj2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzakk) obj).zzc = (zzamw) obj2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final boolean zzq(zzama zzamaVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final /* synthetic */ void zzr(Object obj, zzajt zzajtVar) throws IOException {
        ((zzamw) obj).zzk(zzajtVar);
    }
}
