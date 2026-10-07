package t1;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import jc.i;
import m0.h;
import rc.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MeasurementManager f8523a;

    public b(Context context) {
        i.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
        i.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f8523a = (MeasurementManager) systemService;
    }

    public Object t(a aVar, yb.d dVar) {
        new k(1, qd.b.r(dVar)).s();
        new DeletionRequest.Builder();
        throw null;
    }

    public Object u(yb.d dVar) {
        k kVar = new k(1, qd.b.r(dVar));
        kVar.s();
        this.f8523a.getMeasurementApiStatus(new androidx.webkit.a(3), new h(kVar));
        Object objR = kVar.r();
        zb.a aVar = zb.a.f11555a;
        return objR;
    }

    public Object v(Uri uri, InputEvent inputEvent, yb.d dVar) {
        k kVar = new k(1, qd.b.r(dVar));
        kVar.s();
        this.f8523a.registerSource(uri, inputEvent, new androidx.webkit.a(3), new h(kVar));
        Object objR = kVar.r();
        return objR == zb.a.f11555a ? objR : ub.k.f9073a;
    }

    public Object w(Uri uri, yb.d dVar) {
        k kVar = new k(1, qd.b.r(dVar));
        kVar.s();
        this.f8523a.registerTrigger(uri, new androidx.webkit.a(3), new h(kVar));
        Object objR = kVar.r();
        return objR == zb.a.f11555a ? objR : ub.k.f9073a;
    }

    public Object x(c cVar, yb.d dVar) {
        new k(1, qd.b.r(dVar)).s();
        throw null;
    }

    public Object y(d dVar, yb.d dVar2) {
        new k(1, qd.b.r(dVar2)).s();
        throw null;
    }
}
