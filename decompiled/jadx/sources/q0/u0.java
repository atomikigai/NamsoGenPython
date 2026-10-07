package q0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f7942d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f7943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f7944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f7945c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f7943a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        throw da.v.e(arrayList, size);
    }
}
