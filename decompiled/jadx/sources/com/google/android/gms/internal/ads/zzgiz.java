package com.google.android.gms.internal.ads;

import da.v;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgiz implements zzgfm {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzgfm zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzgiz(zzgue zzgueVar, zzgfm zzgfmVar) throws GeneralSecurityException {
        if (!zzc.contains(zzgueVar.zzi())) {
            throw new IllegalArgumentException(v.i("Unsupported DEK key type: ", zzgueVar.zzi(), ". Only Tink AEAD key types are supported."));
        }
        this.zzd = zzgueVar.zzi();
        zzguc zzgucVarZzb = zzgue.zzb(zzgueVar);
        zzgucVarZzb.zza(zzgve.RAW);
        zzggp.zza(((zzgue) zzgucVarZzb.zzbr()).zzaV());
        this.zze = zzgfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zze.zza(bArr3, zzb);
            String str = this.zzd;
            zzgxp zzgxpVar = zzgxp.zzb;
            return ((zzgfm) zzgnw.zza().zzc(zzgnz.zzc().zza(zzgow.zza(str, zzgxp.zzv(bArrZza, 0, bArrZza.length), zzgty.SYMMETRIC, zzgve.RAW, null), zzgfv.zza()), zzgfm.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
