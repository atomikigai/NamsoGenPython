package r4;

import fa.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class g extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8160a;

    public g(int i) {
        this(i, c1.G(i));
    }

    public g(int i, String str) {
        super(str);
        this.f8160a = i;
    }

    public g(int i, String str, Exception exc) {
        super(str, exc);
        this.f8160a = i;
    }
}
