package com.google.android.gms.internal.ads;

import android.util.Base64;
import d6.p;
import h6.k0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfgd {
    public zzfgd() {
        try {
            zzggr.zza();
        } catch (GeneralSecurityException e) {
            k0.k("Failed to Configure Aead. ".concat(e.toString()));
            p.C.f2982g.zzw(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzggf zzggfVarZzb = zzggf.zzb(zzgfz.zza(zzgnv.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgfp.zzb(zzggfVarZzb, zzgfo.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e) {
            k0.k("Failed to generate key".concat(e.toString()));
            p.C.f2982g.zzw(e, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdsh zzdshVar) {
        zzggf zzggfVarZzc = zzc(str);
        if (zzggfVarZzc != null) {
            try {
                byte[] bArrZza = ((zzgfm) zzggfVarZzc.zzd(zzgpa.zzd(), zzgfm.class)).zza(bArr, bArr2);
                zzdshVar.zzb().put("ds", "1");
                return new String(bArrZza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
                k0.k("Failed to decrypt ".concat(e.toString()));
                p.C.f2982g.zzw(e, "CryptoUtils.decrypt");
                zzdshVar.zzb().put("dsf", e.toString());
            }
        }
        return null;
    }

    private static final zzggf zzc(String str) {
        try {
            try {
                return zzgfp.zza(zzgfn.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            k0.k("Failed to get keysethandle".concat(e.toString()));
            p.C.f2982g.zzw(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
