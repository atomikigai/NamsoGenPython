package o;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f7410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f7411d;

    public /* synthetic */ c(g gVar, String str, Bundle bundle, int i) {
        this.f7408a = i;
        this.f7411d = gVar;
        this.f7409b = str;
        this.f7410c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7408a) {
            case 0:
                this.f7411d.f7427b.extraCallback(this.f7409b, this.f7410c);
                break;
            default:
                this.f7411d.f7427b.onPostMessage(this.f7409b, this.f7410c);
                break;
        }
    }
}
