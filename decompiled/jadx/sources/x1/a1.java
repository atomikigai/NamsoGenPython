package x1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10018d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f10019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f10020g;

    public a1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f10020g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f10015a = -1;
        this.f10016b = Integer.MIN_VALUE;
        this.f10017c = false;
        this.f10018d = false;
        this.e = false;
        int[] iArr = this.f10019f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
