package androidx.webkit.internal;

import androidx.webkit.NoVarySearchHeader;
import androidx.webkit.SpeculativeLoadingParameters;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SpeculativeLoadingParametersAdapter implements SpeculativeLoadingParametersBoundaryInterface {
    private final SpeculativeLoadingParameters mSpeculativeLoadingParameters;

    public SpeculativeLoadingParametersAdapter(SpeculativeLoadingParameters speculativeLoadingParameters) {
        this.mSpeculativeLoadingParameters = speculativeLoadingParameters;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public Map<String, String> getAdditionalHeaders() {
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        return speculativeLoadingParameters == null ? new HashMap() : speculativeLoadingParameters.getAdditionalHeaders();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public InvocationHandler getNoVarySearchData() {
        NoVarySearchHeader expectedNoVarySearchData;
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        if (speculativeLoadingParameters == null || (expectedNoVarySearchData = speculativeLoadingParameters.getExpectedNoVarySearchData()) == null) {
            return null;
        }
        return new qd.a(new NoVarySearchHeaderAdapter(expectedNoVarySearchData));
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public boolean isJavaScriptEnabled() {
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        if (speculativeLoadingParameters == null) {
            return false;
        }
        return speculativeLoadingParameters.isJavaScriptEnabled();
    }
}
