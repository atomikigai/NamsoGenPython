package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends androidx.activity.m implements d0.c {
    public boolean G;
    public boolean H;
    public final a4.b E = new a4.b(new v(this), 3);
    public final androidx.lifecycle.t F = new androidx.lifecycle.t(this);
    public boolean I = true;

    public w() {
        ((f2.d) this.e.f1939d).f("android:support:fragments", new t(this, 0));
        j(new u(this, 0));
    }

    public static boolean q(i0 i0Var) {
        boolean zQ = false;
        for (s sVar : i0Var.f879c.x()) {
            if (sVar != null) {
                v vVar = sVar.D;
                if ((vVar == null ? null : vVar.f1000t) != null) {
                    zQ |= q(sVar.q());
                }
                t0 t0Var = sVar.Y;
                androidx.lifecycle.m mVar = androidx.lifecycle.m.f1068d;
                if (t0Var != null) {
                    t0Var.b();
                    if (t0Var.f992d.f1093d.compareTo(mVar) >= 0) {
                        sVar.Y.f992d.g();
                        zQ = true;
                    }
                }
                if (sVar.X.f1093d.compareTo(mVar) >= 0) {
                    sVar.X.g();
                    zQ = true;
                }
            }
        }
        return zQ;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.G);
        printWriter.print(" mResumed=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        if (getApplication() != null) {
            new h6.o0(this, f()).e(str2, printWriter);
        }
        ((v) this.E.f113b).f999s.r(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onActivityResult(int i, int i10, Intent intent) {
        this.E.m();
        super.onActivityResult(i, i10, intent);
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        a4.b bVar = this.E;
        bVar.m();
        super.onConfigurationChanged(configuration);
        ((v) bVar.f113b).f999s.h();
    }

    @Override // androidx.activity.m, d0.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F.d(androidx.lifecycle.l.ON_CREATE);
        i0 i0Var = ((v) this.E.f113b).f999s;
        i0Var.f898y = false;
        i0Var.f899z = false;
        i0Var.F.i = false;
        i0Var.p(1);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            super.onCreatePanelMenu(i, menu);
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        ((v) this.E.f113b).f999s.j();
        return true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((v) this.E.f113b).f999s.f881f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((v) this.E.f113b).f999s.k();
        this.F.d(androidx.lifecycle.l.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        for (s sVar : ((v) this.E.f113b).f999s.f879c.x()) {
            if (sVar != null) {
                sVar.P();
            }
        }
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a4.b bVar = this.E;
        if (i == 0) {
            return ((v) bVar.f113b).f999s.l();
        }
        if (i != 6) {
            return false;
        }
        return ((v) bVar.f113b).f999s.i();
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4) {
        for (s sVar : ((v) this.E.f113b).f999s.f879c.x()) {
            if (sVar != null) {
                sVar.Q();
            }
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onNewIntent(Intent intent) {
        this.E.m();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            ((v) this.E.f113b).f999s.m();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.H = false;
        ((v) this.E.f113b).f999s.p(5);
        this.F.d(androidx.lifecycle.l.ON_PAUSE);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4) {
        for (s sVar : ((v) this.E.f113b).f999s.f879c.x()) {
            if (sVar != null) {
                sVar.R();
            }
        }
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.F.d(androidx.lifecycle.l.ON_RESUME);
        i0 i0Var = ((v) this.E.f113b).f999s;
        i0Var.f898y = false;
        i0Var.f899z = false;
        i0Var.F.i = false;
        i0Var.p(7);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            super.onPreparePanel(i, view, menu);
            return true;
        }
        super.onPreparePanel(0, view, menu);
        ((v) this.E.f113b).f999s.o();
        return true;
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.E.m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        a4.b bVar = this.E;
        bVar.m();
        super.onResume();
        this.H = true;
        ((v) bVar.f113b).f999s.u(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        a4.b bVar = this.E;
        bVar.m();
        v vVar = (v) bVar.f113b;
        super.onStart();
        this.I = false;
        if (!this.G) {
            this.G = true;
            i0 i0Var = vVar.f999s;
            i0Var.f898y = false;
            i0Var.f899z = false;
            i0Var.F.i = false;
            i0Var.p(4);
        }
        vVar.f999s.u(true);
        this.F.d(androidx.lifecycle.l.ON_START);
        i0 i0Var2 = vVar.f999s;
        i0Var2.f898y = false;
        i0Var2.f899z = false;
        i0Var2.F.i = false;
        i0Var2.p(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.E.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.I = true;
        while (q(p())) {
        }
        i0 i0Var = ((v) this.E.f113b).f999s;
        i0Var.f899z = true;
        i0Var.F.i = true;
        i0Var.p(4);
        this.F.d(androidx.lifecycle.l.ON_STOP);
    }

    public final i0 p() {
        return ((v) this.E.f113b).f999s;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((v) this.E.f113b).f999s.f881f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
