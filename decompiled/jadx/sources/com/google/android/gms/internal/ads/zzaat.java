package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaat {
    private final zzaac zza = new zzaac();
    private final zzaar zzb;
    private final zzaas zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzaat(Context context) {
        DisplayManager displayManager;
        zzaar zzaarVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new zzaar(this, displayManager);
        this.zzb = zzaarVar;
        this.zzc = zzaarVar != null ? zzaas.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaat zzaatVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzaatVar.zzk = refreshRate;
            zzaatVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzdt.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzaatVar.zzk = -9223372036854775807L;
            zzaatVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzen.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzaaq.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if (zzen.zza < 30 || this.zze == null) {
            return;
        }
        float fZza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f10 = this.zzg;
        if (fZza != f10) {
            if (fZza != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                    f11 = 0.02f;
                }
                if (Math.abs(fZza - this.zzg) < f11) {
                    return;
                }
            } else if (fZza == -1.0f && this.zza.zzb() < 30) {
                return;
            }
            this.zzg = fZza;
            zzn(false);
        }
    }

    private final void zzn(boolean z4) {
        Surface surface;
        if (zzen.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.zzd) {
            float f11 = this.zzg;
            if (f11 != -1.0f) {
                f10 = this.zzi * f11;
            }
        }
        if (z4 || this.zzh != f10) {
            this.zzh = f10;
            zzaaq.zza(surface, f10);
        }
    }

    public final long zza(long j4) {
        long j10;
        if (this.zzp != -1 && this.zza.zzg()) {
            long jZzc = this.zzq + ((long) (((this.zzm - this.zzp) * this.zza.zzc()) / this.zzi));
            if (Math.abs(j4 - jZzc) > 20000000) {
                zzl();
            } else {
                j4 = jZzc;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j4;
        zzaas zzaasVar = this.zzc;
        if (zzaasVar != null && this.zzk != -9223372036854775807L) {
            long j11 = zzaasVar.zza;
            if (j11 != -9223372036854775807L) {
                long j12 = this.zzk;
                long j13 = (((j4 - j11) / j12) * j12) + j11;
                if (j4 <= j13) {
                    j10 = j13 - j12;
                } else {
                    j10 = j13;
                    j13 = j12 + j13;
                }
                long j14 = this.zzl;
                if (j13 - j4 >= j4 - j10) {
                    j13 = j10;
                }
                return j13 - j14;
            }
        }
        return j4;
    }

    public final void zzc(float f10) {
        this.zzf = f10;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j4) {
        long j10 = this.zzn;
        if (j10 != -1) {
            this.zzp = j10;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j4 * 1000);
        zzm();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzaas zzaasVar = this.zzc;
            zzaasVar.getClass();
            zzaasVar.zzb();
            this.zzb.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzaar zzaarVar = this.zzb;
        if (zzaarVar != null) {
            zzaarVar.zzb();
            zzaas zzaasVar = this.zzc;
            zzaasVar.getClass();
            zzaasVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}
