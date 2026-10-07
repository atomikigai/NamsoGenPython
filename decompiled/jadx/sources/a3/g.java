package a3;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.bumptech.glide.manager.p;
import p4.n;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105b;

    public /* synthetic */ g(Object obj, int i) {
        this.f104a = i;
        this.f105b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f104a) {
            case 1:
                n.f().post(new p(this, true, 0));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f104a) {
            case 0:
                m.d().a(h.i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                h hVar = (h) this.f105b;
                hVar.c(hVar.f());
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f104a) {
            case 0:
                m.d().a(h.i, "Network connection lost", new Throwable[0]);
                h hVar = (h) this.f105b;
                hVar.c(hVar.f());
                break;
            default:
                n.f().post(new p(this, false, 0));
                break;
        }
    }
}
