package b0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.i0;
import h3.f1;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import jd.l;
import q0.j0;
import q0.v0;
import w5.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1335a;

    public /* synthetic */ h(int i) {
        this.f1335a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1335a) {
            case 0:
                WeakHashMap weakHashMap = v0.f7946a;
                float fM = j0.m((View) obj);
                float fM2 = j0.m((View) obj2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            case 1:
                return l.f((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 2:
                return l.f((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 3:
                return l.f(((e2.e) obj).f3229a, ((e2.e) obj2).f3229a);
            case 4:
                return l.f(((e2.g) obj).f3239a, ((e2.g) obj2).f3239a);
            case 5:
                List list = s.f9666b;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            case 6:
                return l.f(((f1) obj2).f4695d, ((f1) obj).f4695d);
            case 7:
                return l.f(((l3.d) obj).f6539b, ((l3.d) obj2).f6539b);
            case 8:
                return l.f(Long.valueOf(((n3.c) obj).f7252j), Long.valueOf(((n3.c) obj2).f7252j));
            case 9:
                return l.f((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
            case 10:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 11:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 12:
                return ((u.f) obj).f8742b - ((u.f) obj2).f8742b;
            case 13:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 14:
                w7.b bVar = (w7.b) obj;
                w7.b bVar2 = (w7.b) obj2;
                i0.i(bVar);
                i0.i(bVar2);
                int i = bVar.f9687a;
                int i10 = bVar2.f9687a;
                if (i == i10) {
                    int i11 = bVar.f9688b;
                    int i12 = bVar2.f9688b;
                    if (i11 == i12) {
                        return 0;
                    }
                    if (i11 >= i12) {
                        return 1;
                    }
                } else if (i >= i10) {
                    return 1;
                }
                return -1;
            default:
                x1.l lVar = (x1.l) obj;
                x1.l lVar2 = (x1.l) obj2;
                RecyclerView recyclerView = lVar.f10140d;
                if ((recyclerView == null) == (lVar2.f10140d == null)) {
                    boolean z4 = lVar.f10137a;
                    if (z4 == lVar2.f10137a) {
                        int i13 = lVar2.f10138b - lVar.f10138b;
                        if (i13 != 0) {
                            return i13;
                        }
                        int i14 = lVar.f10139c - lVar2.f10139c;
                        if (i14 != 0) {
                            return i14;
                        }
                        return 0;
                    }
                    if (!z4) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
        }
    }
}
