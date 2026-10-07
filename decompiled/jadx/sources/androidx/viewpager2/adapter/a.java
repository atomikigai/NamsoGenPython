package androidx.viewpager2.adapter;

import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import s2.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1193b;

    public /* synthetic */ a(Object obj, int i) {
        this.f1192a = i;
        this.f1193b = obj;
    }

    @Override // s2.i
    public void a(int i) {
        switch (this.f1192a) {
            case 0:
                ((c) this.f1193b).c(false);
                return;
            case 1:
            default:
                return;
            case 2:
                try {
                    ArrayList arrayList = (ArrayList) this.f1193b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((i) obj).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
        }
    }

    @Override // s2.i
    public void b(int i, float f10, int i10) {
        switch (this.f1192a) {
            case 2:
                try {
                    ArrayList arrayList = (ArrayList) this.f1193b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((i) obj).b(i, f10, i10);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    @Override // s2.i
    public final void c(int i) {
        switch (this.f1192a) {
            case 0:
                ((c) this.f1193b).c(false);
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) this.f1193b;
                boolean z4 = mainActivity.f1288e0;
                mainActivity.f1288e0 = i == 1;
                mainActivity.t();
                if (z4 && !mainActivity.f1288e0) {
                    mainActivity.x();
                }
                ChipNavigationBar chipNavigationBar = mainActivity.L;
                if (chipNavigationBar == null) {
                    jc.i.i("bottomNav");
                    throw null;
                }
                int i10 = R.id.navigation_home;
                if (i != 0) {
                    if (i == 1) {
                        i10 = R.id.navigation_browser;
                    } else if (i == 2) {
                        i10 = R.id.navigation_dashboard;
                    } else if (i == 3) {
                        i10 = R.id.navigation_notes;
                    } else if (i == 4) {
                        i10 = R.id.navigation_temp_mail;
                    }
                }
                chipNavigationBar.o(i10, true);
                return;
            default:
                try {
                    ArrayList arrayList = (ArrayList) this.f1193b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((i) obj).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
        }
    }

    public a() {
        this.f1192a = 2;
        this.f1193b = new ArrayList(3);
    }
}
