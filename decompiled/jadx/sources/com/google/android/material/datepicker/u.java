package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import java.util.WeakHashMap;
import q0.v0;
import x1.w0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f2467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f2468v;

    public u(LinearLayout linearLayout, boolean z4) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2467u = textView;
        WeakHashMap weakHashMap = v0.f7946a;
        new q0.a0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f2468v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z4) {
            return;
        }
        textView.setVisibility(8);
    }
}
