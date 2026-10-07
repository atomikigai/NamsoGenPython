package e6;

import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f3297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3298c;

    public c(q qVar, AdActivity adActivity) {
        this.f3297b = adActivity;
        this.f3298c = qVar;
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object a() {
        q.g(this.f3297b, "ad_overlay");
        return null;
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.zzn(new q7.b(this.f3297b));
    }

    @Override // e6.r
    public final Object c() {
        AdActivity adActivity = this.f3297b;
        zzbcn.zza(adActivity);
        boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkp)).booleanValue();
        q qVar = this.f3298c;
        if (!zBooleanValue) {
            return ((zzbtd) qVar.e).zza(adActivity);
        }
        try {
            try {
                return zzbtf.zzI(zzbti.zzb(qd.b.K(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl")).zze(new q7.b(adActivity)));
            } catch (Exception e) {
                throw new i6.j(e);
            }
        } catch (RemoteException e4) {
            e = e4;
            zzbul zzbulVarZza = zzbuj.zza(adActivity.getApplicationContext());
            qVar.f3394f = zzbulVarZza;
            zzbulVarZza.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        } catch (i6.j e10) {
            e = e10;
            zzbul zzbulVarZza2 = zzbuj.zza(adActivity.getApplicationContext());
            qVar.f3394f = zzbulVarZza2;
            zzbulVarZza2.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        } catch (NullPointerException e11) {
            e = e11;
            zzbul zzbulVarZza3 = zzbuj.zza(adActivity.getApplicationContext());
            qVar.f3394f = zzbulVarZza3;
            zzbulVarZza3.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
