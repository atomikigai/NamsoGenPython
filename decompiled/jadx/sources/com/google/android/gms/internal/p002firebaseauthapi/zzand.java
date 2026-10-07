package com.google.android.gms.internal.p002firebaseauthapi;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzand extends zzane {
    public zzand(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final double zza(Object obj, long j4) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final float zzb(Object obj, long j4) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j4));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.firebase-auth-api.zzanf.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.firebase-auth-api.zzanf.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z4' boolean)' in method call: com.google.android.gms.internal.firebase-auth-api.zzanf.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z4' boolean)' in method call: com.google.android.gms.internal.firebase-auth-api.zzanf.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final void zzc(Object obj, long j4, boolean z4) {
        if (zzanf.zzb) {
            zzanf.zzi(obj, j4, z4);
        } else {
            zzanf.zzj(obj, j4, z4);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final void zzd(Object obj, long j4, byte b10) {
        if (zzanf.zzb) {
            zzanf.zzD(obj, j4, b10);
        } else {
            zzanf.zzE(obj, j4, b10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final void zze(Object obj, long j4, double d10) {
        this.zza.putLong(obj, j4, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final void zzf(Object obj, long j4, float f10) {
        this.zza.putInt(obj, j4, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final boolean zzg(Object obj, long j4) {
        return zzanf.zzb ? zzanf.zzt(obj, j4) : zzanf.zzu(obj, j4);
    }
}
