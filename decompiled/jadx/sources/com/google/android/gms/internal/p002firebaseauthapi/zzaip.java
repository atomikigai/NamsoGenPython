package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaio;
import com.google.android.gms.internal.p002firebaseauthapi.zzaip;
import da.v;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaip<MessageType extends zzaip<MessageType, BuilderType>, BuilderType extends zzaio<MessageType, BuilderType>> implements zzalp {
    protected int zza = 0;

    public int zzn(zzamb zzambVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final zzajf zzo() {
        try {
            int iZzs = zzs();
            zzajf zzajfVar = zzajf.zzb;
            byte[] bArr = new byte[iZzs];
            zzajs zzajsVarZzC = zzajs.zzC(bArr, 0, iZzs);
            zzJ(zzajsVarZzC);
            zzajsVarZzC.zzD();
            return new zzajc(bArr);
        } catch (IOException e) {
            throw new RuntimeException(v.i("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final void zzp(OutputStream outputStream) throws IOException {
        int iZzs = zzs();
        int i = zzajs.zzf;
        if (iZzs > 4096) {
            iZzs = 4096;
        }
        zzajq zzajqVar = new zzajq(outputStream, iZzs);
        zzJ(zzajqVar);
        zzajqVar.zzI();
    }

    public final byte[] zzq() {
        try {
            int iZzs = zzs();
            byte[] bArr = new byte[iZzs];
            zzajs zzajsVarZzC = zzajs.zzC(bArr, 0, iZzs);
            zzJ(zzajsVarZzC);
            zzajsVarZzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(v.i("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
