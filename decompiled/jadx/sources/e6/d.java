package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbuj;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f3300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpc f3301c;

    public d(OutOfContextTestingActivity outOfContextTestingActivity, zzbpc zzbpcVar) {
        this.f3300b = outOfContextTestingActivity;
        this.f3301c = zzbpcVar;
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object a() {
        q.g(this.f3300b, "out_of_context_tester");
        return null;
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f3300b;
        q7.b bVar = new q7.b(outOfContextTestingActivity);
        zzbcn.zza(outOfContextTestingActivity);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziY)).booleanValue()) {
            return b1Var.w(bVar, this.f3301c, 243799000);
        }
        return null;
    }

    @Override // e6.r
    public final Object c() {
        c2 c2Var;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f3300b;
        q7.b bVar = new q7.b(outOfContextTestingActivity);
        zzbcn.zza(outOfContextTestingActivity);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziY)).booleanValue()) {
            try {
                try {
                    IBinder iBinderB = qd.b.K(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (iBinderB == null) {
                        c2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        c2Var = iInterfaceQueryLocalInterface instanceof c2 ? (c2) iInterfaceQueryLocalInterface : new c2(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    }
                    return c2Var.y(bVar, this.f3301c);
                } catch (Exception e) {
                    throw new i6.j(e);
                }
            } catch (RemoteException e4) {
                e = e4;
                zzbuj.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            } catch (i6.j e10) {
                e = e10;
                zzbuj.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                zzbuj.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            }
        }
        return null;
    }
}
