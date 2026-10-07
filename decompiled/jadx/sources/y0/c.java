package y0;

import android.graphics.Rect;
import java.util.Comparator;
import r0.l;
import r7.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f10371a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f10372b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f10374d;

    public c(boolean z4, i iVar) {
        this.f10373c = z4;
        this.f10374d = iVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f10374d.getClass();
        Rect rect = this.f10371a;
        ((l) obj).f(rect);
        Rect rect2 = this.f10372b;
        ((l) obj2).f(rect2);
        int i = rect.top;
        int i10 = rect2.top;
        if (i < i10) {
            return -1;
        }
        if (i > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z4 = this.f10373c;
        if (i11 < i12) {
            return z4 ? 1 : -1;
        }
        if (i11 > i12) {
            return z4 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z4 ? 1 : -1;
        }
        if (i15 > i16) {
            return z4 ? -1 : 1;
        }
        return 0;
    }
}
