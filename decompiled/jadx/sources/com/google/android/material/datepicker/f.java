package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f2424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2425c;

    public /* synthetic */ f(m mVar, v vVar, int i) {
        this.f2423a = i;
        this.f2425c = mVar;
        this.f2424b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2423a) {
            case 0:
                m mVar = this.f2425c;
                int iN0 = ((LinearLayoutManager) mVar.f2438m0.getLayoutManager()).N0() - 1;
                if (iN0 >= 0) {
                    Calendar calendarA = z.a(this.f2424b.f2469d.f2409a.f2455a);
                    calendarA.add(2, iN0);
                    mVar.b0(new r(calendarA));
                }
                break;
            default:
                m mVar2 = this.f2425c;
                int iM0 = ((LinearLayoutManager) mVar2.f2438m0.getLayoutManager()).M0() + 1;
                if (iM0 < mVar2.f2438m0.getAdapter().a()) {
                    Calendar calendarA2 = z.a(this.f2424b.f2469d.f2409a.f2455a);
                    calendarA2.add(2, iM0);
                    mVar2.b0(new r(calendarA2));
                }
                break;
        }
    }
}
