package l5;

import bd.u;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements i5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f6836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f6837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f6838c;

    public p(Set set, i iVar, q qVar) {
        this.f6836a = set;
        this.f6837b = iVar;
        this.f6838c = qVar;
    }

    public final u a(String str, i5.b bVar, i5.d dVar) {
        Set set = this.f6836a;
        if (!set.contains(bVar)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
        }
        return new u(this.f6837b, str, bVar, dVar, this.f6838c, 6);
    }
}
