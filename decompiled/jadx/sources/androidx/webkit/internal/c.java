package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewNavigationBoundaryInterface f1231b;

    public /* synthetic */ c(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface, int i) {
        this.f1230a = i;
        this.f1231b = webViewNavigationBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        Object objLambda$onNavigationCompleted$2;
        switch (this.f1230a) {
            case 0:
                return WebNavigationClientAdapter.lambda$onNavigationStarted$0(this.f1231b);
            case 1:
                return WebNavigationClientAdapter.lambda$onNavigationRedirected$1(this.f1231b);
            default:
                objLambda$onNavigationCompleted$2 = WebNavigationClientAdapter.lambda$onNavigationCompleted$2(this.f1231b);
                return objLambda$onNavigationCompleted$2;
        }
    }
}
