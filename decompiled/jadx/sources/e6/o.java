package e6;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n6.i f3359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f3361d;
    public final /* synthetic */ q e;

    public o(q qVar, n6.i iVar, FrameLayout frameLayout, Context context) {
        this.f3359b = iVar;
        this.f3360c = frameLayout;
        this.f3361d = context;
        this.e = qVar;
    }

    @Override // e6.r
    public final Object a() {
        q.g(this.f3361d, "native_ad_view_delegate");
        return new d3();
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.G(new q7.b(this.f3359b), new q7.b(this.f3360c));
    }

    @Override // e6.r
    public final Object c() {
        Context context = this.f3361d;
        zzbcn.zza(context);
        boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkp)).booleanValue();
        FrameLayout frameLayout = this.f3360c;
        n6.i iVar = this.f3359b;
        q qVar = this.e;
        if (!zBooleanValue) {
            return ((zzbhx) qVar.f3393d).zza(context, iVar, frameLayout);
        }
        try {
            try {
                return zzbgb.zzdA(zzbge.zzb(qd.b.K(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl")).zze(new q7.b(context), new q7.b(iVar), new q7.b(frameLayout), 243799000));
            } catch (Exception e) {
                throw new i6.j(e);
            }
        } catch (RemoteException e4) {
            e = e4;
            zzbul zzbulVarZza = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza;
            zzbulVarZza.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        } catch (i6.j e10) {
            e = e10;
            zzbul zzbulVarZza2 = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza2;
            zzbulVarZza2.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        } catch (NullPointerException e11) {
            e = e11;
            zzbul zzbulVarZza3 = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza3;
            zzbulVarZza3.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
