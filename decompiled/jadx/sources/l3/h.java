package l3;

import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i, int i10, int i11, yb.d dVar) {
        super(2, dVar);
        this.f6564a = iVar;
        this.f6565b = i;
        this.f6566c = i10;
        this.f6567d = i11;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        return new h(this.f6564a, this.f6565b, this.f6566c, this.f6567d, dVar);
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((rc.a0) obj, (yb.d) obj2);
        ub.k kVar = ub.k.f9073a;
        hVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        zb.a aVar = zb.a.f11555a;
        r7.g.G(obj);
        i iVar = this.f6564a;
        ArrayList arrayList = iVar.A0;
        j3.a aVar2 = iVar.f6570v0;
        ub.k kVar = ub.k.f9073a;
        if (aVar2 != null && !iVar.E0.get()) {
            j3.a aVar3 = iVar.f6570v0;
            jc.i.b(aVar3);
            ProgressBar progressBar = aVar3.h;
            int i = this.f6565b;
            progressBar.setProgress(i);
            j3.a aVar4 = iVar.f6570v0;
            jc.i.b(aVar4);
            TextView textView = aVar4.f5651m;
            Integer num = new Integer(i);
            int i10 = this.f6566c;
            textView.setText(iVar.w(R.string.free_proxy_testing_progress, num, new Integer(i10), new Integer(this.f6567d)));
            h3.n nVar = iVar.B0;
            if (nVar != null) {
                nVar.c();
            }
            if (i >= i10) {
                j3.a aVar5 = iVar.f6570v0;
                jc.i.b(aVar5);
                aVar5.h.setVisibility(8);
                if (arrayList.isEmpty()) {
                    j3.a aVar6 = iVar.f6570v0;
                    jc.i.b(aVar6);
                    aVar6.f5651m.setText(iVar.v(R.string.free_proxy_no_results));
                    j3.a aVar7 = iVar.f6570v0;
                    jc.i.b(aVar7);
                    aVar7.f5646f.setVisibility(0);
                    return kVar;
                }
                j3.a aVar8 = iVar.f6570v0;
                jc.i.b(aVar8);
                aVar8.f5651m.setText(iVar.w(R.string.free_proxy_testing_done, new Integer(arrayList.size())));
            }
        }
        return kVar;
    }
}
