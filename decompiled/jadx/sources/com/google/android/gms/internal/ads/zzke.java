package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzke {
    public zzlg zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzke(zzlg zzlgVar) {
        this.zza = zzlgVar;
    }

    public final void zza(int i) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(zzlg zzlgVar) {
        this.zze |= this.zza != zzlgVar;
        this.zza = zzlgVar;
    }

    public final void zzc(int i) {
        if (this.zzc && this.zzd != 5) {
            zzdb.zzd(i == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }
}
