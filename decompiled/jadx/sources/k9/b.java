package k9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzat;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6094b;

    public /* synthetic */ b(Object obj, int i) {
        this.f6093a = i;
        this.f6094b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f6093a) {
            case 0:
                c cVar = (c) this.f6094b;
                cVar.f6099b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new b0(this, iBinder));
                break;
            default:
                zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
                o3.u uVar = (o3.u) this.f6094b;
                uVar.E = zzat.zzc(iBinder);
                uVar.D = 2;
                uVar.d0(26);
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f6093a) {
            case 0:
                c cVar = (c) this.f6094b;
                cVar.f6099b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new z(this, 1));
                break;
            default:
                zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
                o3.u uVar = (o3.u) this.f6094b;
                uVar.E = null;
                uVar.D = 0;
                break;
        }
    }
}
