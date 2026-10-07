package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f820d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f822g;
    public boolean h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f832s;

    public a(i0 i0Var) {
        i0Var.A();
        v vVar = i0Var.f887n;
        if (vVar != null) {
            vVar.f997f.getClassLoader();
        }
        this.f817a = new ArrayList();
        this.h = true;
        this.f829p = false;
        this.f832s = -1;
        this.f830q = i0Var;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (i0.D(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f822g) {
            return true;
        }
        i0 i0Var = this.f830q;
        if (i0Var.f880d == null) {
            i0Var.f880d = new ArrayList();
        }
        i0Var.f880d.add(this);
        return true;
    }

    public final void b(p0 p0Var) {
        this.f817a.add(p0Var);
        p0Var.f961c = this.f818b;
        p0Var.f962d = this.f819c;
        p0Var.e = this.f820d;
        p0Var.f963f = this.e;
    }

    public final void c() {
        if (!this.h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f822g = true;
        this.i = null;
    }

    public final void d(int i) {
        if (this.f822g) {
            if (i0.D(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f817a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                p0 p0Var = (p0) arrayList.get(i10);
                s sVar = p0Var.f960b;
                if (sVar != null) {
                    sVar.B += i;
                    if (i0.D(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p0Var.f960b + " to " + p0Var.f960b.B);
                    }
                }
            }
        }
    }

    public final int e(boolean z4) {
        if (this.f831r) {
            throw new IllegalStateException("commit already called");
        }
        if (i0.D(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new u0());
            i("  ", printWriter, true);
            printWriter.close();
        }
        this.f831r = true;
        boolean z10 = this.f822g;
        i0 i0Var = this.f830q;
        if (z10) {
            this.f832s = i0Var.i.getAndIncrement();
        } else {
            this.f832s = -1;
        }
        i0Var.s(this, z4);
        return this.f832s;
    }

    public final void f() {
        g();
        this.f830q.v(this, false);
    }

    public final void g() {
        if (this.f822g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.h = false;
    }

    public final void h(int i, s sVar, String str, int i10) {
        Class<?> cls = sVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = sVar.I;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + sVar + ": was " + sVar.I + " now " + str);
            }
            sVar.I = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + sVar + " with tag " + str + " to container view with no id");
            }
            int i11 = sVar.G;
            if (i11 != 0 && i11 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + sVar + ": was " + sVar.G + " now " + i);
            }
            sVar.G = i;
            sVar.H = i;
        }
        b(new p0(i10, sVar));
        sVar.C = this.f830q;
    }

    public final void i(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f832s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f831r);
            if (this.f821f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f821f));
            }
            if (this.f818b != 0 || this.f819c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f818b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f819c));
            }
            if (this.f820d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f820d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f823j != 0 || this.f824k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f823j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f824k);
            }
            if (this.f825l != 0 || this.f826m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f825l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f826m);
            }
        }
        ArrayList arrayList = this.f817a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p0 p0Var = (p0) arrayList.get(i);
            switch (p0Var.f959a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + p0Var.f959a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p0Var.f960b);
            if (z4) {
                if (p0Var.f961c != 0 || p0Var.f962d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p0Var.f961c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p0Var.f962d));
                }
                if (p0Var.e != 0 || p0Var.f963f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p0Var.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p0Var.f963f));
                }
            }
        }
    }

    public final void j(s sVar) {
        i0 i0Var = sVar.C;
        if (i0Var == null || i0Var == this.f830q) {
            b(new p0(3, sVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + sVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void k(int i, s sVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        h(i, sVar, str, 2);
    }

    public final void l(s sVar, androidx.lifecycle.m mVar) {
        i0 i0Var = sVar.C;
        i0 i0Var2 = this.f830q;
        if (i0Var != i0Var2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + i0Var2);
        }
        if (mVar == androidx.lifecycle.m.f1066b && sVar.f969a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + mVar + " after the Fragment has been created");
        }
        if (mVar == androidx.lifecycle.m.f1065a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + mVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        p0 p0Var = new p0();
        p0Var.f959a = 10;
        p0Var.f960b = sVar;
        p0Var.f964g = sVar.W;
        p0Var.h = mVar;
        b(p0Var);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f832s >= 0) {
            sb2.append(" #");
            sb2.append(this.f832s);
        }
        if (this.i != null) {
            sb2.append(" ");
            sb2.append(this.i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
