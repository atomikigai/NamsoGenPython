package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import da.v;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmh {
    private Context zza = null;
    private String zzb = null;
    private String zzc = null;
    private String zzd = null;
    private zzbd zze = null;
    private zzbv zzf = null;
    private zzwn zzg = null;
    private zzbz zzh;

    private final zzbd zzj() throws GeneralSecurityException {
        if (!zzmj.zzd()) {
            Log.w(zzmj.zzb, "Android Keystore requires at least Android M");
            return null;
        }
        zzml zzmlVar = new zzml();
        try {
            boolean zZzc = zzml.zzc(this.zzd);
            try {
                return zzmlVar.zza(this.zzd);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zZzc) {
                    throw new KeyStoreException(v.i("the master key ", this.zzd, " exists but is unusable"), e);
                }
                Log.w(zzmj.zzb, "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e4) {
            Log.w(zzmj.zzb, "cannot use Android Keystore, it'll be disabled", e4);
            return null;
        }
    }

    private final zzbz zzk(byte[] bArr) throws GeneralSecurityException, IOException {
        try {
            this.zze = new zzml().zza(this.zzd);
            try {
                return zzbz.zzf(zzby.zzh(zzbe.zzc(bArr), this.zze));
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return zzl(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e4) {
            try {
                zzbz zzbzVarZzl = zzl(bArr);
                Log.w(zzmj.zzb, "cannot use Android Keystore, it'll be disabled", e4);
                return zzbzVarZzl;
            } catch (IOException unused2) {
                throw e4;
            }
        }
    }

    private static final zzbz zzl(byte[] bArr) throws GeneralSecurityException, IOException {
        return zzbz.zzf(zzbg.zzb(zzbe.zzc(bArr)));
    }

    public final zzmh zzd(zzwn zzwnVar) {
        this.zzg = zzwnVar;
        return this;
    }

    public final zzmh zze(String str) {
        if (!str.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        this.zzd = str;
        return this;
    }

    public final zzmh zzf(Context context, String str, String str2) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.zza = context;
        this.zzb = "GenericIdpKeyset";
        this.zzc = str2;
        return this;
    }

    public final synchronized zzmj zzg() throws GeneralSecurityException, IOException {
        byte[] bArr;
        zzmj zzmjVar;
        try {
            if (this.zzb == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            zzwn zzwnVar = this.zzg;
            if (zzwnVar != null && this.zzf == null) {
                this.zzf = zzbv.zza(zzcs.zza(zzwnVar.zzq()));
            }
            synchronized (zzmj.zza) {
                try {
                    Context context = this.zza;
                    String str = this.zzb;
                    String str2 = this.zzc;
                    if (str == null) {
                        throw new IllegalArgumentException("keysetName cannot be null");
                    }
                    Context applicationContext = context.getApplicationContext();
                    SharedPreferences defaultSharedPreferences = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
                    zzmi zzmiVar = null;
                    try {
                        String string = defaultSharedPreferences.getString(str, null);
                        if (string == null) {
                            bArr = null;
                        } else {
                            if (string.length() % 2 != 0) {
                                throw new IllegalArgumentException("Expected a string of even length");
                            }
                            int length = string.length() / 2;
                            bArr = new byte[length];
                            for (int i = 0; i < length; i++) {
                                int i10 = i + i;
                                int iDigit = Character.digit(string.charAt(i10), 16);
                                int iDigit2 = Character.digit(string.charAt(i10 + 1), 16);
                                if (iDigit == -1 || iDigit2 == -1) {
                                    throw new IllegalArgumentException("input is not hexadecimal");
                                }
                                bArr[i] = (byte) ((iDigit * 16) + iDigit2);
                            }
                        }
                        if (bArr == null) {
                            if (this.zzd != null) {
                                this.zze = zzj();
                            }
                            if (this.zzf == null) {
                                throw new GeneralSecurityException("cannot read or generate keyset");
                            }
                            zzbz zzbzVarZze = zzbz.zze();
                            zzbzVarZze.zzc(this.zzf);
                            zzbzVarZze.zzd(zzbzVarZze.zzb().zzd().zzb(0).zza());
                            zzmm zzmmVar = new zzmm(this.zza, this.zzb, this.zzc);
                            zzby zzbyVarZzb = zzbzVarZze.zzb();
                            zzbd zzbdVar = this.zze;
                            try {
                                if (zzbdVar != null) {
                                    zzbyVarZzb.zzf(zzmmVar, zzbdVar);
                                } else {
                                    zzbg.zza(zzbyVarZzb, zzmmVar);
                                }
                                this.zzh = zzbzVarZze;
                            } catch (IOException e) {
                                throw new GeneralSecurityException(e);
                            }
                        } else if (this.zzd == null || !zzmj.zzd()) {
                            this.zzh = zzl(bArr);
                        } else {
                            this.zzh = zzk(bArr);
                        }
                        zzmjVar = new zzmj(this, zzmiVar);
                    } catch (ClassCastException | IllegalArgumentException unused) {
                        throw new CharConversionException("can't read keyset; the pref value " + str + " is not a valid hex string");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzmjVar;
    }
}
