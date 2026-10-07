package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import da.v;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgxp implements Iterable<Byte>, Serializable {
    public static final zzgxp zzb = new zzgxm(zzgzk.zzb);
    private int zza = 0;

    static {
        int i = zzgxc.zza;
    }

    private static zzgxp zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(q1.a.j(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (zzgxp) it.next();
        }
        int i10 = i >>> 1;
        zzgxp zzgxpVarZzc = zzc(it, i10);
        zzgxp zzgxpVarZzc2 = zzc(it, i - i10);
        if (f.API_PRIORITY_OTHER - zzgxpVarZzc.zzd() >= zzgxpVarZzc2.zzd()) {
            return zzhba.zzC(zzgxpVarZzc, zzgxpVarZzc2);
        }
        throw new IllegalArgumentException(q1.a.i(zzgxpVarZzc.zzd(), zzgxpVarZzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    public static int zzq(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(q1.a.j(i, "Beginning index: ", " < 0"));
        }
        if (i10 < i) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(q1.a.i(i10, i11, "End index: ", " >= "));
    }

    public static zzgxn zzt() {
        return new zzgxn(128);
    }

    public static zzgxp zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgxp zzv(byte[] bArr, int i, int i10) {
        zzq(i, i + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new zzgxm(bArr2);
    }

    public static zzgxp zzw(String str) {
        return new zzgxm(str.getBytes(zzgzk.zza));
    }

    public static void zzy(int i, int i10) {
        if (((i10 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(q1.a.i(i, i10, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(v.f(i, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzd = zzd();
        String strZza = zzd() <= 50 ? zzhbl.zza(this) : zzhbl.zza(zzk(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iZzd);
        sb2.append(" contents=\"");
        return q1.a.m(sb2, strZza, "\">");
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgzk.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i10, int i11);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i10, int i11);

    public abstract int zzj(int i, int i10, int i11);

    public abstract zzgxp zzk(int i, int i10);

    public abstract zzgxv zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgxg zzgxgVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgxk iterator() {
        return new zzgxh(this);
    }

    public final String zzx() {
        return zzd() == 0 ? "" : zzm(zzgzk.zza);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i10, int i11) {
        zzq(0, i11, zzd());
        zzq(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            zze(bArr, 0, i10, i11);
        }
    }
}
