package u1;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import jc.i;
import jd.l;
import m0.h;
import r7.g;
import rc.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopicsManager f8788a;

    public f(TopicsManager topicsManager) {
        this.f8788a = topicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object C(f fVar, a aVar, yb.d dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i = eVar.f8787d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f8787d = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar, dVar);
            }
        } else {
            eVar = new e(fVar, dVar);
        }
        Object objR = eVar.f8785b;
        zb.a aVar2 = zb.a.f11555a;
        int i10 = eVar.f8787d;
        if (i10 == 0) {
            g.G(objR);
            GetTopicsRequest getTopicsRequestA = fVar.A(aVar);
            eVar.f8784a = fVar;
            eVar.f8787d = 1;
            k kVar = new k(1, qd.b.r(eVar));
            kVar.s();
            fVar.f8788a.getTopics(getTopicsRequestA, new androidx.webkit.a(3), new h(kVar));
            objR = kVar.r();
            if (objR == aVar2) {
                return aVar2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = eVar.f8784a;
            g.G(objR);
        }
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) objR;
        fVar.getClass();
        i.e(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new c(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new b(arrayList);
    }

    public GetTopicsRequest A(a aVar) {
        i.e(aVar, "request");
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName("com.google.android.gms.ads").build();
        i.d(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public Object B(a aVar, yb.d dVar) {
        return C(this, aVar, dVar);
    }
}
