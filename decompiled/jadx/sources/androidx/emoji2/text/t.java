package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f802b;

    public t(int i) {
        this.f801a = new SparseArray(i);
    }

    public final void a(p pVar, int i, int i10) {
        int iA = pVar.a(i);
        SparseArray sparseArray = this.f801a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(iA);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(pVar.a(i), tVar);
        }
        if (i10 > i) {
            tVar.a(pVar, i + 1, i10);
        } else {
            tVar.f802b = pVar;
        }
    }
}
