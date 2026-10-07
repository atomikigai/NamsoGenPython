package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import q0.e2;
import q0.f2;
import q0.g0;
import q0.g2;
import q0.j0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p<S> extends androidx.fragment.app.l {
    public m A0;
    public int B0;
    public CharSequence C0;
    public boolean D0;
    public int E0;
    public int F0;
    public CharSequence G0;
    public int H0;
    public CharSequence I0;
    public int J0;
    public CharSequence K0;
    public int L0;
    public CharSequence M0;
    public TextView N0;
    public CheckableImageButton O0;
    public b9.g P0;
    public boolean Q0;
    public CharSequence R0;
    public CharSequence S0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final LinkedHashSet f2448v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final LinkedHashSet f2449w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f2450x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public w f2451y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public b f2452z0;

    public p() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2448v0 = new LinkedHashSet();
        this.f2449w0 = new LinkedHashSet();
    }

    public static int g0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = z.b();
        calendarB.set(5, 1);
        Calendar calendarA = z.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean h0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a.a.n(context, m.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z4;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle == null) {
            bundle = this.f977f;
        }
        this.f2450x0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2452z0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.B0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.E0 = bundle.getInt("INPUT_MODE_KEY");
        this.F0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.H0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.J0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.L0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.C0;
        if (text == null) {
            text = U().getResources().getText(this.B0);
        }
        this.R0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.S0 = text;
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.D0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.D0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(g0(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(g0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = v0.f7946a;
        g0.f(textView, 1);
        this.O0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.N0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.O0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.O0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, com.bumptech.glide.d.r(context, R.drawable.material_ic_calendar_black_24dp));
        int i = 0;
        stateListDrawable.addState(new int[0], com.bumptech.glide.d.r(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.O0.setChecked(this.E0 != 0);
        v0.l(this.O0, null);
        CheckableImageButton checkableImageButton2 = this.O0;
        this.O0.setContentDescription(this.E0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.O0.setOnClickListener(new n(this, i));
        f0();
        throw null;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void J(Bundle bundle) {
        super.J(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2450x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f2452z0;
        a aVar = new a();
        int i = a.f2406b;
        int i10 = a.f2406b;
        long j4 = bVar.f2409a.f2459f;
        long j10 = bVar.f2410b.f2459f;
        aVar.f2407a = Long.valueOf(bVar.f2412d.f2459f);
        int i11 = bVar.e;
        d dVar = bVar.f2411c;
        m mVar = this.A0;
        r rVar = mVar == null ? null : mVar.f2435i0;
        if (rVar != null) {
            aVar.f2407a = Long.valueOf(rVar.f2459f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        r rVarB = r.b(j4);
        r rVarB2 = r.b(j10);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f2407a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(rVarB, rVarB2, dVar2, l2 == null ? null : r.b(l2.longValue()), i11));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.B0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.C0);
        bundle.putInt("INPUT_MODE_KEY", this.E0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.F0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.G0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.H0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.I0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.J0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.K0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.L0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.M0);
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void K() {
        w wVar;
        n9.b f2Var;
        n9.b f2Var2;
        super.K();
        Dialog dialog = this.f923q0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.D0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.P0);
            if (!this.Q0) {
                View viewFindViewById = V().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListA = q8.a.a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z4 = false;
                boolean z10 = numValueOf == null || numValueOf.intValue() == 0;
                int iP = com.bumptech.glide.c.p(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    numValueOf = Integer.valueOf(iP);
                }
                jd.d.F(window, false);
                window.getContext();
                int iD = i < 27 ? h0.a.d(com.bumptech.glide.c.p(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z11 = com.bumptech.glide.c.w(0) || com.bumptech.glide.c.w(numValueOf.intValue());
                wa.d dVar = new wa.d(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    f2Var = new g2(window, dVar);
                } else {
                    f2Var = i10 >= 26 ? new f2(window, dVar) : new e2(window, dVar);
                }
                f2Var.A(z11);
                boolean zW = com.bumptech.glide.c.w(iP);
                if (com.bumptech.glide.c.w(iD) || (iD == 0 && zW)) {
                    z4 = true;
                }
                wa.d dVar2 = new wa.d(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    f2Var2 = new g2(window, dVar2);
                } else {
                    f2Var2 = i11 >= 26 ? new f2(window, dVar2) : new e2(window, dVar2);
                }
                f2Var2.z(z4);
                o oVar = new o(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = v0.f7946a;
                j0.u(viewFindViewById, oVar);
                this.Q0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = u().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.P0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f923q0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new p8.a(dialog2, rect));
        }
        U();
        int i12 = this.f2450x0;
        if (i12 == 0) {
            f0();
            throw null;
        }
        f0();
        b bVar = this.f2452z0;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i12);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f2412d);
        mVar.Y(bundle);
        this.A0 = mVar;
        if (this.E0 == 1) {
            wVar = mVar;
            f0();
            b bVar2 = this.f2452z0;
            q qVar = new q();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i12);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            qVar.Y(bundle2);
            wVar = qVar;
        }
        wVar = mVar;
        this.f2451y0 = wVar;
        this.N0.setText((this.E0 == 1 && u().getConfiguration().orientation == 2) ? this.S0 : this.R0);
        f0();
        throw null;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void L() {
        this.f2451y0.f2471f0.clear();
        super.L();
    }

    @Override // androidx.fragment.app.l
    public final Dialog c0() {
        Context contextU = U();
        U();
        int i = this.f2450x0;
        if (i == 0) {
            f0();
            throw null;
        }
        Dialog dialog = new Dialog(contextU, i);
        Context context = dialog.getContext();
        this.D0 = h0(context, android.R.attr.windowFullscreen);
        this.P0 = new b9.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d8.a.f3028t, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.P0.i(context);
        this.P0.k(ColorStateList.valueOf(color));
        b9.g gVar = this.P0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = v0.f7946a;
        gVar.j(j0.i(decorView));
        return dialog;
    }

    public final void f0() {
        if (this.f977f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2448v0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2449w0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.P;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
