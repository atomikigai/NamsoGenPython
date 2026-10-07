package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import da.v;
import h6.k0;
import h6.r0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcez extends zzcbl {
    private final zzccg zzc;
    private zzcfa zzd;
    private Uri zze;
    private zzcbk zzf;
    private boolean zzg;
    private int zzh;

    public zzcez(Context context, zzccg zzccgVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzccgVar;
        zzccgVar.zza(this);
    }

    private final boolean zzm() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i;
    }

    @Override // android.view.View
    public final String toString() {
        return v.u(zzcez.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzh() {
        return 0L;
    }

    public final /* synthetic */ void zzi() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final String zzj() {
        return "ImmersivePlayer";
    }

    public final /* synthetic */ void zzk() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            if (!this.zzg) {
                zzcbkVar.zzg();
                this.zzg = true;
            }
            this.zzf.zze();
        }
    }

    public final /* synthetic */ void zzl() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl, com.google.android.gms.internal.ads.zzcci
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzo() {
        k0.k("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcey
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzp() {
        k0.k("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcex
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzq(int i) {
        k0.k("AdImmersivePlayerView seek " + i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzr(zzcbk zzcbkVar) {
        this.zzf = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzs(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzcfa(uri.toString());
            zzv(3);
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcew
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzt() {
        k0.k("AdImmersivePlayerView stop");
        zzcfa zzcfaVar = this.zzd;
        if (zzcfaVar != null) {
            zzcfaVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzu(float f10, float f11) {
    }
}
