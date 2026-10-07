package a4;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f160b = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProxyConfig.MATCH_HTTP, ProxyConfig.MATCH_HTTPS)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f161a;

    public l0(x xVar) {
        this.f161a = xVar;
    }

    @Override // a4.x
    public final boolean a(Object obj) {
        return f160b.contains(((Uri) obj).getScheme());
    }

    @Override // a4.x
    public final w b(Object obj, int i, int i10, u3.i iVar) {
        return this.f161a.b(new n(((Uri) obj).toString()), i, i10, iVar);
    }
}
