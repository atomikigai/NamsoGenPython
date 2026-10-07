package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import q0.e1;
import q0.f1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f5631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1 f5632d;
    public boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5630b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f5633f = new j(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5629a = new ArrayList();

    public final void a() {
        if (this.e) {
            ArrayList arrayList = this.f5629a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((e1) obj).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList arrayList = this.f5629a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e1 e1Var = (e1) obj;
            long j4 = this.f5630b;
            if (j4 >= 0) {
                e1Var.c(j4);
            }
            Interpolator interpolator = this.f5631c;
            if (interpolator != null && (view = (View) e1Var.f7895a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f5632d != null) {
                e1Var.d(this.f5633f);
            }
            View view2 = (View) e1Var.f7895a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
