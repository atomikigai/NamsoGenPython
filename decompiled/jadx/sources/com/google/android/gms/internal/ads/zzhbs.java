package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhbs extends zzhbt {
    public zzhbs(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final byte zza(long j4) {
        return Memory.peekByte(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final double zzb(Object obj, long j4) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final float zzc(Object obj, long j4) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzd(long j4, byte[] bArr, long j10, long j11) {
        Memory.peekByteArray(j4, bArr, (int) j10, (int) j11);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhbu.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhbu.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.ads.zzhbu.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.ads.zzhbu.zzl(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zze(Object obj, long j4, boolean z4) {
        if (zzhbu.zzb) {
            zzhbu.zzk(obj, j4, z4);
        } else {
            zzhbu.zzl(obj, j4, z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzf(Object obj, long j4, byte b10) {
        if (zzhbu.zzb) {
            zzhbu.zzG(obj, j4, b10);
        } else {
            zzhbu.zzH(obj, j4, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzg(Object obj, long j4, double d10) {
        this.zza.putLong(obj, j4, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzh(Object obj, long j4, float f10) {
        this.zza.putInt(obj, j4, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final boolean zzi(Object obj, long j4) {
        return zzhbu.zzb ? zzhbu.zzw(obj, j4) : zzhbu.zzx(obj, j4);
    }
}
