package o;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f7406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f7407c;

    public /* synthetic */ b(g gVar, Bundle bundle, int i) {
        this.f7405a = i;
        this.f7407c = gVar;
        this.f7406b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7405a) {
            case 0:
                this.f7407c.f7427b.onUnminimized(this.f7406b);
                break;
            case 1:
                this.f7407c.f7427b.onMessageChannelReady(this.f7406b);
                break;
            case 2:
                this.f7407c.f7427b.onWarmupCompleted(this.f7406b);
                break;
            default:
                this.f7407c.f7427b.onMinimized(this.f7406b);
                break;
        }
    }
}
