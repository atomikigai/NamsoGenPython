package g9;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f4351a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4354d;

    public o(p pVar, a2.l lVar) {
        this.f4352b = pVar;
        TypedArray typedArray = (TypedArray) lVar.f44c;
        this.f4353c = typedArray.getResourceId(28, 0);
        this.f4354d = typedArray.getResourceId(52, 0);
    }
}
