package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import e6.f2;
import e6.g3;
import e6.o1;
import e6.q1;
import e6.r1;
import e6.v2;
import e6.x2;
import i6.h;
import java.util.ArrayList;
import java.util.List;
import n6.c;
import n6.d;
import n6.f;
import w5.m;
import w5.n;
import w5.o;
import w5.p;
import w5.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsp extends NativeAd {
    private final zzbhv zza;
    private final zzbso zzc;
    private final c zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();

    public zzbsp(zzbhv zzbhvVar) {
        zzbso zzbsoVar;
        this.zza = zzbhvVar;
        zzbsm zzbsmVar = null;
        try {
            List listZzu = zzbhvVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    zzbfy zzbfyVarZzg = obj instanceof IBinder ? zzbfx.zzg((IBinder) obj) : null;
                    if (zzbfyVarZzg != null) {
                        this.zzb.add(new zzbso(zzbfyVarZzg));
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
            zzbsoVar = zzbfyVarZzk != null ? new zzbso(zzbfyVarZzk) : null;
        } catch (RemoteException e10) {
            h.e("", e10);
        }
        this.zzc = zzbsoVar;
        try {
            if (this.zza.zzi() != null) {
                zzbsmVar = new zzbsm(this.zza.zzi());
            }
        } catch (RemoteException e11) {
            h.e("", e11);
        }
        this.zzd = zzbsmVar;
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (RemoteException e) {
            h.e("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final c getAdChoicesInfo() {
        return this.zzd;
    }

    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle bundleZzf = this.zza.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (RemoteException e) {
            h.e("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final d getIcon() {
        return this.zzc;
    }

    public final List<d> getImages() {
        return this.zzb;
    }

    public final m getMediaContent() {
        try {
            if (this.zza.zzj() != null) {
                return new x2(this.zza.zzj(), null);
            }
        } catch (RemoteException e) {
            h.e("", e);
        }
        return null;
    }

    public final List<o> getMuteThisAdReasons() {
        return this.zze;
    }

    public final String getPrice() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final t getResponseInfo() {
        f2 f2VarZzg;
        try {
            f2VarZzg = this.zza.zzg();
        } catch (RemoteException e) {
            h.e("", e);
            f2VarZzg = null;
        }
        if (f2VarZzg != null) {
            return new t(f2VarZzg);
        }
        return null;
    }

    public final Double getStarRating() {
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

    public final String getStore() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e) {
            h.e("", e);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzI();
        } catch (RemoteException e) {
            h.e("", e);
            return false;
        }
    }

    public final void muteThisAd(o oVar) {
        try {
            try {
                if (this.zza.zzI()) {
                    if (oVar == null) {
                        this.zza.zzy(null);
                        return;
                    } else if (oVar instanceof r1) {
                        this.zza.zzy(((r1) oVar).f3422b);
                        return;
                    } else {
                        h.d("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                h.e("", e);
            }
            h.d("Ad is not custom mute enabled");
        } catch (RemoteException e4) {
            h.e("", e4);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e) {
            h.e("Failed to record native event", e);
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

    public final void setMuteThisAdListener(n nVar) {
        try {
            this.zza.zzE(new o1("com.google.android.gms.ads.internal.client.IMuteThisAdListener"));
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final void setOnPaidEventListener(p pVar) {
        try {
            this.zza.zzF(new g3());
        } catch (RemoteException e) {
            h.e("Failed to setOnPaidEventListener", e);
        }
    }

    public final void setUnconfirmedClickListener(f fVar) {
        try {
            this.zza.zzG(new zzbsw(fVar));
        } catch (RemoteException e) {
            h.e("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }
}
