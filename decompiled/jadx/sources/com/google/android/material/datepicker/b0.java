package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import java.util.Locale;
import x1.w0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends x1.z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f2415d;

    public b0(m mVar) {
        this.f2415d = mVar;
    }

    @Override // x1.z
    public final int a() {
        return this.f2415d.f2434h0.f2413f;
    }

    @Override // x1.z
    public final void e(w0 w0Var, int i) {
        m mVar = this.f2415d;
        int i10 = mVar.f2434h0.f2409a.f2457c + i;
        TextView textView = ((a0) w0Var).f2408u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        Context context = textView.getContext();
        textView.setContentDescription(z.b().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10)));
        c cVar = mVar.k0;
        if (z.b().get(1) == i10) {
            z9.c cVar2 = cVar.f2417b;
        } else {
            z9.c cVar3 = cVar.f2416a;
        }
        throw null;
    }

    @Override // x1.z
    public final w0 f(ViewGroup viewGroup) {
        return new a0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
