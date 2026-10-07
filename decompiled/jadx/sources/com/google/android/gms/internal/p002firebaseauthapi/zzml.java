package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzml implements zzcb {
    private static final Object zza = new Object();
    private static final String zzb = "zzml";
    private KeyStore zzc;

    public zzml() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.zzc = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean zzc(String str) throws GeneralSecurityException {
        zzml zzmlVar = new zzml();
        synchronized (zza) {
            try {
                if (zzmlVar.zzd(str)) {
                    return false;
                }
                String strZza = zzzl.zza("android-keystore://", str);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(strZza, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                keyGenerator.generateKey();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final synchronized zzbd zza(String str) throws GeneralSecurityException {
        zzmk zzmkVar;
        zzmkVar = new zzmk(zzzl.zza("android-keystore://", str), this.zzc);
        byte[] bArrZzb = zzor.zzb(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrZzb, zzmkVar.zza(zzmkVar.zzb(bArrZzb, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzmkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final synchronized boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    public final synchronized boolean zzd(String str) throws GeneralSecurityException {
        String strZza;
        strZza = zzzl.zza("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zzc = keyStore;
                keyStore.load(null);
                return this.zzc.containsAlias(strZza);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.zzc.containsAlias(strZza);
    }
}
