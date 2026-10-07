package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzakv {
    private final zzed zza = new zzed();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public static /* bridge */ /* synthetic */ void zzb(zzakv zzakvVar, zzed zzedVar, int i) {
        int iZzo;
        if (i < 4) {
            return;
        }
        zzedVar.zzM(3);
        int i10 = i - 4;
        if ((zzedVar.zzm() & 128) != 0) {
            if (i10 < 7 || (iZzo = zzedVar.zzo()) < 4) {
                return;
            }
            zzakvVar.zzh = zzedVar.zzq();
            zzakvVar.zzi = zzedVar.zzq();
            zzakvVar.zza.zzI(iZzo - 4);
            i10 = i - 11;
        }
        zzed zzedVar2 = zzakvVar.zza;
        int iZzd = zzedVar2.zzd();
        int iZze = zzedVar2.zze();
        if (iZzd >= iZze || i10 <= 0) {
            return;
        }
        int iMin = Math.min(i10, iZze - iZzd);
        zzedVar.zzH(zzedVar2.zzN(), iZzd, iMin);
        zzakvVar.zza.zzL(iZzd + iMin);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzakv zzakvVar, zzed zzedVar, int i) {
        if (i < 19) {
            return;
        }
        zzakvVar.zzd = zzedVar.zzq();
        zzakvVar.zze = zzedVar.zzq();
        zzedVar.zzM(11);
        zzakvVar.zzf = zzedVar.zzq();
        zzakvVar.zzg = zzedVar.zzq();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzakv zzakvVar, zzed zzedVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzedVar.zzM(2);
        int i10 = 0;
        Arrays.fill(zzakvVar.zzb, 0);
        int i11 = i / 5;
        int i12 = 0;
        while (i12 < i11) {
            int iZzm = zzedVar.zzm();
            int iZzm2 = zzedVar.zzm();
            int iZzm3 = zzedVar.zzm();
            int iZzm4 = zzedVar.zzm();
            int iZzm5 = zzedVar.zzm();
            double d10 = iZzm2;
            int[] iArr = zzakvVar.zzb;
            double d11 = iZzm3 - 128;
            int iMax = Math.max(i10, Math.min((int) ((1.402d * d11) + d10), 255)) << 16;
            double d12 = iZzm4 - 128;
            iArr[iZzm] = Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)) | (iZzm5 << 24) | iMax | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8);
            i12++;
            i10 = 0;
        }
        zzakvVar.zzc = true;
    }

    public final zzct zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzed zzedVar = this.zza;
        if (zzedVar.zze() == 0 || zzedVar.zzd() != zzedVar.zze() || !this.zzc) {
            return null;
        }
        zzedVar.zzL(0);
        int i10 = this.zzh * this.zzi;
        int[] iArr = new int[i10];
        int i11 = 0;
        while (i11 < i10) {
            int iZzm = this.zza.zzm();
            if (iZzm != 0) {
                i = i11 + 1;
                iArr[i11] = this.zzb[iZzm];
            } else {
                int iZzm2 = this.zza.zzm();
                if (iZzm2 != 0) {
                    int iZzm3 = iZzm2 & 63;
                    if ((iZzm2 & 64) != 0) {
                        iZzm3 = (iZzm3 << 8) | this.zza.zzm();
                    }
                    i = iZzm3 + i11;
                    Arrays.fill(iArr, i11, i, (iZzm2 & 128) == 0 ? this.zzb[0] : this.zzb[this.zza.zzm()]);
                }
            }
            i11 = i;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcr zzcrVar = new zzcr();
        zzcrVar.zzc(bitmapCreateBitmap);
        zzcrVar.zzh(this.zzf / this.zzd);
        zzcrVar.zzi(0);
        zzcrVar.zze(this.zzg / this.zze, 0);
        zzcrVar.zzf(0);
        zzcrVar.zzk(this.zzh / this.zzd);
        zzcrVar.zzd(this.zzi / this.zze);
        return zzcrVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
