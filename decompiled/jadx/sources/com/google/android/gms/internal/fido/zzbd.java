package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbd extends zzbe {
    public zzbd(String str, String str2, Character ch) {
        zzbb zzbbVar = new zzbb(str, str2.toCharArray());
        super(zzbbVar, ch);
        zzam.zzc(zzbbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    public final void zza(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        zzam.zze(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & 255;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | (i13 << 16) | (bArr[i11 + 2] & 255);
            appendable.append(this.zzb.zza(i14 >>> 18));
            appendable.append(this.zzb.zza((i14 >>> 12) & 63));
            appendable.append(this.zzb.zza((i14 >>> 6) & 63));
            appendable.append(this.zzb.zza(i14 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zzc(appendable, bArr, i11, i10 - i11);
        }
    }
}
