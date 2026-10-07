package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazw extends zzazn {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzazw(int i) {
        int i10 = i >> 3;
        this.zzc = (i & 7) > 0 ? i10 + 1 : i10;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzazn
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZza = zza();
                this.zzb = messageDigestZza;
                if (messageDigestZza == null) {
                    return new byte[0];
                }
                messageDigestZza.reset();
                this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i = this.zzc;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.zzd & 7) > 0) {
                    long j4 = 0;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 > 0) {
                            j4 <<= 8;
                        }
                        j4 += (long) (bArr[i10] & 255);
                    }
                    long j10 = j4 >>> (8 - (this.zzd & 7));
                    int i11 = this.zzc;
                    while (true) {
                        i11--;
                        if (i11 < 0) {
                            break;
                        }
                        bArr[i11] = (byte) (255 & j10);
                        j10 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
