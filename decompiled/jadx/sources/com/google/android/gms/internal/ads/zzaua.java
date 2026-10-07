package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaua {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static zzato zza(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector vectorZzc = zzc(bArr, 255);
        if (vectorZzc == null || vectorZzc.isEmpty()) {
            return null;
        }
        zzato zzatoVarZza = zzatp.zza();
        int size = vectorZzc.size();
        for (int i = 0; i < size; i++) {
            zzatoVarZza.zza(zzgxp.zzv(zzh((byte[]) vectorZzc.get(i), str, false), 0, 256));
        }
        byte[] bArrZzf = zzf(bArr);
        zzgxp zzgxpVar = zzgxp.zzb;
        zzatoVarZza.zzb(zzgxp.zzv(bArrZzf, 0, bArrZzf.length));
        return zzatoVarZza;
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        zzato zzatoVarZza = zza(bArr, str);
        return zzatt.zza(zzatoVarZza == null ? zzh(zzg(4096).zzaV(), str, true) : ((zzatp) zzatoVarZza.zzbr()).zzaV(), true);
    }

    public static Vector zzc(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i10 = length + 254;
        Vector vector = new Vector();
        for (int i11 = 0; i11 < i10 / 255; i11++) {
            int i12 = i11 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i12 > 255) {
                    length2 = i12 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i12, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zze() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzaty(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] zzf(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zze();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrDigest;
    }

    public static zzata zzg(int i) {
        zzasf zzasfVarZza = zzata.zza();
        zzasfVarZza.zzD(4096L);
        return (zzata) zzasfVarZza.zzbr();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z4) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z4 ? 255 : 239;
        if (length > i) {
            bArr = zzg(4096).zzaV();
        }
        int i10 = i + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i10).put(b10).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i10).put(b10).put(bArr).array();
        }
        if (z4) {
            bArrArray = ByteBuffer.allocate(256).put(zzf(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzaub[] zzaubVarArr = new zzaup().zzcG;
        int length3 = zzaubVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            zzaubVarArr[i11].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzatr(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
