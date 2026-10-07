package com.google.android.gms.internal.ads;

import d6.p;
import h6.n0;
import i6.h;
import java.util.ArrayList;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazb {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzazq zze;
    private final zzazy zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzazb(int i, int i10, int i11, int i12, int i13, int i14, int i15, boolean z4) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z4;
        this.zze = new zzazq(i12);
        this.zzf = new zzazy(i13, i14, i15);
    }

    private final void zzm(String str, boolean z4, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z4) {
                        this.zzi.add(str);
                        this.zzj.add(new zzazm(f10, f11, f12, f13, this.zzi.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sb2.append((String) arrayList.get(i10));
            sb2.append(' ');
            i10++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzazb) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i = this.zzl;
        int i10 = this.zzn;
        int i11 = this.zzk;
        String strZzn = zzn(arrayList, 100);
        String strZzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder sbD = b.d(i, i10, "ActivityContent fetchId: ", " score:", " total_length:");
        sbD.append(i11);
        sbD.append("\n text: ");
        sbD.append(strZzn);
        sbD.append("\n viewableText");
        sbD.append(strZzn2);
        sbD.append("\n signture: ");
        sbD.append(str);
        sbD.append("\n viewableSignture: ");
        sbD.append(str2);
        sbD.append("\n viewableSignatureForVertical: ");
        sbD.append(str3);
        return sbD.toString();
    }

    public final int zza(int i, int i10) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i10 * this.zzb) + (i * this.zza);
    }

    public final int zzb() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzo;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzg(int i) {
        this.zzl = i;
    }

    public final void zzh(String str, boolean z4, float f10, float f11, float f12, float f13) {
        zzm(str, z4, f10, f11, f12, f13);
    }

    public final void zzi(String str, boolean z4, float f10, float f11, float f12, float f13) {
        zzm(str, z4, f10, f11, f12, f13);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    h.b("ActivityContent: negative number of WebViews.");
                }
                zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzg) {
            try {
                int iZza = zza(this.zzk, this.zzl);
                if (iZza > this.zzn) {
                    this.zzn = iZza;
                    p pVar = p.C;
                    if (!((n0) pVar.f2982g.zzi()).i()) {
                        this.zzo = this.zze.zza(this.zzh);
                        this.zzp = this.zze.zza(this.zzi);
                    }
                    if (!((n0) pVar.f2982g.zzi()).j()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzk() {
        synchronized (this.zzg) {
            try {
                int iZza = zza(this.zzk, this.zzl);
                if (iZza > this.zzn) {
                    this.zzn = iZza;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzl() {
        boolean z4;
        synchronized (this.zzg) {
            z4 = this.zzm == 0;
        }
        return z4;
    }
}
