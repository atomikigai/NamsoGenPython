package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2419d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f2420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2422c;

    static {
        f2419d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar calendarC = z.c(null);
        this.f2420a = calendarC;
        this.f2421b = calendarC.getMaximum(7);
        this.f2422c = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2421b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i10 = this.f2421b;
        if (i >= i10) {
            return null;
        }
        int i11 = i + this.f2422c;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i + this.f2422c;
        int i11 = this.f2421b;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f2420a;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f2419d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar calendarC = z.c(null);
        this.f2420a = calendarC;
        this.f2421b = calendarC.getMaximum(7);
        this.f2422c = i;
    }
}
