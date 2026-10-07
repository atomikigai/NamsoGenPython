package u1;

import android.adservices.topics.GetTopicsRequest;
import android.content.Context;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8783b;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, int i) {
        this.f8783b = i;
        switch (i) {
            case 1:
                i.e(context, "context");
                Object systemService = context.getSystemService((Class<Object>) s5.e.g());
                i.d(systemService, "context.getSystemService…opicsManager::class.java)");
                super(s5.e.c(systemService));
                break;
            default:
                i.e(context, "context");
                Object systemService2 = context.getSystemService((Class<Object>) s5.e.g());
                i.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                super(s5.e.c(systemService2));
                break;
        }
    }

    @Override // u1.f
    public GetTopicsRequest A(a aVar) {
        switch (this.f8783b) {
            case 1:
                i.e(aVar, "request");
                GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(aVar.f8778a).build();
                i.d(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild;
            default:
                return super.A(aVar);
        }
    }
}
