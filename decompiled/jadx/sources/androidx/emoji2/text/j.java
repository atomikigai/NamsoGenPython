package androidx.emoji2.text;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.common.api.internal.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f770c;

    public /* synthetic */ j(Object obj, int i, int i10) {
        this.f768a = i10;
        this.f770c = obj;
        this.f769b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f768a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f770c;
                int size = arrayList.size();
                int i = 0;
                if (this.f769b == 1) {
                    while (i < size) {
                        ((i) arrayList.get(i)).a();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((i) arrayList.get(i)).getClass();
                        i++;
                    }
                }
                break;
            case 1:
                ((SystemForegroundService) this.f770c).e.cancel(this.f769b);
                break;
            case 2:
                ((f0) this.f770c).f(this.f769b);
                break;
            case 3:
                ((com.google.android.material.datepicker.m) this.f770c).f2438m0.j0(this.f769b);
                break;
            case 4:
                g0.b bVar = (g0.b) ((a5.b) this.f770c).f188b;
                if (bVar != null) {
                    bVar.g(this.f769b);
                }
                break;
            default:
                ((RecyclerView) this.f770c).j0(this.f769b);
                break;
        }
    }

    public j(int i, s2.l lVar) {
        this.f768a = 5;
        this.f769b = i;
        this.f770c = lVar;
    }

    public j(List list, int i, Throwable th) {
        this.f768a = 0;
        qd.b.j(list, "initCallbacks cannot be null");
        this.f770c = new ArrayList(list);
        this.f769b = i;
    }
}
