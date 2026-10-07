package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhba extends zzgxp {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, f.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgxp zzd;
    private final zzgxp zze;
    private final int zzf;
    private final int zzg;

    public static zzgxp zzC(zzgxp zzgxpVar, zzgxp zzgxpVar2) {
        if (zzgxpVar2.zzd() == 0) {
            return zzgxpVar;
        }
        if (zzgxpVar.zzd() == 0) {
            return zzgxpVar2;
        }
        int iZzd = zzgxpVar2.zzd() + zzgxpVar.zzd();
        if (iZzd < 128) {
            return zzD(zzgxpVar, zzgxpVar2);
        }
        if (zzgxpVar instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) zzgxpVar;
            if (zzgxpVar2.zzd() + zzhbaVar.zze.zzd() < 128) {
                return new zzhba(zzhbaVar.zzd, zzD(zzhbaVar.zze, zzgxpVar2));
            }
            if (zzhbaVar.zzd.zzf() > zzhbaVar.zze.zzf() && zzhbaVar.zzg > zzgxpVar2.zzf()) {
                return new zzhba(zzhbaVar.zzd, new zzhba(zzhbaVar.zze, zzgxpVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzgxpVar.zzf(), zzgxpVar2.zzf()) + 1) ? new zzhba(zzgxpVar, zzgxpVar2) : zzhax.zza(new zzhax(null), zzgxpVar, zzgxpVar2);
    }

    private static zzgxp zzD(zzgxp zzgxpVar, zzgxp zzgxpVar2) {
        int iZzd = zzgxpVar.zzd();
        int iZzd2 = zzgxpVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzgxpVar.zzz(bArr, 0, 0, iZzd);
        zzgxpVar2.zzz(bArr, 0, iZzd, iZzd2);
        return new zzgxm(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        return i >= 47 ? f.API_PRIORITY_OTHER : iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxp)) {
            return false;
        }
        zzgxp zzgxpVar = (zzgxp) obj;
        if (this.zzc != zzgxpVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzgxpVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        zzhaz zzhazVar = null;
        zzhay zzhayVar = new zzhay(this, zzhazVar);
        zzgxl zzgxlVarZza = zzhayVar.next();
        zzhay zzhayVar2 = new zzhay(zzgxpVar, zzhazVar);
        zzgxl zzgxlVarZza2 = zzhayVar2.next();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int iZzd = zzgxlVarZza.zzd() - i;
            int iZzd2 = zzgxlVarZza2.zzd() - i10;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i == 0 ? zzgxlVarZza.zzg(zzgxlVarZza2, i10, iMin) : zzgxlVarZza2.zzg(zzgxlVarZza, i, iMin))) {
                return false;
            }
            i11 += iMin;
            int i12 = this.zzc;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzgxlVarZza = zzhayVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iZzd2) {
                zzgxlVarZza = zzgxlVarZza;
                zzgxlVarZza2 = zzhayVar2.next();
                i10 = 0;
            } else {
                zzgxlVarZza = zzgxlVarZza;
                i10 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxp, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhaw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final byte zza(int i) {
        zzgxp.zzy(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final byte zzb(int i) {
        int i10 = this.zzf;
        return i < i10 ? this.zzd.zzb(i) : this.zze.zzb(i - i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final void zze(byte[] bArr, int i, int i10, int i11) {
        int i12 = i + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            this.zzd.zze(bArr, i, i10, i11);
        } else {
            if (i >= i13) {
                this.zze.zze(bArr, i - i13, i10, i11);
                return;
            }
            int i14 = i13 - i;
            this.zzd.zze(bArr, i, i10, i14);
            this.zze.zze(bArr, 0, i10 + i14, i11 - i14);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzi(int i, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            return this.zzd.zzi(i, i10, i11);
        }
        if (i10 >= i13) {
            return this.zze.zzi(i, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.zze.zzi(this.zzd.zzi(i, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzj(int i, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            return this.zzd.zzj(i, i10, i11);
        }
        if (i10 >= i13) {
            return this.zze.zzj(i, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.zze.zzj(this.zzd.zzj(i, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final zzgxp zzk(int i, int i10) {
        int iZzq = zzgxp.zzq(i, i10, this.zzc);
        if (iZzq == 0) {
            return zzgxp.zzb;
        }
        if (iZzq == this.zzc) {
            return this;
        }
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzk(i, i10);
        }
        if (i >= i11) {
            return this.zze.zzk(i - i11, i10 - i11);
        }
        zzgxp zzgxpVar = this.zzd;
        return new zzhba(zzgxpVar.zzk(i, zzgxpVar.zzd()), this.zze.zzk(0, i10 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgxp
    public final zzgxv zzl() {
        ArrayList arrayList = new ArrayList();
        Object[] objArr = 0;
        zzhay zzhayVar = new zzhay(this, null);
        while (zzhayVar.hasNext()) {
            arrayList.add(zzhayVar.next().zzn());
        }
        int size = arrayList.size();
        int i = 0;
        int iRemaining = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        return i == 2 ? new zzgxr(arrayList, iRemaining, true, objArr == true ? 1 : 0) : zzgxv.zzG(new zzgzn(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final void zzo(zzgxg zzgxgVar) throws IOException {
        this.zzd.zzo(zzgxgVar);
        this.zze.zzo(zzgxgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean zzp() {
        zzgxp zzgxpVar = this.zzd;
        zzgxp zzgxpVar2 = this.zze;
        return zzgxpVar2.zzj(zzgxpVar.zzj(0, 0, this.zzf), 0, zzgxpVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    /* JADX INFO: renamed from: zzs */
    public final zzgxk iterator() {
        return new zzhaw(this);
    }

    private zzhba(zzgxp zzgxpVar, zzgxp zzgxpVar2) {
        this.zzd = zzgxpVar;
        this.zze = zzgxpVar2;
        int iZzd = zzgxpVar.zzd();
        this.zzf = iZzd;
        this.zzc = zzgxpVar2.zzd() + iZzd;
        this.zzg = Math.max(zzgxpVar.zzf(), zzgxpVar2.zzf()) + 1;
    }
}
