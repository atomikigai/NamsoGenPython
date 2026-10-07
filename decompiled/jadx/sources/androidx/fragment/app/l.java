package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class l extends s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Handler f913f0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f921o0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Dialog f923q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f924r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f925s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f926t0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final androidx.activity.i f914g0 = new androidx.activity.i(this, 2);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final i f915h0 = new i(this, 0);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final j f916i0 = new j(this);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f917j0 = 0;
    public int k0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f918l0 = true;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f919m0 = true;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f920n0 = -1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ib.c f922p0 = new ib.c(this, 4);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f927u0 = false;

    @Override // androidx.fragment.app.s
    public final void B(Context context) {
        super.B(context);
        this.Z.e(this.f922p0);
        if (this.f926t0) {
            return;
        }
        this.f925s0 = false;
    }

    @Override // androidx.fragment.app.s
    public void C(Bundle bundle) {
        super.C(bundle);
        this.f913f0 = new Handler();
        this.f919m0 = this.H == 0;
        if (bundle != null) {
            this.f917j0 = bundle.getInt("android:style", 0);
            this.k0 = bundle.getInt("android:theme", 0);
            this.f918l0 = bundle.getBoolean("android:cancelable", true);
            this.f919m0 = bundle.getBoolean("android:showsDialog", this.f919m0);
            this.f920n0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.s
    public void F() {
        this.N = true;
        Dialog dialog = this.f923q0;
        if (dialog != null) {
            this.f924r0 = true;
            dialog.setOnDismissListener(null);
            this.f923q0.dismiss();
            if (!this.f925s0) {
                onDismiss(this.f923q0);
            }
            this.f923q0 = null;
            this.f927u0 = false;
        }
    }

    @Override // androidx.fragment.app.s
    public final void G() {
        this.N = true;
        if (!this.f926t0 && !this.f925s0) {
            this.f925s0 = true;
        }
        this.Z.i(this.f922p0);
    }

    @Override // androidx.fragment.app.s
    public final LayoutInflater H(Bundle bundle) {
        LayoutInflater layoutInflaterH = super.H(bundle);
        boolean z4 = this.f919m0;
        if (z4 && !this.f921o0) {
            if (z4 && !this.f927u0) {
                try {
                    this.f921o0 = true;
                    Dialog dialogC0 = c0();
                    this.f923q0 = dialogC0;
                    if (this.f919m0) {
                        int i = this.f917j0;
                        if (i == 1 || i == 2) {
                            dialogC0.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogC0.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogC0.requestWindowFeature(1);
                        }
                        Context contextR = r();
                        if (contextR != null) {
                            this.f923q0.setOwnerActivity((Activity) contextR);
                        }
                        this.f923q0.setCancelable(this.f918l0);
                        this.f923q0.setOnCancelListener(this.f915h0);
                        this.f923q0.setOnDismissListener(this.f916i0);
                        this.f927u0 = true;
                    } else {
                        this.f923q0 = null;
                    }
                    this.f921o0 = false;
                } catch (Throwable th) {
                    this.f921o0 = false;
                    throw th;
                }
            }
            if (i0.D(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f923q0;
            if (dialog != null) {
                return layoutInflaterH.cloneInContext(dialog.getContext());
            }
        } else if (i0.D(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f919m0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterH;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterH;
    }

    @Override // androidx.fragment.app.s
    public void J(Bundle bundle) {
        Dialog dialog = this.f923q0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f917j0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i10 = this.k0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z4 = this.f918l0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z10 = this.f919m0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i11 = this.f920n0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // androidx.fragment.app.s
    public void K() {
        this.N = true;
        Dialog dialog = this.f923q0;
        if (dialog != null) {
            this.f924r0 = false;
            dialog.show();
            View decorView = this.f923q0.getWindow().getDecorView();
            jc.i.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.s
    public void L() {
        this.N = true;
        Dialog dialog = this.f923q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.s
    public final void N(Bundle bundle) {
        Bundle bundle2;
        this.N = true;
        if (this.f923q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f923q0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.s
    public final void O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.O(layoutInflater, viewGroup, bundle);
        if (this.P != null || this.f923q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f923q0.onRestoreInstanceState(bundle2);
    }

    public final void b0(boolean z4, boolean z10) {
        if (this.f925s0) {
            return;
        }
        this.f925s0 = true;
        this.f926t0 = false;
        Dialog dialog = this.f923q0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f923q0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f913f0.getLooper()) {
                    onDismiss(this.f923q0);
                } else {
                    this.f913f0.post(this.f914g0);
                }
            }
        }
        this.f924r0 = true;
        if (this.f920n0 >= 0) {
            i0 i0VarT = t();
            int i = this.f920n0;
            if (i < 0) {
                throw new IllegalArgumentException(da.v.f(i, "Bad id: "));
            }
            i0VarT.s(new h0(i0VarT, i, 1), false);
            this.f920n0 = -1;
            return;
        }
        a aVar = new a(t());
        aVar.j(this);
        if (z4) {
            aVar.e(true);
        } else {
            aVar.e(false);
        }
    }

    public Dialog c0() {
        if (i0.D(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(U(), this.k0);
    }

    public final void d0() {
        if (i0.D(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to 0, 2132017496");
        }
        this.f917j0 = 0;
        this.k0 = R.style.KryptProxyDialog;
    }

    public void e0(i0 i0Var, String str) {
        this.f925s0 = false;
        this.f926t0 = true;
        i0Var.getClass();
        a aVar = new a(i0Var);
        aVar.h(0, this, str, 1);
        aVar.e(false);
    }

    @Override // androidx.fragment.app.s
    public final qd.b m() {
        return new k(this, new m(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f924r0) {
            return;
        }
        if (i0.D(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        b0(true, true);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
