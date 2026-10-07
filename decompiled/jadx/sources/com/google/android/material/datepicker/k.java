package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import x1.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f2428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2430c;

    public k(m mVar, v vVar, MaterialButton materialButton) {
        this.f2430c = mVar;
        this.f2428a = vVar;
        this.f2429b = materialButton;
    }

    @Override // x1.k0
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f2429b.getText());
        }
    }

    @Override // x1.k0
    public final void b(RecyclerView recyclerView, int i, int i10) {
        b bVar = this.f2428a.f2469d;
        m mVar = this.f2430c;
        int iM0 = i < 0 ? ((LinearLayoutManager) mVar.f2438m0.getLayoutManager()).M0() : ((LinearLayoutManager) mVar.f2438m0.getLayoutManager()).N0();
        Calendar calendarA = z.a(bVar.f2409a.f2455a);
        calendarA.add(2, iM0);
        mVar.f2435i0 = new r(calendarA);
        Calendar calendarA2 = z.a(bVar.f2409a.f2455a);
        calendarA2.add(2, iM0);
        calendarA2.set(5, 1);
        Calendar calendarA3 = z.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = z.f2473a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f2429b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
