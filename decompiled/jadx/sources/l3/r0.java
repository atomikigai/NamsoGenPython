package l3;

import android.view.View;
import android.widget.Button;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6660a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.f f6661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.o f6662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f6663d;
    public final /* synthetic */ androidx.fragment.app.w e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jc.o f6664f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ jc.o f6666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ jc.q f6667t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6668u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j3.c f6669v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jc.q f6670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f6671x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f6672y;

    public /* synthetic */ r0(g.f fVar, jc.o oVar, AtomicBoolean atomicBoolean, androidx.fragment.app.w wVar, jc.o oVar2, ArrayList arrayList, jc.o oVar3, jc.q qVar, ArrayList arrayList2, j3.c cVar, jc.q qVar2, a1 a1Var, String str) {
        this.f6661b = fVar;
        this.f6662c = oVar;
        this.f6663d = atomicBoolean;
        this.e = wVar;
        this.f6664f = oVar2;
        this.f6665r = arrayList;
        this.f6666s = oVar3;
        this.f6667t = qVar;
        this.f6668u = arrayList2;
        this.f6669v = cVar;
        this.f6670w = qVar2;
        this.f6671x = a1Var;
        this.f6672y = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6660a) {
            case 0:
                jc.o oVar = this.f6662c;
                if (!oVar.f5774a) {
                    jc.o oVar2 = this.f6664f;
                    if (!oVar2.f5774a) {
                        android.support.v4.media.session.a.E(this.f6665r, this.f6668u, this.e, oVar, oVar2, this.f6663d, this.f6669v, this.f6671x, this.f6661b, this.f6667t, this.f6670w, this.f6666s, this.f6672y, null, 114688);
                    }
                }
                break;
            case 1:
                g.f fVar = this.f6661b;
                Button buttonB = fVar.b(-2);
                jc.o oVar3 = this.f6662c;
                boolean z4 = oVar3.f5774a;
                androidx.fragment.app.w wVar = this.e;
                if (!z4) {
                    jc.o oVar4 = this.f6664f;
                    if (!oVar4.f5774a) {
                        fVar.dismiss();
                    } else {
                        ArrayList arrayList = this.f6665r;
                        boolean zIsEmpty = arrayList.isEmpty();
                        jc.o oVar5 = this.f6666s;
                        jc.q qVar = this.f6667t;
                        ArrayList arrayList2 = this.f6668u;
                        j3.c cVar = this.f6669v;
                        a1 a1Var = this.f6671x;
                        if (!zIsEmpty) {
                            android.support.v4.media.session.a.D(oVar5, oVar3, oVar4, qVar, arrayList2, arrayList, cVar, true, this.f6670w, wVar, a1Var, fVar, this.f6672y);
                        } else {
                            android.support.v4.media.session.a.C(cVar, oVar5, oVar3, fVar, wVar, oVar4, a1Var, arrayList2, qVar);
                        }
                    }
                } else {
                    this.f6663d.set(true);
                    buttonB.setEnabled(false);
                    buttonB.setText(wVar.getString(R.string.proxy_import_stopping));
                }
                break;
            case 2:
                jc.o oVar6 = this.f6662c;
                if (!oVar6.f5774a) {
                    ArrayList arrayList3 = this.f6665r;
                    if (!arrayList3.isEmpty()) {
                        android.support.v4.media.session.a.E(this.f6668u, arrayList3, this.e, oVar6, this.f6664f, this.f6663d, this.f6669v, this.f6671x, this.f6661b, this.f6667t, this.f6670w, this.f6666s, this.f6672y, null, 98304);
                    }
                }
                break;
            default:
                jc.o oVar7 = this.f6662c;
                if (!oVar7.f5774a) {
                    jc.q qVar2 = this.f6667t;
                    if (!((List) qVar2.f5776a).isEmpty()) {
                        android.support.v4.media.session.a.E(this.f6665r, this.f6668u, this.e, oVar7, this.f6664f, this.f6663d, this.f6669v, this.f6671x, this.f6661b, this.f6670w, qVar2, this.f6666s, this.f6672y, vb.i.n0((Iterable) qVar2.f5776a), 16384);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ r0(jc.o oVar, ArrayList arrayList, ArrayList arrayList2, androidx.fragment.app.w wVar, jc.o oVar2, AtomicBoolean atomicBoolean, j3.c cVar, a1 a1Var, g.f fVar, jc.q qVar, jc.q qVar2, jc.o oVar3, String str) {
        this.f6662c = oVar;
        this.f6665r = arrayList;
        this.f6668u = arrayList2;
        this.e = wVar;
        this.f6664f = oVar2;
        this.f6663d = atomicBoolean;
        this.f6669v = cVar;
        this.f6671x = a1Var;
        this.f6661b = fVar;
        this.f6667t = qVar;
        this.f6670w = qVar2;
        this.f6666s = oVar3;
        this.f6672y = str;
    }

    public /* synthetic */ r0(jc.o oVar, jc.o oVar2, ArrayList arrayList, ArrayList arrayList2, androidx.fragment.app.w wVar, AtomicBoolean atomicBoolean, j3.c cVar, a1 a1Var, g.f fVar, jc.q qVar, jc.q qVar2, jc.o oVar3, String str) {
        this.f6662c = oVar;
        this.f6664f = oVar2;
        this.f6665r = arrayList;
        this.f6668u = arrayList2;
        this.e = wVar;
        this.f6663d = atomicBoolean;
        this.f6669v = cVar;
        this.f6671x = a1Var;
        this.f6661b = fVar;
        this.f6667t = qVar;
        this.f6670w = qVar2;
        this.f6666s = oVar3;
        this.f6672y = str;
    }

    public /* synthetic */ r0(jc.o oVar, jc.q qVar, ArrayList arrayList, ArrayList arrayList2, androidx.fragment.app.w wVar, jc.o oVar2, AtomicBoolean atomicBoolean, j3.c cVar, a1 a1Var, g.f fVar, jc.q qVar2, jc.o oVar3, String str) {
        this.f6662c = oVar;
        this.f6667t = qVar;
        this.f6665r = arrayList;
        this.f6668u = arrayList2;
        this.e = wVar;
        this.f6664f = oVar2;
        this.f6663d = atomicBoolean;
        this.f6669v = cVar;
        this.f6671x = a1Var;
        this.f6661b = fVar;
        this.f6670w = qVar2;
        this.f6666s = oVar3;
        this.f6672y = str;
    }
}
