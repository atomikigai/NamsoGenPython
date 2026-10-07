package androidx.webkit.internal;

import android.webkit.ValueCallback;
import androidx.webkit.PrerenderOperationCallback;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrerenderOperationCallback f1233b;

    public /* synthetic */ d(PrerenderOperationCallback prerenderOperationCallback, int i) {
        this.f1232a = i;
        this.f1233b = prerenderOperationCallback;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f1232a) {
            case 0:
                this.f1233b.onPrerenderActivated();
                break;
            case 1:
                WebViewProviderAdapter.lambda$prerenderUrlAsync$3(this.f1233b, (Throwable) obj);
                break;
            case 2:
                this.f1233b.onPrerenderActivated();
                break;
            default:
                WebViewProviderAdapter.lambda$prerenderUrlAsync$1(this.f1233b, (Throwable) obj);
                break;
        }
    }
}
