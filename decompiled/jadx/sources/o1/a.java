package o1;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f7452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f7453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7455d;

    public a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f7452a = intentFilter;
        this.f7453b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f7453b);
        sb2.append(" filter=");
        sb2.append(this.f7452a);
        if (this.f7455d) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
