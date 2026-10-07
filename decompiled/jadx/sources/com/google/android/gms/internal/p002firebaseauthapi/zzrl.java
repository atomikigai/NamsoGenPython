package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrl implements zzcd {
    private static final byte[] zza = {0};
    private final zzcd zzb;
    private final zzxo zzc;
    private final byte[] zzd;

    private zzrl(zzcd zzcdVar, zzxo zzxoVar, byte[] bArr) {
        this.zzb = zzcdVar;
        this.zzc = zzxoVar;
        this.zzd = bArr;
    }

    public static zzcd zzb(zzni zzniVar) throws GeneralSecurityException {
        byte[] bArrArray;
        zzoo zzooVarZza = zzniVar.zza(zzbm.zza());
        zzwf zzwfVarZza = zzwi.zza();
        zzwfVarZza.zzb(zzooVarZza.zzg());
        zzwfVarZza.zzc(zzooVarZza.zze());
        zzwfVarZza.zza(zzooVarZza.zzb());
        zzcd zzcdVar = (zzcd) zzcq.zzd((zzwi) zzwfVarZza.zzi(), zzcd.class);
        zzxo zzxoVarZzc = zzooVarZza.zzc();
        zzxo zzxoVar = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzniVar.zzb().intValue()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzniVar.zzb().intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzniVar.zzb().intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new zzrl(zzcdVar, zzxoVarZzc, bArrArray);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzxo.LEGACY)) {
            bArr2 = zzyf.zzb(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzxo.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }
}
