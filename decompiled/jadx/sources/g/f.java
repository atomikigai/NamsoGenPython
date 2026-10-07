package g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import app.namso_gen.spacehowen.R;
import java.util.WeakHashMap;
import l.v1;
import q0.k0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.activity.n implements DialogInterface, h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f4018d;
    public final v e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f4019f;

    /* JADX WARN: Type inference failed for: r2v2, types: [g.v] */
    public f(ContextThemeWrapper contextThemeWrapper, int i) {
        int i10;
        int iE = e(contextThemeWrapper, i);
        if (iE == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = iE;
        }
        super(contextThemeWrapper, i10);
        this.e = new q0.m() { // from class: g.v
            @Override // q0.m
            public final boolean a(KeyEvent keyEvent) {
                return this.f4110a.g(keyEvent);
            }
        };
        l lVarC = c();
        if (iE == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iE = typedValue2.resourceId;
        }
        ((u) lVarC).f4091e0 = iE;
        lVarC.h();
        this.f4019f = new e(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u uVar = (u) c();
        uVar.A();
        ((ViewGroup) uVar.L.findViewById(android.R.id.content)).addView(view, layoutParams);
        uVar.f4107x.a(uVar.f4106w.getCallback());
    }

    public final Button b(int i) {
        e eVar = this.f4019f;
        if (i == -3) {
            return eVar.f4004o;
        }
        if (i == -2) {
            return eVar.f4001l;
        }
        if (i == -1) {
            return eVar.i;
        }
        eVar.getClass();
        return null;
    }

    public final l c() {
        if (this.f4018d == null) {
            a0 a0Var = l.f4051a;
            this.f4018d = new u(getContext(), getWindow(), this, this);
        }
        return this.f4018d;
    }

    public final void d(Bundle bundle) {
        c().d();
        super.onCreate(bundle);
        c().h();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return com.bumptech.glide.d.j(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().p(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        u uVar = (u) c();
        uVar.A();
        return uVar.f4106w.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().e();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        d(bundle);
        e eVar = this.f4019f;
        eVar.f3994b.setContentView(eVar.f4015z);
        Context context = eVar.f3993a;
        Window window = eVar.f3995c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = eVar.f3998g;
        if (view == null) {
            view = null;
        }
        boolean z4 = view != null;
        if (!z4 || !e.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f3997f != null) {
                ((LinearLayout.LayoutParams) ((v1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = e.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = e.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = e.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.f4007r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f4007r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        eVar.f4011v = textView;
        if (textView != null) {
            CharSequence charSequence = eVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                eVar.f4007r.removeView(eVar.f4011v);
                if (eVar.f3997f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) eVar.f4007r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(eVar.f4007r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(eVar.f3997f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        eVar.i = button;
        com.google.android.material.datepicker.l lVar = eVar.F;
        button.setOnClickListener(lVar);
        if (TextUtils.isEmpty(eVar.f3999j)) {
            eVar.i.setVisibility(8);
            i = 0;
        } else {
            eVar.i.setText(eVar.f3999j);
            eVar.i.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        eVar.f4001l = button2;
        button2.setOnClickListener(lVar);
        if (TextUtils.isEmpty(eVar.f4002m)) {
            eVar.f4001l.setVisibility(8);
        } else {
            eVar.f4001l.setText(eVar.f4002m);
            eVar.f4001l.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        eVar.f4004o = button3;
        button3.setOnClickListener(lVar);
        if (TextUtils.isEmpty(eVar.f4005p)) {
            eVar.f4004o.setVisibility(8);
        } else {
            eVar.f4004o.setText(eVar.f4005p);
            eVar.f4004o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = eVar.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = eVar.f4001l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = eVar.f4004o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (eVar.f4012w != null) {
            viewGroupB.addView(eVar.f4012w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f4009t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(eVar.f3996d) || !eVar.D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f4009t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f4010u = textView2;
                textView2.setText(eVar.f3996d);
                Drawable drawable = eVar.f4008s;
                if (drawable != null) {
                    eVar.f4009t.setImageDrawable(drawable);
                } else {
                    eVar.f4010u.setPadding(eVar.f4009t.getPaddingLeft(), eVar.f4009t.getPaddingTop(), eVar.f4009t.getPaddingRight(), eVar.f4009t.getPaddingBottom());
                    eVar.f4009t.setVisibility(8);
                }
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i10 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z11 = viewGroupB3.getVisibility() != 8;
        if (!z11 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f4007r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (eVar.e == null && eVar.f3997f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f3997f;
        if (alertController$RecycleListView != null && (!z11 || i10 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i10 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f420a, alertController$RecycleListView.getPaddingRight(), z11 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f421b);
        }
        if (!z10) {
            View view2 = eVar.f3997f;
            if (view2 == null) {
                view2 = eVar.f4007r;
            }
            if (view2 != null) {
                int i11 = z11 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = v0.f7946a;
                k0.d(view2, i10 | i11, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f3997f;
        if (alertController$RecycleListView2 == null || (listAdapter = eVar.f4013x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i12 = eVar.f4014y;
        if (i12 > -1) {
            alertController$RecycleListView2.setItemChecked(i12, true);
            alertController$RecycleListView2.setSelection(i12);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4019f.f4007r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4019f.f4007r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.n, android.app.Dialog
    public final void onStop() {
        super.onStop();
        u uVar = (u) c();
        uVar.E();
        h0 h0Var = uVar.f4109z;
        if (h0Var != null) {
            h0Var.f4044t = false;
            j.k kVar = h0Var.f4043s;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        c().m(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().p(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        c().n(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().o(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        f(charSequence);
        e eVar = this.f4019f;
        eVar.f3996d = charSequence;
        TextView textView = eVar.f4010u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
