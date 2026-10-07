package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalw {
    public CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    public final zzcr zza() {
        Layout.Alignment alignment;
        float f10 = this.zzh;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i = this.zzd;
            if (i != 4) {
                f10 = i != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i10 = this.zzi;
        if (i10 == Integer.MIN_VALUE) {
            int i11 = this.zzd;
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 3) {
                i10 = 2;
            } else if (i11 == 4) {
                i10 = 0;
            } else if (i11 != 5) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        }
        zzcr zzcrVar = new zzcr();
        int i12 = this.zzd;
        if (i12 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i12 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i12 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i12 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i12 != 5) {
            q1.a.o(i12, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        zzcrVar.zzm(alignment);
        float f12 = this.zze;
        int i13 = this.zzf;
        if (f12 != -3.4028235E38f && i13 == 0 && (f12 < 0.0f || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i13 == 0) {
            f11 = 1.0f;
        }
        zzcrVar.zze(f11, i13);
        zzcrVar.zzf(this.zzg);
        zzcrVar.zzh(f10);
        zzcrVar.zzi(i10);
        float f13 = this.zzj;
        if (i10 == 0) {
            f10 = 1.0f - f10;
        } else if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException(String.valueOf(i10));
            }
        } else if (f10 <= 0.5f) {
            f10 += f10;
        } else {
            float f14 = 1.0f - f10;
            f10 = f14 + f14;
        }
        zzcrVar.zzk(Math.min(f13, f10));
        zzcrVar.zzo(this.zzk);
        CharSequence charSequence = this.zzc;
        if (charSequence != null) {
            zzcrVar.zzl(charSequence);
        }
        return zzcrVar;
    }
}
