package x1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f10229t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f10230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f10231b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10236j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f10244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f10245s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10232c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10233d = -1;
    public long e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10234f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10235g = -1;
    public w0 h = null;
    public w0 i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f10237k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f10238l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10239m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n0 f10240n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10241o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10242p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10243q = -1;

    public w0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f10230a = view;
    }

    public final void a(int i) {
        this.f10236j = i | this.f10236j;
    }

    public final int b() {
        int i = this.f10235g;
        return i == -1 ? this.f10232c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f10236j & 1024) != 0 || (arrayList = this.f10237k) == null || arrayList.size() == 0) ? f10229t : this.f10238l;
    }

    public final boolean d() {
        View view = this.f10230a;
        return (view.getParent() == null || view.getParent() == this.f10244r) ? false : true;
    }

    public final boolean e() {
        return (this.f10236j & 1) != 0;
    }

    public final boolean f() {
        return (this.f10236j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f10236j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = q0.v0.f7946a;
        return !q0.d0.i(this.f10230a);
    }

    public final boolean h() {
        return (this.f10236j & 8) != 0;
    }

    public final boolean i() {
        return this.f10240n != null;
    }

    public final boolean j() {
        return (this.f10236j & 256) != 0;
    }

    public final boolean k() {
        return (this.f10236j & 2) != 0;
    }

    public final void l(int i, boolean z4) {
        if (this.f10233d == -1) {
            this.f10233d = this.f10232c;
        }
        if (this.f10235g == -1) {
            this.f10235g = this.f10232c;
        }
        if (z4) {
            this.f10235g += i;
        }
        this.f10232c += i;
        View view = this.f10230a;
        if (view.getLayoutParams() != null) {
            ((i0) view.getLayoutParams()).f10107c = true;
        }
    }

    public final void m() {
        if (RecyclerView.L0 && j()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f10236j = 0;
        this.f10232c = -1;
        this.f10233d = -1;
        this.e = -1L;
        this.f10235g = -1;
        this.f10239m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f10237k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f10236j &= -1025;
        this.f10242p = 0;
        this.f10243q = -1;
        RecyclerView.l(this);
    }

    public final void n(boolean z4) {
        int i = this.f10239m;
        int i10 = z4 ? i - 1 : i + 1;
        this.f10239m = i10;
        if (i10 < 0) {
            this.f10239m = 0;
            if (RecyclerView.L0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z4 && i10 == 1) {
            this.f10236j |= 16;
        } else if (z4 && i10 == 0) {
            this.f10236j &= -17;
        }
        if (RecyclerView.M0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z4 + ":" + this);
        }
    }

    public final boolean o() {
        return (this.f10236j & 128) != 0;
    }

    public final boolean p() {
        return (this.f10236j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sbC = u.e.c(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbC.append(Integer.toHexString(hashCode()));
        sbC.append(" position=");
        sbC.append(this.f10232c);
        sbC.append(" id=");
        sbC.append(this.e);
        sbC.append(", oldPos=");
        sbC.append(this.f10233d);
        sbC.append(", pLpos:");
        sbC.append(this.f10235g);
        StringBuilder sb2 = new StringBuilder(sbC.toString());
        if (i()) {
            sb2.append(" scrap ");
            sb2.append(this.f10241o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb2.append(" invalid");
        }
        if (!e()) {
            sb2.append(" unbound");
        }
        if ((this.f10236j & 2) != 0) {
            sb2.append(" update");
        }
        if (h()) {
            sb2.append(" removed");
        }
        if (o()) {
            sb2.append(" ignored");
        }
        if (j()) {
            sb2.append(" tmpDetached");
        }
        if (!g()) {
            sb2.append(" not recyclable(" + this.f10239m + ")");
        }
        if ((this.f10236j & 512) != 0 || f()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f10230a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
