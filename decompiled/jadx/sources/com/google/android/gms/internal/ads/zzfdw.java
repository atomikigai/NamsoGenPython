package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.h2;
import e6.s3;
import e6.y1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfdw implements r6.a, zzcya, zzcwp, zzcwm, zzcxc, zzcyx, zzfch, zzdel {
    private final zzfgy zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfdw zzi = null;

    public zzfdw(zzfgy zzfgyVar) {
        this.zza = zzfgyVar;
    }

    @Override // r6.a
    public final void onAdMetadataChanged() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.onAdMetadataChanged();
        } else {
            zzfby.zza(this.zzb, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdk
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((r6.a) obj).onAdMetadataChanged();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zza();
            return;
        }
        this.zza.zza();
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfds
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbxf) obj).zzg();
            }
        });
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdt
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbwp) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzb();
        } else {
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdu
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbwp) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzc();
            return;
        }
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfde
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbxf) obj).zzj();
            }
        });
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdf
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbwp) obj).zzj();
            }
        });
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdg
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbxf) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(final h2 h2Var) {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzdB(h2Var);
            return;
        }
        final int i = h2Var.f3314a;
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdp
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbxj) obj).zzf(h2Var);
            }
        });
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdq
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbxj) obj).zze(i);
            }
        });
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdr
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbwp) obj).zzg(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzdG();
        } else {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdl
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbxf) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(final zzbwj zzbwjVar, final String str, final String str2) {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzds(zzbwjVar, str, str2);
            return;
        }
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdv
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                zzbwj zzbwjVar2 = zzbwjVar;
                ((zzbxf) obj).zzk(new zzbxt(zzbwjVar2.zzc(), zzbwjVar2.zzb()));
            }
        });
        zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdb
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                zzbwj zzbwjVar2 = zzbwjVar;
                ((zzbxk) obj).zze(new zzbxt(zzbwjVar2.zzc(), zzbwjVar2.zzb()), str, str2);
            }
        });
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdc
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbwp) obj).zze(zzbwjVar);
            }
        });
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdd
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) throws RemoteException {
                ((zzbwk) obj).zze(zzbwjVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zze();
        } else {
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdo
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbwp) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzf();
        } else {
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfda
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbwp) obj).zzl();
                }
            });
        }
    }

    public final void zzg(r6.a aVar) {
        this.zzb.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(final s3 s3Var) {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzh(s3Var);
        } else {
            zzfby.zza(this.zzh, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdh
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((y1) obj).B(s3Var);
                }
            });
        }
    }

    public final void zzi(y1 y1Var) {
        this.zzh.set(y1Var);
    }

    public final void zzj(zzbxf zzbxfVar) {
        this.zzd.set(zzbxfVar);
    }

    public final void zzk(zzbxj zzbxjVar) {
        this.zzc.set(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfch
    public final void zzl(zzfch zzfchVar) {
        this.zzi = (zzfdw) zzfchVar;
    }

    @Deprecated
    public final void zzm(zzbwp zzbwpVar) {
        this.zze.set(zzbwpVar);
    }

    @Deprecated
    public final void zzn(zzbwk zzbwkVar) {
        this.zzg.set(zzbwkVar);
    }

    public final void zzo(zzbxk zzbxkVar) {
        this.zzf.set(zzbxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(final h2 h2Var) {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzq(h2Var);
        } else {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdm
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbxf) obj).zzi(h2Var);
                }
            });
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdn
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbxf) obj).zzh(h2Var.f3314a);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzs();
        } else {
            zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdi
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbxj) obj).zzg();
                }
            });
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdj
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbwp) obj).zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
    }
}
