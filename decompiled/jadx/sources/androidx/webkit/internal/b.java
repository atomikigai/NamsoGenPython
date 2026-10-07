package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewPageBoundaryInterface f1229b;

    public /* synthetic */ b(WebViewPageBoundaryInterface webViewPageBoundaryInterface, int i) {
        this.f1228a = i;
        this.f1229b = webViewPageBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1228a) {
            case 0:
                return WebNavigationClientAdapter.lambda$onFirstContentfulPaint$6(this.f1229b);
            case 1:
                return WebNavigationClientAdapter.lambda$onPageDeleted$3(this.f1229b);
            case 2:
                return WebNavigationClientAdapter.lambda$onPageLoadEventFired$4(this.f1229b);
            default:
                return WebNavigationClientAdapter.lambda$onPageDOMContentLoadedEventFired$5(this.f1229b);
        }
    }
}
