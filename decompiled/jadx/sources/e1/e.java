package e1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import da.v;
import java.util.ArrayList;
import w8.k;
import w8.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f3187n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f3188o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f3189p = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f3190q = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f3191r = new c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f3192s = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f3196d;
    public final k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3198g;
    public final float h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f3200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3202m;

    public e(l lVar) {
        k kVar = l.B;
        this.f3193a = 0.0f;
        this.f3194b = Float.MAX_VALUE;
        this.f3195c = false;
        this.f3197f = false;
        this.f3198g = 0L;
        this.i = new ArrayList();
        this.f3199j = new ArrayList();
        this.f3196d = lVar;
        this.e = kVar;
        if (kVar == f3189p || kVar == f3190q || kVar == f3191r) {
            this.h = 0.1f;
        } else if (kVar == f3192s || kVar == f3187n || kVar == f3188o) {
            this.h = 0.00390625f;
        } else {
            this.h = 1.0f;
        }
        this.f3200k = null;
        this.f3201l = Float.MAX_VALUE;
        this.f3202m = false;
    }

    public final void a(float f10) {
        this.e.getClass();
        l lVar = this.f3196d;
        lVar.f9767z = f10 / 10000.0f;
        lVar.invalidateSelf();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3199j;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                throw v.e(arrayList, i);
            }
            i++;
        }
    }

    public final void b() {
        if (this.f3200k.f3204b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f3197f) {
            this.f3202m = true;
        }
    }
}
