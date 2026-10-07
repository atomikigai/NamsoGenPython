package l3;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.q f6555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6557d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6558f;

    public /* synthetic */ f0(jc.q qVar, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f6554a = i;
        this.f6555b = qVar;
        this.f6556c = obj;
        this.f6557d = obj2;
        this.e = obj3;
        this.f6558f = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6554a) {
            case 0:
                n3.c cVar = (n3.c) this.f6556c;
                g.f fVar = (g.f) this.f6557d;
                c3.j jVar = (c3.j) this.e;
                androidx.fragment.app.w wVar = (androidx.fragment.app.w) this.f6558f;
                jc.q qVar = this.f6555b;
                qVar.f5776a = cVar;
                r7.g.E(qVar, jVar, wVar);
                View currentFocus = fVar.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                g.f fVar2 = r7.g.f8212c;
                if (fVar2 != null) {
                    fVar2.dismiss();
                }
                break;
            default:
                a1 a1Var = (a1) this.f6556c;
                j3.c cVar2 = (j3.c) this.f6557d;
                Activity activity = (Activity) this.e;
                ArrayList arrayList = (ArrayList) this.f6558f;
                String str = (String) view.getTag();
                jc.q qVar2 = this.f6555b;
                qVar2.f5776a = str;
                android.support.v4.media.session.a.A(cVar2, activity, arrayList, qVar2, a1Var);
                ArrayList arrayListG = android.support.v4.media.session.a.G(qVar2, arrayList);
                a1Var.getClass();
                jc.i.e(arrayListG, "list");
                a1Var.e = arrayListG;
                a1Var.c();
                break;
        }
    }
}
