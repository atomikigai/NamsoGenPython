package a4;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f157b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f158a;

    public k0(j0 j0Var) {
        this.f158a = j0Var;
    }

    @Override // a4.x
    public final boolean a(Object obj) {
        return f157b.contains(((Uri) obj).getScheme());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [a4.j0, java.lang.Object] */
    @Override // a4.x
    public final w b(Object obj, int i, int i10, u3.i iVar) {
        Uri uri = (Uri) obj;
        return new w(new o4.d(uri), this.f158a.n(uri));
    }
}
