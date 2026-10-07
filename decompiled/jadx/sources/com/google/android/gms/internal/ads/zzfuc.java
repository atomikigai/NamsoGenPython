package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfuc extends zzfvf {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfuc(IBinder iBinder, String str, int i, float f10, int i10, int i11, String str2, int i12, String str3, String str4, String str5, zzfub zzfubVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f10;
        this.zze = i12;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvf) {
            zzfvf zzfvfVar = (zzfvf) obj;
            if (this.zza.equals(zzfvfVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfvfVar.zzh()) : zzfvfVar.zzh() == null) && this.zzc == zzfvfVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfvfVar.zza())) {
                zzfvfVar.zzb();
                zzfvfVar.zzd();
                zzfvfVar.zzj();
                if (this.zze == zzfvfVar.zze()) {
                    zzfvfVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfvfVar.zzg()) : zzfvfVar.zzg() == null) {
                        zzfvfVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        StringBuilder sbN = q1.a.n("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", appId=");
        sbN.append(this.zzb);
        sbN.append(", layoutGravity=");
        sbN.append(this.zzc);
        sbN.append(", layoutVerticalMargin=");
        sbN.append(this.zzd);
        sbN.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sbN.append(this.zze);
        sbN.append(", deeplinkUrl=null, adFieldEnifd=");
        return q1.a.m(sbN, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final String zzk() {
        return null;
    }
}
