package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhbx extends zzhbw {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhbw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbx.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final String zzb(byte[] bArr, int i, int i10) throws zzgzm {
        int i11;
        int length = bArr.length;
        if ((((length - i) - i10) | i | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i10)));
        }
        int i12 = i + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (i < i12) {
            byte b10 = bArr[i];
            if (!zzhbv.zzd(b10)) {
                break;
            }
            i++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i < i12) {
            int i15 = i + 1;
            byte b11 = bArr[i];
            if (zzhbv.zzd(b11)) {
                cArr[i14] = (char) b11;
                i14++;
                i = i15;
                while (i < i12) {
                    byte b12 = bArr[i];
                    if (!zzhbv.zzd(b12)) {
                        break;
                    }
                    i++;
                    cArr[i14] = (char) b12;
                    i14++;
                }
            } else {
                if (zzhbv.zzf(b11)) {
                    if (i15 >= i12) {
                        throw new zzgzm("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    i += 2;
                    zzhbv.zzc(b11, bArr[i15], cArr, i14);
                } else if (zzhbv.zze(b11)) {
                    if (i15 >= i12 - 1) {
                        throw new zzgzm("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    int i16 = i + 2;
                    i += 3;
                    zzhbv.zzb(b11, bArr[i15], bArr[i16], cArr, i14);
                } else {
                    if (i15 >= i12 - 2) {
                        throw new zzgzm("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i15];
                    int i17 = i + 3;
                    byte b14 = bArr[i + 2];
                    i += 4;
                    zzhbv.zza(b11, b13, b14, bArr[i17], cArr, i14);
                    i14 += 2;
                }
                i14 = i11;
            }
        }
        return new String(cArr, 0, i14);
    }
}
