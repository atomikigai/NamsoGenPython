package pc;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements oc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f7855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.p f7857c;

    public c(CharSequence charSequence, int i, ic.p pVar) {
        jc.i.e(charSequence, "input");
        this.f7855a = charSequence;
        this.f7856b = i;
        this.f7857c = pVar;
    }

    @Override // oc.e
    public final Iterator iterator() {
        return new b(this);
    }
}
