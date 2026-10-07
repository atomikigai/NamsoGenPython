package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwx;
import com.google.android.gms.internal.ads.zzgwy;
import da.v;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgwy<MessageType extends zzgwy<MessageType, BuilderType>, BuilderType extends zzgwx<MessageType, BuilderType>> implements zzhai {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgwx.zzbd(iterable, list);
    }

    public static void zzaR(zzgxp zzgxpVar) throws IllegalArgumentException {
        if (!zzgxpVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        return v.k("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzhbb zzhbbVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzhai
    public zzgxp zzaN() {
        try {
            int iZzaY = zzaY();
            zzgxp zzgxpVar = zzgxp.zzb;
            byte[] bArr = new byte[iZzaY];
            zzgxy zzgxyVar = new zzgxy(bArr, 0, iZzaY);
            zzda(zzgxyVar);
            zzgxyVar.zzF();
            return new zzgxm(bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdI("ByteString"), e);
        }
    }

    public zzhan zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhbm zzaP() {
        return new zzhbm(this);
    }

    public void zzaS(int i) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int iZzaY = zzaY();
        zzgya zzgyaVar = new zzgya(outputStream, zzgyc.zzB(zzgyc.zzD(iZzaY) + iZzaY));
        zzgyaVar.zzu(iZzaY);
        zzda(zzgyaVar);
        zzgyaVar.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgya zzgyaVar = new zzgya(outputStream, zzgyc.zzB(zzaY()));
        zzda(zzgyaVar);
        zzgyaVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            zzgxy zzgxyVar = new zzgxy(bArr, 0, iZzaY);
            zzda(zzgxyVar);
            zzgxyVar.zzF();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdI("byte array"), e);
        }
    }
}
