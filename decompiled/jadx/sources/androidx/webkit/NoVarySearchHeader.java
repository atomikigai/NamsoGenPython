package androidx.webkit;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class NoVarySearchHeader {
    public final List<String> consideredQueryParameters;
    public final boolean ignoreDifferencesInParameters;
    public final List<String> ignoredQueryParameters;
    public final boolean varyOnKeyOrder;

    private NoVarySearchHeader(boolean z4, boolean z10, List<String> list, List<String> list2) {
        this.varyOnKeyOrder = z4;
        this.ignoreDifferencesInParameters = z10;
        this.ignoredQueryParameters = list;
        this.consideredQueryParameters = list2;
    }

    public static NoVarySearchHeader alwaysVaryHeader() {
        return new NoVarySearchHeader(true, false, new ArrayList(), new ArrayList());
    }

    public static NoVarySearchHeader neverVaryExcept(boolean z4, List<String> list) {
        return new NoVarySearchHeader(z4, true, new ArrayList(), list);
    }

    public static NoVarySearchHeader neverVaryHeader() {
        return new NoVarySearchHeader(false, true, new ArrayList(), new ArrayList());
    }

    public static NoVarySearchHeader varyExcept(boolean z4, List<String> list) {
        return new NoVarySearchHeader(z4, false, list, new ArrayList());
    }
}
