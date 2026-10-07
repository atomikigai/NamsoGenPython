package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import e6.q1;
import e6.r1;
import e6.v2;
import i6.h;
import java.util.ArrayList;
import java.util.List;
import q7.b;
import w5.w;
import z5.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbhw {
    private final zzbhv zza;
    private final zzbfz zzc;
    private final List zzb = new ArrayList();
    private final w zzd = new w();
    private final List zze = new ArrayList();

    public zzbhw(zzbhv zzbhvVar) {
        zzbfy zzbfwVar;
        this.zza = zzbhvVar;
        zzbfz zzbfzVar = null;
        try {
            List listZzu = zzbhvVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbfwVar = iInterfaceQueryLocalInterface instanceof zzbfy ? (zzbfy) iInterfaceQueryLocalInterface : new zzbfw(iBinder);
                    } else {
                        zzbfwVar = null;
                    }
                    if (zzbfwVar != null) {
                        this.zzb.add(new zzbfz(zzbfwVar));
                    }
                }
            }
        } catch (RemoteException e) {
            h.e("", e);
        }
        try {
            List listZzv = this.zza.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    q1 q1VarY = obj2 instanceof IBinder ? v2.y((IBinder) obj2) : null;
                    if (q1VarY != null) {
                        this.zze.add(new r1(q1VarY));
                    }
                }
            }
        } catch (RemoteException e4) {
            h.e("", e4);
        }
        try {
            zzbfy zzbfyVarZzk = this.zza.zzk();
            if (zzbfyVarZzk != null) {
                zzbfzVar = new zzbfz(zzbfyVarZzk);
            }
        } catch (RemoteException e10) {
            h.e("", e10);
        }
        this.zzc = zzbfzVar;
        try {
            if (this.zza.zzi() != null) {
                new zzbfs(this.zza.zzi());
            }
        } catch (RemoteException e11) {
            h.e("", e11);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (RemoteException e) {
            h.e("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final w zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.a(this.zza.zzh());
            }
        } catch (RemoteException e) {
            h.e("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    public final c zzb() {
        return this.zzc;
    }

    public final Double zzc() {
        try {
            double dZze = this.zza.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final Object zzd() {
        try {
            q7.a aVarZzl = this.zza.zzl();
            if (aVarZzl != null) {
                return b.I(aVarZzl);
            }
            return null;
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final List zzk() {
        return this.zzb;
    }
}
