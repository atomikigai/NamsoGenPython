package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.h2;
import e6.s3;
import e6.y1;
import g6.l;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfar implements zzcwp, zzcyl, zzfch, l, zzcyx, zzcxc, zzdel {
    private final zzfgy zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfar zzh = null;

    public zzfar(zzfgy zzfgyVar) {
        this.zza = zzfgyVar;
    }

    public static zzfar zzi(zzfar zzfarVar) {
        zzfar zzfarVar2 = new zzfar(zzfarVar.zza);
        zzfarVar2.zzh = zzfarVar;
        return zzfarVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(final h2 h2Var) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdB(h2Var);
        } else {
            zzfby.zza(this.zzb, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbai) obj).zzc(h2Var);
                }
            });
            zzfby.zza(this.zzb, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfan
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbai) obj).zzb(h2Var.f3314a);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdG();
        } else {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfai
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbam) obj).zzb();
                }
            });
        }
    }

    @Override // g6.l
    public final void zzdq() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdq();
        } else {
            zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfaf
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((l) obj).zzdq();
                }
            });
        }
    }

    @Override // g6.l
    public final void zzdr() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdr();
            return;
        }
        zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfaq
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((l) obj).zzdr();
            }
        });
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfad
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbam) obj).zzf();
            }
        });
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbam) obj).zze();
            }
        });
    }

    @Override // g6.l
    public final void zzdt() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdt();
        } else {
            zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfap
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((l) obj).zzdt();
                }
            });
        }
    }

    @Override // g6.l
    public final void zzdu(final int i) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdu(i);
        } else {
            zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfal
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((l) obj).zzdu(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzg() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzg();
        } else {
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfao
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzcyl) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(final s3 s3Var) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzh(s3Var);
        } else {
            zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfac
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((y1) obj).B(s3Var);
                }
            });
        }
    }

    public final void zzj() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzj();
            return;
        }
        this.zza.zza();
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfaj
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbaj) obj).zza();
            }
        });
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbam) obj).zzc();
            }
        });
    }

    public final void zzk(final zzbaf zzbafVar) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzk(zzbafVar);
        } else {
            zzfby.zza(this.zzb, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfah
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbai) obj).zzd(zzbafVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfch
    public final void zzl(zzfch zzfchVar) {
        this.zzh = (zzfar) zzfchVar;
    }

    public final void zzm(l lVar) {
        this.zzf.set(lVar);
    }

    public final void zzn(y1 y1Var) {
        this.zzg.set(y1Var);
    }

    public final void zzo(zzbai zzbaiVar) {
        this.zzb.set(zzbaiVar);
    }

    public final void zzp(zzbam zzbamVar) {
        this.zzd.set(zzbamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(final h2 h2Var) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzq(h2Var);
        } else {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfag
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbam) obj).zzd(h2Var);
                }
            });
        }
    }

    @Override // g6.l
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
    }

    @Override // g6.l
    public final void zzdk() {
    }
}
