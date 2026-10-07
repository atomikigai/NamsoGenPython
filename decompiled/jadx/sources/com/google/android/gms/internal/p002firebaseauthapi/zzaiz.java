package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaiz extends zzajc {
    private final int zzc;

    public zzaiz(byte[] bArr, int i, int i10) {
        super(bArr);
        zzajf.zzl(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc, com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final byte zza(int i) {
        int i10 = this.zzc;
        if (((i10 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(v.f(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.i(i, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc, com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc, com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc, com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final void zze(byte[] bArr, int i, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }
}
