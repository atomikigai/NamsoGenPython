package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.i2;
import e6.l2;
import e6.l3;
import e6.t;
import i6.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcgm extends i2 {
    private final zzccf zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private l2 zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbhg zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcgm(zzccf zzccfVar, float f10, boolean z4, boolean z10) {
        this.zza = zzccfVar;
        this.zzi = f10;
        this.zzc = z4;
        this.zzd = z10;
    }

    private final void zzw(final int i, final int i10, final boolean z4, final boolean z10) {
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(i, i10, z4, z10);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr(map2);
            }
        });
    }

    public final void zzc(float f10, float f11, int i, boolean z4, float f12) {
        boolean z10;
        boolean z11;
        int i10;
        synchronized (this.zzb) {
            try {
                z10 = true;
                if (f11 == this.zzi && f12 == this.zzk) {
                    z10 = false;
                }
                this.zzi = f11;
                if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmw)).booleanValue()) {
                    this.zzj = f10;
                }
                z11 = this.zzh;
                this.zzh = z4;
                i10 = this.zze;
                this.zze = i;
                float f13 = this.zzk;
                this.zzk = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.zza.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            try {
                zzbhg zzbhgVar = this.zzn;
                if (zzbhgVar != null) {
                    zzbhgVar.zze();
                }
            } catch (RemoteException e) {
                h.i("#007 Could not call remote method.", e);
            }
        }
        zzw(i10, i, z11, z4);
    }

    public final /* synthetic */ void zzd(int i, int i10, boolean z4, boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        l2 l2Var;
        l2 l2Var2;
        l2 l2Var3;
        synchronized (this.zzb) {
            try {
                boolean z13 = this.zzg;
                if (z13 || i10 != 1) {
                    i11 = i10;
                    z11 = false;
                } else {
                    i10 = 1;
                    i11 = 1;
                    z11 = true;
                }
                boolean z14 = i != i10;
                if (z14 && i11 == 1) {
                    z12 = true;
                    i11 = 1;
                } else {
                    z12 = false;
                }
                boolean z15 = z14 && i11 == 2;
                boolean z16 = z14 && i11 == 3;
                this.zzg = z13 || z11;
                if (z11) {
                    try {
                        l2 l2Var4 = this.zzf;
                        if (l2Var4 != null) {
                            l2Var4.zzi();
                        }
                    } catch (RemoteException e) {
                        h.i("#007 Could not call remote method.", e);
                    }
                }
                if (z12 && (l2Var3 = this.zzf) != null) {
                    l2Var3.zzh();
                }
                if (z15 && (l2Var2 = this.zzf) != null) {
                    l2Var2.zzg();
                }
                if (z16) {
                    l2 l2Var5 = this.zzf;
                    if (l2Var5 != null) {
                        l2Var5.zze();
                    }
                    this.zza.zzw();
                }
                if (z4 != z10 && (l2Var = this.zzf) != null) {
                    l2Var.C(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e6.j2
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // e6.j2
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // e6.j2
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // e6.j2
    public final int zzh() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // e6.j2
    public final l2 zzi() throws RemoteException {
        l2 l2Var;
        synchronized (this.zzb) {
            l2Var = this.zzf;
        }
        return l2Var;
    }

    @Override // e6.j2
    public final void zzj(boolean z4) {
        zzx(true != z4 ? "unmute" : "mute", null);
    }

    @Override // e6.j2
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // e6.j2
    public final void zzl() {
        zzx("play", null);
    }

    @Override // e6.j2
    public final void zzm(l2 l2Var) {
        synchronized (this.zzb) {
            this.zzf = l2Var;
        }
    }

    @Override // e6.j2
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // e6.j2
    public final boolean zzo() {
        boolean z4;
        Object obj = this.zzb;
        boolean zZzp = zzp();
        synchronized (obj) {
            z4 = false;
            if (!zZzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z4 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z4;
    }

    @Override // e6.j2
    public final boolean zzp() {
        boolean z4;
        synchronized (this.zzb) {
            try {
                z4 = false;
                if (this.zzc && this.zzl) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // e6.j2
    public final boolean zzq() {
        boolean z4;
        synchronized (this.zzb) {
            z4 = this.zzh;
        }
        return z4;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(l3 l3Var) {
        Object obj = this.zzb;
        boolean z4 = l3Var.f3340a;
        boolean z10 = l3Var.f3341b;
        boolean z11 = l3Var.f3342c;
        synchronized (obj) {
            this.zzl = z10;
            this.zzm = z11;
        }
        String str = true != z4 ? "0" : "1";
        String str2 = true != z10 ? "0" : "1";
        String str3 = true != z11 ? "0" : "1";
        e eVar = new e(3);
        eVar.put("muteStart", str);
        eVar.put("customControlsRequested", str2);
        eVar.put("clickToExpandRequested", str3);
        zzx("initialState", Collections.unmodifiableMap(eVar));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z4;
        int i;
        synchronized (this.zzb) {
            z4 = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzw(i, 3, z4, z4);
    }

    public final void zzv(zzbhg zzbhgVar) {
        synchronized (this.zzb) {
            this.zzn = zzbhgVar;
        }
    }
}
