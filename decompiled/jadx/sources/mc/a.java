package mc;

import java.util.Iterator;
import jd.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f7099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f7100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7101c = 1;

    public a(char c10, char c11) {
        this.f7099a = c10;
        this.f7100b = (char) l.k(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f7099a, this.f7100b, this.f7101c);
    }
}
