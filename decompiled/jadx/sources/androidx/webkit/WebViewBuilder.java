package androidx.webkit;

import android.content.Context;
import android.webkit.WebView;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class WebViewBuilder {
    WebViewBuilderBoundaryInterface mBuilderStateBoundary;
    private Policy mPolicy;

    /* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface Experimental {
    }

    public WebView build(Context context) throws WebViewBuilderException {
        if (!WebViewFeatureInternal.WEBVIEW_BUILDER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.mBuilderStateBoundary == null) {
            this.mBuilderStateBoundary = WebViewGlueCommunicator.getFactory().getWebViewBuilder();
        }
        WebViewBuilderBoundaryInterface.Config config = new WebViewBuilderBoundaryInterface.Config();
        this.mPolicy.configure(config);
        return this.mBuilderStateBoundary.build(context, config);
    }

    public WebViewBuilder setPolicy(Policy policy) {
        this.mPolicy = policy;
        return this;
    }
}
